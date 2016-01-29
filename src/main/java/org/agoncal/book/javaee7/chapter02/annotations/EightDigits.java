package org.agoncal.book.javaee7.chapter02.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.*;

/**
 * @author Константин
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface EightDigits {
}
