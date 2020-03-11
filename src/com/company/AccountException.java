package com.company;


public class AccountException extends RuntimeException {


    public String  getMessage() {
        return "Takie konto nie istnieje lub  masz za mało pieniędzy aby wypłacić tyle pieniędzy  " ;
    }

}
