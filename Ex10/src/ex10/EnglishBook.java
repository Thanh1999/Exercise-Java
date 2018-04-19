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
public class EnglishBook extends Book {

    String type;
    String publishingCompany;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getpublishingCompany() {
        return this.publishingCompany;
    }

    public void setpublishingCompany(String publishingCompany) {
        this.publishingCompany = publishingCompany;
    }

    @Override
    public String printBook() {
        return String.format("%-10d|%-10s|%-10.2f|%-10d|%-10s|%-10s", super.bookID, super.bookTitle, super.price, super.quantity, this.type, this.publishingCompany);
    }

    @Override
    public double subTotal() {
        return super.price * super.quantity * 1.1;
    }

    EnglishBook() {

    }

    EnglishBook(int bookID, String bookTitle, double price, int quantity, String type, String publishingCompany) {
        super(bookID, bookTitle, price, quantity);
        this.type = type;
        this.publishingCompany = publishingCompany;
    }
}
