package com.example.springboot.springbootwebmvchomeworkmodule2.validation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberValidatorTest {
    //Arrange
    PrimeNumberValidator validator;

    @BeforeEach
    void setUp() {
        this.validator = new PrimeNumberValidator();
    }

    @ParameterizedTest(name = "Should be a prime: {0}")
    @ValueSource(ints = {2, 3, 5})
    void isValid_PrimeNumber_ReturnsTrue(int numbers) {
        //act
        boolean valid = validator.isValid(numbers, null);
        assertTrue(valid);
    }


    @ParameterizedTest(name = "Should return false for: {0}")
    @ValueSource(ints = {1})
    void isValid_PrimeNumber_ReturnsFalse(int numbers) {
        boolean valid = validator.isValid(numbers, null);
        assertFalse(valid);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 6, 8})
    void isValid_PrimeNumber_ReturnsFalseForComposites(int numbers) {
        boolean valid = validator.isValid(numbers, null);
        assertFalse(valid);
    }

    @Test
    void isValid_PrimeNumber_ReturnsTrueForNull() {
        boolean valid = validator.isValid(null, null);
        assertTrue(valid);
    }

    @ParameterizedTest
    @ValueSource(ints = {Integer.MAX_VALUE})
    void isValid_LargePrime_ReturnsTrue(int number){
        boolean valid = validator.isValid(number, null);
        assertTrue(valid, "Integer.MAX_VALUE should be a prime");
    }
}