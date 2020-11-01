package com.zipcodewilmington.scientificcalculator;

public class Memory {
    public Double memory;
    public Boolean memoryChanged;
    public static final Double DEFAULT_MEMORY_VALUE = new Double(0);

    public Memory() {
        this.memory = DEFAULT_MEMORY_VALUE;
        this.memoryChanged = false;
    }

    public void memoryActions() {

        Console.println("Menu"
                + "\n1: M+ Add value to value in memory"
                + "\n2: MC Reset memory to 0"
                + "\n3: MRC Recall the current value from memory"
                + "\n4: Go back to Main Menu"
        );

        String menuSelection = " ";

        while(!menuSelection.equals("4")) {

            if (menuSelection.equals("1")) {
                Double newMemory = Console.getDoubleInput("Enter the value you want to add to the value currently in memory");
                this.memory = updateMemory(newMemory);
                this.memoryChanged = true;
                Console.println("Current value stored in memory: " + this.memory);
                break;
            } else if (menuSelection.equals("2")) {
                clearMemory();
                Console.println("Memory has been cleared");
            } else if (menuSelection.equals("3")) {
                Console.println("Current value stored in Memory: " + this.memory);
            } else {
                Console.println("Invalid option selected, please try again.");
            }
        }

    }

    public Double updateMemory(Double memoryInput){
        return this.memory += memoryInput;
    }

    public Double clearMemory() {
        return this.memory = DEFAULT_MEMORY_VALUE;
    }
}
