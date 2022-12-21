package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistration {
    ValidateDetails validateDetails = Pattern::matches;

    public boolean validFirstName() throws CustomException {

        String firstName = "Himanshu";
        String firstNameRegex = "[A-Z][a-z]{2,}";
        if (!validateDetails.checkDetails(firstNameRegex, firstName)) {
            throw new CustomException("\n Enter valid First Name");
        }
        return true;
    }

    public boolean validLastName() throws CustomException {

        String lastName = "Borse";
        String lastNameRegex = "[A-Z][a-z]{2,}";
        if (!validateDetails.checkDetails(lastNameRegex, lastName)) {
            throw new CustomException("\n Enter valid Last Name");
        }
        return true;
    }

    public boolean validEmailId(String emailID) throws CustomException {

        emailID = "Him.bor@ok.co.in";
        String emailIdRegex = "[A-z\\d]+[.]?[-+A-z\\d]+@[A-z\\d]+[.]?[A-z]*[.][A-z,]{2,}";
        if (!validateDetails.checkDetails(emailIdRegex, emailID)) {
            throw new CustomException("\n Enter valid EmailID");
        }
        return true;
    }

    public boolean validMobileNumber() throws CustomException {

        String mobileNumber = "91 9876543210";
        String mobileNoRegex = "\\d{2}\\s\\d{10}";
        if (!validateDetails.checkDetails(mobileNoRegex, mobileNumber)) {
            throw new CustomException("\n Enter valid Mobile Number");
        }
        return true;
    }

    public boolean validPassword() throws CustomException {

        String password = "Himanshu@12345";
        String passwordRegex = "^(?=.{8,})(?=.*?[A-Z])(?=.*?\\d)(?=.*\\W).*$";
        if (!validateDetails.checkDetails(passwordRegex, password)) {
            throw new CustomException("\n Enter valid Password");
        }
        return true;
    }

}