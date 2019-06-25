package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ITelephone bryansPhone;
        bryansPhone = new DeskPhone(012445511);
        bryansPhone.powerOn();
        bryansPhone.callPhone(012445511);
        bryansPhone.answer();

        bryansPhone = new MobilePhone(4345466);
        bryansPhone.powerOn();
        bryansPhone.callPhone(4345466);
        bryansPhone.answer();
    }
}
