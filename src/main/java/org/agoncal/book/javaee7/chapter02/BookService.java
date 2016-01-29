package org.agoncal.book.javaee7.chapter02;

import org.agoncal.book.javaee7.chapter02.annotations.Loggable;
import org.agoncal.book.javaee7.chapter02.generators.NumberGenerator;
import org.agoncal.book.javaee7.chapter02.annotations.ThirteenDigits;

import javax.inject.Inject;

/**
 * @author Константин
 */
@Loggable
public class BookService {

    @Inject @ThirteenDigits
    private NumberGenerator numberGenerator;

    public Book createBook(String title, Float price, String description) {
        Book book = new Book(title, price, description);
        book.setNumber(numberGenerator.generateNumber());
        return book;
    }
}
