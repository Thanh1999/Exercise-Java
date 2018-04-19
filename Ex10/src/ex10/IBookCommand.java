/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;


public interface IBookCommand {
    void addBook(Book newBook);
    Book findBookByID(int bookID);
    Book updateBook(Book editBook);
}
