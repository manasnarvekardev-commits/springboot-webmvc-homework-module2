package com.example.springboot.springbootwebmvchomeworkmodule2.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PrimeNumberValidator.class)
public @interface PrimeNumber {
    String message() default "Prime number should greater than 1, should be divisible by itself and number 1";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
