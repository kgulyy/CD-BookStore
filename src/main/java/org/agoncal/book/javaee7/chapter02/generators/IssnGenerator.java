package org.agoncal.book.javaee7.chapter02.generators;

import org.agoncal.book.javaee7.chapter02.annotations.EightDigits;
import org.agoncal.book.javaee7.chapter02.annotations.Loggable;

import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author Константин
 */
@EightDigits
public class IssnGenerator implements NumberGenerator {

    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {
        String issn = "8-" + Math.abs(new Random().nextInt());
        logger.info("Generated ISSN : " + issn);
        return issn;
    }
}
