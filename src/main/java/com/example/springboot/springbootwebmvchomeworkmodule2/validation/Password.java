package com.example.springboot.springbootwebmvchomeworkmodule2.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PasswordValidator.class)
public @interface Password {
    String message() default "Password must be least 10 chars long and contain one upper, lower and special case char.";

    Class<?>[] groups() default { };

    Class<? extends Payload>[] payload() default { };
}
