package org.agoncal.book.javaee7.chapter02.generators;

import org.agoncal.book.javaee7.chapter02.annotations.Loggable;
import org.agoncal.book.javaee7.chapter02.annotations.ThirteenDigits;

import javax.enterprise.inject.Alternative;
import javax.inject.Inject;
import java.util.Random;
import java.util.logging.Logger;

/**
 * @author Константин
 */
@Alternative
@ThirteenDigits
public class MockGenerator implements NumberGenerator {

    @Inject
    private Logger logger;

    @Loggable
    @Override
    public String generateNumber() {
        String mock = "MOCK-" + Math.abs(new Random().nextInt());
        logger.info("Generated Mock : " + mock);
        return mock;
    }
}
