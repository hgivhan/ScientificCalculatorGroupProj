package com.zipcodewilmington.scientificcalculator;

public class Menu {
    public void men(String[] args) {

    }
}
/* Hillary: In the Menu class, there needs to be a runMenu() method because
       I used Menu.runMenu() to call the Menu class from the MainApplication class..
       If you want to change the name of the method, that's cool as long as the Menu
       and MainApplication methods are the same so that they are linked, does that make sense? */

/* Hillary: This was all suggested in Main Application class (idk why),
but since we have a separate menu class now, I wanted to paste it here
in case it's helpful for you as you update this Menu class:

Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

         */