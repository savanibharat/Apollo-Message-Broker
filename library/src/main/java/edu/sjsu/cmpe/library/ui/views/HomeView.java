package edu.sjsu.cmpe.library.ui.views;

import java.util.ArrayList;
import java.util.List;

import com.yammer.dropwizard.views.View;

import edu.sjsu.cmpe.library.domain.Book;
//import edu.sjsu.cmpe.library.domain.Book;
import edu.sjsu.cmpe.library.domain.Book2;

public class HomeView extends View {
    private final List<Book2> books;
    public HomeView(List<Book> books) {
              super("home.mustache");
              this.books = new ArrayList<Book2>();
              for (Book book : books) {
            	  Book2 book2 = new Book2();
            	  book2.setCategory(book.getCategory());
            	  book2.setCoverimage(book.getCoverimage());
            	  book2.setIsbn(book.getIsbn());
            	  book2.setStatus(book.getStatus());
            	  book2.setTitle(book.getTitle());
            	  book2.setLost(book.getStatus());   
            	  this.books.add(book2);
              }
              
    }
    public List<Book2> getBooks() {
              return books;
    }
}