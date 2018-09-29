
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Library {

    private ArrayList<Book> books = new ArrayList<Book>();

    public Library() {

    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void printBooks() {
        for (Book b : this.books) {
            System.out.println(b.toString());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book b : this.books) {
            if (StringUtils.included(b.title(),title)) {
                matches.add(b);
            }
        }
        return matches;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book b : this.books) {
            if (StringUtils.included(b.publisher(),publisher)) {
                matches.add(b);
            }
        }
        return matches;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> matches = new ArrayList<Book>();
        for (Book b : this.books) {
            if (b.year() == year) {
                matches.add(b);
            }
        }
        return matches;
    }

}
