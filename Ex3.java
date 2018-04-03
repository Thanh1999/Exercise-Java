//Excercise 3: Program menu: Array process
//Function 1: Sort and print array
//Function 2: Print min and max value in array
//Function 3: Calculate and print out average of elements divided by 3
package ex3;

import java.util.Scanner;
import java.util.Arrays;

public class Ex3 {

    static int checkNum() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                do {//Check positive number
                    System.out.print("Your answer: ");
                    n = Integer.parseInt(sc.nextLine());
                    if (n <= 0) {
                        System.out.println("Please input a positive number!");
                    }
                } while (n <= 0);
                return n;
            } catch (Exception ex) {//Check if inout is number or not
                System.out.println("Please input a number!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        int n, answer, i = 0;
        System.out.println("Enter the length of array: ");
        n = checkNum();
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            System.out.printf("Ener element %d: \n", i);
            a[i] = checkNum();
        }
        System.out.println("1. Sort and print array");
        System.out.println("2. Print min and max value in array");
        System.out.println("3. Calculate and print out average of elements divided by 3");
        do {
            answer = checkNum();
            if (answer == 1) {
                sortAndPrint(a);
            }
            if (answer == 2) {
                findMinMax(a);
            }
            if (answer == 3) {
                printAverageDevidedBy3(a);
            }
            if (answer > 3) {
                System.out.println("Error please input again!");
            }
        } while (answer > 3);
    }

    static void sortAndPrint(int[] a) {
        Arrays.sort(a);//Sort array
        System.out.println("After sort: " + Arrays.toString(a));
    }

    static void findMinMax(int[] a) {
        Arrays.sort(a);//After sort array, minimum number is the first, maximum numbeer is the lasr
        System.out.printf("Maximum number is %d\n", a[a.length - 1]);
        System.out.printf("Mnimum number is %d\n", a[0]);
    }

    static void printAverageDevidedBy3(int[] a) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0) {
                sum = sum + a[i];//sum of numbers divided by 3
                count++;//count number divided by 3
            }
        }
        if (count != 0) {//Check count
            System.out.printf("Average of elements divied by 3: %.2f\n", (sum / count));
        } else {
            System.out.println("Can't find any elements divided by 3!");
        }
    }
}
