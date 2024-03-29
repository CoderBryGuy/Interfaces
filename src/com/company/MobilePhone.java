package com.company;

public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken ");
        isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn) {
            System.out.println("now ringing " + phoneNumber + " on mobile phone");
        }else {
            System.out.println("phone is switched off");
        }
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("melody playing");

        }else {isRinging = false;}
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return false;
    }
}
