package com.company;

public class Customer {
    String name;
    String phone;
    String email;

    String getContactDetails(){
        return "Name : " + name + "\nPhone : " + phone + "\nEmail : "+email;
    }
}
