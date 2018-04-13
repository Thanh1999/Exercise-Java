package ex6;

import java.util.Scanner;

class Dog {

    Scanner sc = new Scanner(System.in);
    private String name;
    private String color;
    private double height;

    public String info() {
        String s;
        s = String.format("%s\t|\t%.2f\t|\t%s", this.name, this.height, this.color);
        return s;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    Dog(String name, String color, double height) {//Constructor full field
        this.name = name;
        this.color = color;
        this.height = height;
    }

    Dog(String name, double height) {//Constructor 2 parameter
        this.name = name;
        this.height = height;
    }

    Dog() {//Constructor empty
    }
}
