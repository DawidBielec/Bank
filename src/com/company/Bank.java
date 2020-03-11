package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Account> accountList = new ArrayList<>() ;
    public List<Transaction> transactionList = new ArrayList<>() ;

    public static final Bank INSTANCE = new Bank() ;

    private Bank() {

    }

    public List<Account> init() {
        return accountList;
    }

    public void add(int number, double amount) {

        Transaction transaction = new Transaction() ;
        transaction.number = number ;
        transaction.amount = amount ;
        transactionList.add(transaction) ;
    }

    public void payOff(int number, double amount) {

        Transaction transaction = new Transaction() ;
        transaction.number = number ;
        transaction.amount = amount ;
        transactionList.add(transaction) ;
    }

    public void getBalance(int number) {

        Transaction transaction = new Transaction() ;
        transaction.number = number ;
        transactionList.add(transaction) ;
    }

}