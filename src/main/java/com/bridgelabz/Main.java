package com.bridgelabz;

public class Main {

    public static void main(String[] args) throws CustomException {

        UserRegistration userRegistration = new UserRegistration();
        userRegistration.validFirstName();
        userRegistration.validLastName();
        userRegistration.validEmailId("");
        userRegistration.validMobileNumber();
        userRegistration.validPassword();

    }
}