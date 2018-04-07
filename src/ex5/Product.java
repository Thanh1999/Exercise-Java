package ex5;

import java.util.Scanner;

public class Product {

    private String name;
    private double price;
    private String color;

    private double computeVAT() {
        double vat = this.price * 0.1;
        return vat;
    }

    public void inputProduct() {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        do {
            try {//Check Price
                do {
                    System.out.print("Enter price: ");
                    this.price = Double.parseDouble(sc.nextLine());
                    if (this.price <= 0) {
                        System.out.println("Error please input again!");
                    }
                } while (this.price <= 0);
                System.out.print("Enter color: ");
                this.color = sc.nextLine();
                flag = false;
            } catch (Exception ex) {
                System.out.println("Error please input again!");
            }
        } while (flag);
    }

    public String printProduct() {
        double vat = computeVAT();
        String s;
        if (this.price <= 0) {//Check input price
            s = String.format("Plese exit and input again!");
        } else {
            s = String.format("%s\t|\t%.2f\t|\t%s\t|\t%.1f", this.name, this.price, this.color, vat);
        }
        return s;
    }

    Product(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    Product() {
    }

}
