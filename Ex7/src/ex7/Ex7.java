//Exercise 7: Create class follow class diagram and add new method public infoCircle() to print info (raidus, color,area) with format table
package ex7;

public class Ex7 {

    public static void main(String[] args) {
        Circle cr1 = new Circle();//Object 1
        Circle cr2 = new Circle(5);//Object 2
        System.out.println("Radius\t|\tColor\t|\tArea");
        System.out.println("_______________________________________");
        System.out.println(cr1.info());
        System.out.println(cr2.info());
    }

}
