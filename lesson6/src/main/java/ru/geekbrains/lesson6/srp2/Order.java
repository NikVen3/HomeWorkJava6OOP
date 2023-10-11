package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {
    private String clientName;
    private String product;
    private int qnt;
    private int price;

    public Order(String s, String s1, int i, int i1) {
    }

    // Your getters and constructor can go here...

    // ...  use setters to set Order properties
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClientName() {
        return null;
    }

    public String getProduct() {

        return null;
    }

    public String getQnt() {
        return null;
    }

    public String getPrice() {
        return null;
    }
}
