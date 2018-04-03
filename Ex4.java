//Ex4: Print two arrays with format table and add new column Studenteducation
package ex4;

import java.util.Scanner;

public class Ex4 {

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

    static double checkMark() {
        Scanner sc = new Scanner(System.in);
        double mark;
        do {
            try {
                do {//Check mark
                    System.out.print("Enter mark: ");
                    mark = Double.parseDouble(sc.nextLine());
                    if (mark < 0 || mark > 10) {
                        System.out.println("Error please input again!");
                    }
                } while (mark < 0 || mark > 10);

                return mark;
            } catch (Exception ex) {//Check if inout is number or not
                System.out.println("Please input a number!");
            }
        } while (true);
    }

    public static void main(String[] args) {
        int i, n;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        n = checkNum();
        String[] name = new String[n];
        double[] mark = new double[n];
        for (i = 0; i < n; i++) {//Loop until n student
            System.out.printf("Enter name of student %d: ", i + 1);
            name[i] = sc.nextLine();//Check name
            mark[i] = checkMark();//Check mark
        }
        printTable(mark, name);
    }

    static void printTable(double[] mark, String[] name) {
        System.out.println("_________________________________________");
        System.out.println("Name\t|\tMark\t|\tEducation");
        System.out.println("_________________________________________");
        String[] edu = new String[mark.length];
        for (int i = 0; i < mark.length; i++) {//Check education of student
            if (mark[i] < 5) {
                edu[i] = "Bad";
            }
            if (mark[i] < 6.5 && 5 <= mark[i]) {
                edu[i] = "Normal";
            }
            if (mark[i] < 7.5 && 6.5 <= mark[i]) {
                edu[i] = "Rather";
            }
            if (mark[i] < 9 && 7.5 <= mark[i]) {
                edu[i] = "Good";
            }
            if (mark[i] >= 9) {
                edu[i] = "Excellent";
            }
            String s = String.format("%s\t|\t%.2f\t|\t%s", name[i], mark[i], edu[i]);
            System.out.println(s);
        }
    }
}
