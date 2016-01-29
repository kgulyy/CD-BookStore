package org.agoncal.book.javaee7.chapter02.producers;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;
import java.util.logging.Logger;

/**
 * Created by Константин on 28.01.2016.
 */
public class LoggingProducer {

    @Produces
    public Logger produceLogger(InjectionPoint injectionPointn) {
        return Logger.getLogger(injectionPointn.getMember().getDeclaringClass().getName());
    }
}
