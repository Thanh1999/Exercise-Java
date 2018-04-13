package ex8;

import java.util.Scanner;

public class Product {

    private int id;
    private String name;
    private double price;
    private String color;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setID(int id) {
        this.id = id;
    }

    public int getID() {
        return id;

    }

    public String printProduct() {
        String s;
        s = String.format("%s\t|\t%.2f\t|\t%s\t|\t%d", this.name, this.price, this.color, this.id);
        return s;

    }

    Product() {

    }

    Product(String name, double price, String color, int id) {
        this.name = name;
        this.price = price;
        this.color = color;
        this.id = id;
    }
}
