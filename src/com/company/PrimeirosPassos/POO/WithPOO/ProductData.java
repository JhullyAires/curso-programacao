package com.company.PrimeirosPassos.POO.WithPOO;

import com.company.PrimeirosPassos.POO.Entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class ProductData {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");

        //colocar agora uma variável auxiliar em cada um:
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Price: ");
        double price = scanner.nextDouble();
        //construtor que obriga o programador a informar os dados do produto durante a instanciação
        Product product = new Product(name, price);

        /* product.name = "Computer"; // não pode ser usado pq está encapsulado em private
        product.setName("Computer"); // para atualizar a variável;
        System.out.println("Updated name: " + product.getName()); // para chamar a variável name
        product.setPrice(1200.00);
        System.out.println("Updated price: " + product.getPrice()); // para chamar a variável name
        */

        System.out.println();
        //System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.print("Enter of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        System.out.println();
        System.out.print("Enter of products to be removed from stock: ");
        quantity = scanner.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated data: " + product);

        scanner.close();
    }
}
