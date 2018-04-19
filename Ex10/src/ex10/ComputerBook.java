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
public class ComputerBook extends Book {

    String author;
    String topic;

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTopic() {
        return this.topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public String printBook() {
        return String.format("%-10d|%-10s|%-10.2f|%-10d|%-10s|%-10s", super.bookID, super.bookTitle, super.price, super.quantity, this.topic, this.author);
    }

    @Override
    public double subTotal() {
        return super.price * super.quantity * 1.1;
    }

    ComputerBook() {

    }

    ComputerBook(int bookID, String bookTitle, double price, int quantity, String topic, String author) {
        super(bookID, bookTitle, price, quantity);
        this.topic = topic;
        this.author = author;
    }

}
