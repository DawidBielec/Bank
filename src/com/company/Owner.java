package com.company;

public class Owner {

    private String firstName ;
    private String lastName ;
    private Address address;
    private String PESEL ;

    public Owner(String firstName, String lastName,String PESEL, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.PESEL = PESEL;
    }
}