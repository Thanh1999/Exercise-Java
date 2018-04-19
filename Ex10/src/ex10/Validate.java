/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import java.util.Scanner;

/**
 *
 * @author Thanh
 */
public class Validate {

    public static int getInteger() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num > 0) {
                    return num;
                }
            } catch (Exception ex) {
                System.out.println("Error please input again!");
            }
        } while (true);
    }

    public static double getDouble() {
        Scanner sc = new Scanner(System.in);
        double num;
        do {
            try {//Check Double
                num = Double.parseDouble(sc.nextLine());
                if (num > 0) {
                    return num;
                }
            } catch (Exception ex) {
                System.out.println("Error please input again!");
            }
        } while (true);
    }

    public static int getBook() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            try {
                System.out.print("Enter your answer: ");
                answer = Integer.parseInt(sc.nextLine());
                if (1 <= answer && answer <= 2) {
                    return answer;
                }
            } catch (Exception ex) {
                System.out.println("Error please input again!");
            }
        } while (true);
    }

    public static int getAnswer() {
        Scanner sc = new Scanner(System.in);
        int answer;
        do {
            try {
                System.out.print("Enter your answer: ");
                answer = Integer.parseInt(sc.nextLine());
                if (1 <= answer && answer <= 5) {
                    return answer;
                }
            } catch (Exception ex) {
                System.out.println("Error please input again!");
            }
        } while (true);
    }

}
