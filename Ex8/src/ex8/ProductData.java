/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

import java.util.Scanner;

public class ProductData {

    int used = 0;
    Product[] pr = new Product[100];

    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        String color;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter price: ");
        price = Validate.getDouble();
        System.out.print("Enter color: ");
        color = sc.nextLine();
        do {
            System.out.print("Enter id: ");
            id = Validate.getInteger();
            if (isDuplicate(id)) {
                System.out.println("ID has already existed!!");
            }
        } while (isDuplicate(id));
        pr[used] = new Product(name, price, color, id);
        System.out.println("ADD SUCCESSFULLY!");
        used++;
    }

    public void viewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name\t|\tPrice\t|\tColor\t|\tID");
        System.out.println("_____________________________________________________");
        for (int i = 0; i < used; i++) {
            System.out.println(pr[i].printProduct());
            sc.nextLine();
        }
    }

    public void findProduct() {
        Scanner sc = new Scanner(System.in);
        int id;
        boolean flag = false;
        System.out.print("Input ID: ");
        id = Validate.getInteger();
        for (int i = 0; i < used; i++) {
            if (id == pr[i].getID()) {
                System.out.println(pr[i].printProduct());
                sc.nextLine();
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("NOT FOUND");
            sc.nextLine();
        }
    }

    public void updateProduct() {
        Scanner sc = new Scanner(System.in);
        int id;
        String name;
        double price;
        String color;
        boolean flag = false;
        do {
            System.out.print("Input ID: ");
            id = Validate.getInteger();
            for (int i = 0; i < used; i++) {
                if (id == pr[i].getID()) {
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    pr[i].setName(name);
                    System.out.print("Enter price: ");
                    price = Validate.getDouble();
                    pr[i].setPrice(price);
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    pr[i].setColor(color);
                    System.out.println("UPDATE SUCCESSFULLY!!");
                    System.out.println(pr[i].printProduct());
                    sc.nextLine();
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("NOT Found please input again!");
            }
        } while (!flag);
    }

    boolean isDuplicate(int id) {
        if (used == 0) {
            return false;
        }
        for (int i = 0; i < used; i++) {
            if (id == pr[i].getID()) {
                return true;
            }
        }
        return false;
    }
}
