package com.company;

public class Account extends Owner {

    private int number ;
    private double balance ;
    private Owner owner ;

    public Account(int number,String firstName,String lastName,String PESEL,
                   String code,String town, String street ) {
        super(firstName, lastName, PESEL, new Address(code,town,street));
        this.number = number ;
        this.owner = new Owner(firstName,lastName, PESEL,new Address(code,town,street)) ;
        this.balance = 0 ;
    }



    public double showNumber() {
        return number ;
    }

    public double showBalance() {
        return balance ;
    }

    public void showBalance(int number) throws AccountException {
        if(number == showNumber() ) {
            System.out.println(showBalance());
        } else {
            throw new AccountException() ;
        }
    }

    public void setBalanceSheet(double balance) {
        if(balance>0) {
            this.balance = balance ;
        }  else {
            System.out.println("Nie mozna wpłacić wartości ujemnej");
        }
    }

    public void setBalanceAfterPayment(double valueOfCashWithdrawn  ) {
        this.balance = balance-valueOfCashWithdrawn ;
    }


    public double withdrawalFromAccount(int x) throws AccountException {

        double accountBalance = showBalance() ;
        if(accountBalance>x) {
            setBalanceAfterPayment(x);
            return x;
        } else {
            throw new AccountException() ;
        }
    }


    public void add(double paymentOnAccount) {

        if(paymentOnAccount>0) {
            this.balance = showBalance()+paymentOnAccount ;
        }  else {
            System.out.println("Nie mozna wpłacić wartości ujemnej");
        }
    }

    public void
    payOff( double paymentValue ) {
        this.balance = balance-paymentValue ;
    }


}
