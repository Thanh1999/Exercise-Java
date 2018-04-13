/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        ProductData data = new ProductData();
        int answer;
        do {
            System.out.println("1. Add new product");
            System.out.println("2. View all Product");
            System.out.println("3. Find a product by ID");
            System.out.println("4. Update product by ID");
            System.out.println("5. Exit");
            answer = Validate.getAnswer();
            switch (answer) {
                case 1:
                    data.addNewProduct();
                    break;
                case 2:
                    data.viewProduct();
                    break;
                case 3:
                    data.findProduct();
                    break;
                case 4:
                    data.updateProduct();
                    break;
                case 5:
                    return;
            }
        } while (answer != 5);
    }

}
