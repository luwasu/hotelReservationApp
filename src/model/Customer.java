package model;

import java.util.regex.Pattern;

public class Customer {


    private String firstName;
    private String lastName;
    private String email;
    private static final String EMAIL_REGEX_PATTERN = "^(.+)@(.+).(.+)$";


    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isValidEmail(email);
    }

    public void isValidEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX_PATTERN);

        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException(email + " is not a valid email address!");
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer: " +
                firstName + ", "
                + lastName + ", "
                + email;
    }
}
