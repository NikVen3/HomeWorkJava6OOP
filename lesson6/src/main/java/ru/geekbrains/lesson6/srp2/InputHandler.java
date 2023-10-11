package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

class InputHandler {
    public static Order inputFromConsole() {
        Order order = new Order("", "", 0, 0);
        order.setClientName(prompt("Client name: "));
        order.setProduct(prompt("Product: "));
        order.setQnt(Integer.parseInt(prompt("Quantity: ")));
        order.setPrice(Integer.parseInt(prompt("Price: ")));
        return order;
    }

    private static String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}