/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

/**
 *
 * @author Thanh
 */
abstract public class Book {
    protected int bookID;
    protected String bookTitle;
    protected double price;
    protected int quantity;
    abstract public String printBook();
    abstract public double subTotal();
    public int getBookID(){
        return this.bookID;
    }
    public void setBookID(int bookID){
        this.bookID = bookID;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public void setBookID(String bookTitle){
        this.bookTitle = bookTitle;
    }
    Book(){
        
    }
    Book(int bookID, String bookTitle, double price, int quantity){
        this.bookID = bookID;
        this.bookTitle = bookTitle;
        this.price = price;
        this.quantity = quantity;
    }
}
