package com.bridgelabz.userRegistration;

import com.bridgelabz.CustomException;
import com.bridgelabz.UserRegistration;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void validFirstNameTest() throws CustomException {

        boolean result = userRegistration.validFirstName();
        Assertions.assertTrue(result);
    }

    @Test
    public void validLastNameTest() throws CustomException {

        boolean result = userRegistration.validLastName();
        Assertions.assertTrue(result);
    }

    @Test
    public void validMobileNumberTest() throws CustomException {

        boolean result = userRegistration.validMobileNumber();
        Assertions.assertTrue(result);
    }

    @Test
    public void validPasswordTest() throws CustomException {

        boolean result = userRegistration.validPassword();
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"abc@yahoo.com", "abc-100@yahoo.com", "abc1.com", "abc+100@gmail.com"})
    public void validEmailIdTest(String emailId) throws CustomException {

        boolean result = userRegistration.validEmailId(emailId);
        Assertions.assertTrue(result);
    }
}