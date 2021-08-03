package model;

import java.util.regex.Pattern;

public class Customer {


    private String firstName;
    private String lastName;
    private String email;
    String emailRegex = "^(.+)@(.+).(.+)$";
    Pattern pattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email) throws IllegalArgumentException {
        this.firstName = firstName;
        this.lastName = lastName;

        if (!pattern.matcher(email).matches()) {
            throw new IllegalArgumentException(email + " is not a valid email address!");
        } else {
            this.email = email;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
