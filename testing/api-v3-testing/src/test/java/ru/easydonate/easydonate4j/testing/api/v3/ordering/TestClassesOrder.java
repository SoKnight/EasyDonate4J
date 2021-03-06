package ru.easydonate.easydonate4j.testing.api.v3.ordering;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TestClassesOrder {

    int value() default Integer.MAX_VALUE;

}
