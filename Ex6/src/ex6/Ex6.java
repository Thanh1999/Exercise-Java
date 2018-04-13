//Exercise 6: Create class Dog have private name :String, private color :String, private height: double
//Create two method: public info(), public getName() , public getColor(), public setHeight(), public
//setColor()
//Create constructor full field ,constructor 2 parameter name, height and constructor empty
package ex6;

public class Ex6 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Bob", 1.3);//Object 1 have 2 parameter
        dog1.setColor("Blue");//Update color
        Dog dog2 = new Dog("Mie", "Red", 1.2);//Object 2 full field
        Dog dog3 = new Dog();//Object 3 empty
        dog3.getName();//get name
        dog3.getColor();// get color
        dog3.setHeight(7);// set height
        System.out.println("Name\t|\tHeight\t|\tColor");
        System.out.println("_____________________________________");
        System.out.println(dog1.info());//Print info
        System.out.println(dog2.info());//Print info   
        System.out.println(dog3.info());//Print info
    }
}
