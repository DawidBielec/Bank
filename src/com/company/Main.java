package com.company;

public class Main {

    public static void main(String[] args) {

        Account ac1 = new Account(1321412,"20","50",
                "325568","51-222","poznan","warszawska") ;

        Account ac2 = new Account(132143436,"30","90",
                "322332","44-300","wroclaw","szczawia") ;

        ac1.add(1000);
        ac1.withdrawalFromAccount(300);
        System.out.println(ac1.showBalance());

    }
}