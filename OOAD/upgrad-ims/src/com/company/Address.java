package com.company;

public class Address {
    String street;
    String city;
    String state;

    String getAddressDetails() {
        return "Street : "+street+"\nCity : " + city + "\nState : "+ state ;
    }
}
