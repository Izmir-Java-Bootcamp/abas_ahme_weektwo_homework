package com.kodluyoruz.weektwo;

import com.kodluyoruz.weektwo.entity.Product;
import com.kodluyoruz.weektwo.entity.Seller;
import com.kodluyoruz.weektwo.entity.cart.Cart;
import com.kodluyoruz.weektwo.entity.cart.CartItem;
import com.kodluyoruz.weektwo.entity.discount.Buy2Take3;
import com.kodluyoruz.weektwo.entity.discount.Discount;
import com.kodluyoruz.weektwo.entity.discount.PercentageDiscount;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
@RequiredArgsConstructor
public class Demo implements CommandLineRunner {

    private final Scanner scanner;
    private Discount discount = null;


    @Override
    public void run(String... args) throws Exception {

        System.out.println("Welcome to kodluyoruz shop");
        System.out.println("What’s your name?");

        String customerName = scanner.nextLine();
        System.out.println("Hi " + customerName + ". Please choose one of the following options:");
        System.out.println("");

        Cart cart = new Cart();

        while (true){

            System.out.println("Enter 1 to buy a product");
            System.out.println("Enter 0 to checkout and proceed with the payment");

            int option = Integer.parseInt(scanner.nextLine());

            if (option == 0) {
                break;
            }

            System.out.print("Product name : ");
            String productName = scanner.nextLine();

            System.out.print("Seller name : ");
            String sellerName = scanner.nextLine();

            System.out.print("Product price : ");
            int productPrice = Integer.parseInt(scanner.nextLine());

            System.out.print("Quantity : ");
            int quantity = Integer.parseInt(scanner.nextLine());

            System.out.print("Discount (enter 0 if no discount applies) : ");
            double discountAmount = Double.parseDouble(scanner.nextLine());

            System.out.print("Does Buy2Take3 apply?(Y/N) : ");
            boolean isBuy2Take3Applied = isBuy2Take3Applied(scanner.nextLine());


            Product product =  Product.builder().productName(productName).price(productPrice).build();
            Seller seller = new Seller(sellerName);

            CartItem cartItem = CartItem
                    .builder()
                    .product(product)
                    .seller(seller)
                    .quantity(quantity)
                    .build();


            if (discountAmount != 0 && isBuy2Take3Applied) {
                throw new IllegalArgumentException();
            }

            if (isBuy2Take3Applied) {
                discount = new Buy2Take3();
            }else if (discountAmount != 0) {
                discount = new PercentageDiscount(discountAmount);
            }

            cart.addItem(cartItem);


        }

    }

    private boolean isBuy2Take3Applied(String nextLine) {
        return nextLine.equalsIgnoreCase("y");
    }
}
