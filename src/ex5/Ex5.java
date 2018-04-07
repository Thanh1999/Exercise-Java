//Exercise 5: Create class Product have private name: String, private price: double, private color: String
//Create three method: private computeVAT(), public inputProduct(), public printProduct()
//Create constructor full field ,constructor 2 parameter name, price and constructor empty
//Create at least 3 object, Using method created
//Print with format table
package ex5;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Product pr1 = new Product();
        Product pr2 = new Product("Baby", 2000);
        Product pr3 = new Product("Dog", 100, "Yellow");
        pr1.inputProduct();
        System.out.println("Name\t|\tPrice\t|\tColor\t|\tVAT");
        System.out.println("____________________________________________________");
        System.out.println(pr1.printProduct());
        System.out.println(pr2.printProduct());
        System.out.println(pr3.printProduct());
    }

}
