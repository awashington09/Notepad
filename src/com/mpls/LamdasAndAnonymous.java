package com.mpls;

//Create a lambda function that prints out a message that says hello
//no paramaters, or one parameter, or 2 parameters

//create our anonymous class: interface

import java.sql.SQLOutput;

interface greeting{
    // a method that returns a String
public String sayHello();

}

public class LamdasAndAnonymous {

    public static void main(String[] args) {


        // lamda function that is created using our anonymous class
        greeting msg = () -> {

            return "Hello";
        };
        System.out.println(msg.sayHello());
    }

}