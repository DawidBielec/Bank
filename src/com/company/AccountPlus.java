package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AccountPlus extends Account {

    public List<Deposit> deposits = new ArrayList<>() ;

    public AccountPlus(int number, String firstName, String lastName, String PESEL, String Code, String town, String street) {
        super(number, firstName, lastName, PESEL, Code, town, street);
    }


    public void AddInvestment(double interest, LocalDate depositStart, LocalDate depositStop) {
        deposits.add(new Deposit(interest,depositStart,depositStop)) ;
    }


}
