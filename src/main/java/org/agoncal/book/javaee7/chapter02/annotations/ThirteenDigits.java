package org.agoncal.book.javaee7.chapter02.annotations;

import javax.inject.Qualifier;
import java.lang.annotation.*;

/**
 * Created by Константин on 28.01.2016.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
public @interface ThirteenDigits {
}
