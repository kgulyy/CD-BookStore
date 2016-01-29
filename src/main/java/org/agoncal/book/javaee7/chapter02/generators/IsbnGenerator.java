package org.agoncal.book.javaee7.chapter02.generators;

import org.agoncal.book.javaee7.chapter02.annotations.Loggable;
import org.agoncal.book.javaee7.chapter02.annotations.ThirteenDigits;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author Константин
 */
@ThirteenDigits
public class IsbnGenerator implements NumberGenerator {

    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {
        String isbn = "13-84356-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISBN : " + isbn);
        return isbn;
    }
}
