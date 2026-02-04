package org.javaturk.ioop.ygyhomework.bank;

public class Customer {
    int no;
    String type;
    String name_Title;
    int identificationNo;
    Account account;

    public Customer(String type, String name_Title, int identificationNo, Account account) {
        this.type = type;
        this.name_Title = name_Title;
        this.identificationNo = identificationNo;
        this.account = account;
        this.no = (int) (Math.random() * 1000000);
    }

    public Customer(String type, String name_Title, int identificationNo) {
        this.type = type;
        this.name_Title = name_Title;
        this.identificationNo = identificationNo;
        this.account = null;
        this.no = (int) (Math.random() * 1000000);
    }
}
