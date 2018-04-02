//Exercise 1: Input an integer n, the program will show the first n primes
package ex1;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, count = 0;
        boolean flag = true;
        do {
            try {
                do {  //Check input is positive number or not
                    System.out.print("Enter integer n: ");
                    n = Integer.parseInt(sc.nextLine());
                    if (n <= 0) {
                        System.out.println("Please input a positive number!");
                    }
                } while (n <= 0);
                int num = 2;
                while (count != n) {
                    boolean prime = true;
                    for (int i = 2; i <= Math.sqrt(num); i++) { //Check if num is prime or not
                        if (num % i == 0) {
                            prime = false;
                            break;
                        }
                    }
                    if (prime) {
                        count++;
                        System.out.printf("%d ", num); //Print prime num
                    }
                    num++;
                }
                flag = false;
            } catch (Exception ex) {
                System.out.println("Please input a number!");
            }
        } while (flag);
    }
}
