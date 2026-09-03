package com.example.springboot.springbootwebmvchomeworkmodule2.validation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    PasswordValidator passwordValidator;

    @BeforeEach
    void setUp() {
        passwordValidator = new PasswordValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcdef!@#2", "Abcdef!@#2*&"})
    void isValid_PasswordWithValidLength_ReturnsTrue(String input) {
        boolean result = passwordValidator.isValid(input, null);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcde!&*("})
    void isValid_PasswordTooShort_ReturnsFalse(String input){
        boolean result = passwordValidator.isValid(input, null);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abcdef!@#2", "ABCDEF!@#2"})
    void isValid_MissingAtleastOneUpperAndLowerChar_ReturnsFalse(String input){
        boolean result = passwordValidator.isValid(input, null);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Abcdefghij", "Abcdefghijk"})
    void isValid_MissingSpecialCharacter_ReturnFalse(String input){
        boolean result = passwordValidator.isValid(input, null);
        assertFalse(result);
    }





}