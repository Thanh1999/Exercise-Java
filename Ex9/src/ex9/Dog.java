/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex9;

/**
 *
 * @author Thanh
 */
public class Dog {

    private String name;
    private String color;
    private double height;
    private int id;

    public String info() {
        String s;
        s = String.format("%s\t|\t%.2f\t|\t%s\t|\t%d", this.name, this.height, this.color, this.id);
        return s;
    }

    public String getName() {
        return this.name;
    }

    public double getHeight() {
        return this.height;
    }

    public String getColor() {
        return this.color;
    }

    public int getID() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setID(int id) {
        this.id = id;
    }

    Dog() {

    }

    Dog(String name, double height, String color, int id) {
        this.name = name;
        this.height = height;
        this.color = color;
        this.id = id;
    }
}
