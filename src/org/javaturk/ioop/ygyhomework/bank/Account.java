package org.javaturk.ioop.ygyhomework.bank;

public class Account {
    int no;
    String name;
    String bankName;
    String currency;
    double balance;
    Customer customer;

    Account(String name, String bankName, String currency) {
        this.no = (int) (Math.random() * 10000000);
        this.name = name;
        this.bankName = bankName;
        this.currency = currency;
        this.balance = 0.0;
        this.customer = null;
    }

    Account(String name, String bankName, String currency, Customer customer) {
        this.no = (int) (Math.random() * 10000000);
        this.name = name;
        this.bankName = bankName;
        this.currency = currency;
        this.balance = 0.0;
        this.customer = customer;
    }
}

