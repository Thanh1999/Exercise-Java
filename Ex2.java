//Exrcise 2: Show multiplication table of n 
package ex2;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        int n = 0, i = 1;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                do {
                    System.out.print("Enter n: ");
                    n = Integer.parseInt(sc.nextLine());//Input integer n
                    if (n < 0)//Check if n is positive number or not
                    {
                        System.out.println("Error please input again!");
                    }
                } while (n < 0);
                System.out.printf("Multiplication table of %d:\n", n);
                while (i <= 10) {//Print multiplication
                    String equal = "=";
                    String s = String.format("%-5dx%5d%5s%5d\n", n, i, equal, n * i);
                    System.out.println(s);
                    i++;
                }
                flag = false;//Loop until false
            } catch (Exception ex) {//Check if n is number or not
                System.out.println("Error please input again!");
            }
        } while (flag);
    }
}
