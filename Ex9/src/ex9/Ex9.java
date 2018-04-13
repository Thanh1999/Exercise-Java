/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

import java.util.Scanner;

public class Ex9 {

    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        DogData data = new DogData();
        int answer;
        do {
            System.out.println("1. Add new Dog");
            System.out.println("2. View all Dogs");
            System.out.println("3. Find a Dog by ID");
            System.out.println("4. Update Dog");
            System.out.println("5. Exit");
            answer = Validate.getAnswer();
            switch (answer) {
                case 1:
                    data.addNewDog();
                    break;
                case 2:
                    data.viewAllDogs();
                    break;
                case 3:
                    data.findADog();
                    break;
                case 4:
                    data.updateDog();
                    break;
                case 5:
                    return;
            }
        } while (answer != 5);

    }

}
