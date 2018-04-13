/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Scanner;

public class DogData {

    int used = 0;
    Dog[] dg = new Dog[100];
    Scanner sc = new Scanner(System.in);

    public void addNewDog() {
        String name;
        String color;
        double height;
        int id;
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter height: ");
        height = Validate.getDouble();
        System.out.print("Enter color: ");
        color = sc.nextLine();
        do {
            System.out.print("Enter id: ");
            id = Validate.getInteger();
            if (isDuplicate(id)) {
                System.out.println("ID has already existed!");
            }
        } while (isDuplicate(id));
        dg[used] = new Dog(name, height, color, id);
        used++;
    }

    public void viewAllDogs() {
        System.out.println("Name\t|\tHeight\t|\tColor\t|\tID");
        System.out.println("____________________________________________________");
        for (int i = 0; i < used; i++) {
            System.out.println(dg[i].info());
        }
        sc.nextLine();
    }

    public void findADog() {
        int id;
        boolean flag = false;
        System.out.print("Input id: ");
        id = Validate.getInteger();
        for (int i = 0; i < used; i++) {
            if (id == dg[i].getID()) {
                System.out.println("Name\t|\tHeight\t|\tColor\t|\tID");
                System.err.println(dg[i].info());
                flag = true;
                sc.nextLine();
            }
        }
        if (!flag) {
            System.out.println("NOT FOUND");
            sc.nextLine();
        }
    }

    public void updateDog() {
        int id;
        String name;
        String color;
        double height;
        boolean flag = false;
        do {
            System.out.print("Input id: ");
            id = Validate.getInteger();
            for (int i = 0; i < used; i++) {
                if (id == dg[i].getID()) {
                    System.out.print("Enter name: ");
                    name = sc.nextLine();
                    dg[i].setName(name);
                    System.out.print("Enter height: ");
                    height = Validate.getDouble();
                    dg[i].setHeight(height);
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    dg[i].setColor(color);
                    System.out.println("UPDATE SUCCESSFULLY");
                    System.out.println("Name\t|\tHeight\t|\tColor\t|\tID");
                    System.err.println(dg[i].info());
                    flag = true;
                    sc.nextLine();
                }
            }
            if (!flag) {
                System.out.println("NOT FOUND, please input again!");
            }
        } while (!flag);
    }

    Boolean isDuplicate(int id) {
        if (used == 0) {
            return false;
        }
        for (int i = 0; i < used; i++) {
            if (id == dg[i].getID()) {
                return true;
            }
        }
        return false;
    }

}
