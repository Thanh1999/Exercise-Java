/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import java.util.ArrayList;
import java.util.Scanner;
public class BookManagement implements IBookCommand {
    ArrayList<Book> data = new ArrayList<Book>();
    Scanner sc = new Scanner(System.in);
    @Override
    public void addBook(Book newBook) {
        int bookID;
        String bookTitle, type, publishingCompany, topic, author;
        double price;
        int quantity;
        System.out.println("1. English Book");
        System.out.println("2. Computer Book");
        int option = Validate.getBook();
        System.out.print("Enter ID: ");
        bookID = Validate.getInteger();
        System.out.print("Enter bookTitle:");
        bookTitle = sc.nextLine();
        System.out.print("Enter price:");
        price = Validate.getDouble();
        System.out.print("Enter quantity: ");
        quantity = Validate.getInteger();
        if(option == 1){
        System.out.print("Enter type: ");
        type = sc.nextLine();
        System.out.print("Enter publishingCompany");
        publishingCompany = sc.nextLine();
        data.add(newBook);
        }
    }

    @Override
    public Book findBookByID(int bookID) {
        
    }

    @Override
    public Book updateBook(Book editBook) {
       
    }
}
