package com.zipcodewilmington.scientificcalculator;

public class Memory {
    private Double memory;
    private Boolean memoryChanged;
    private static final Double DEFAULT_MEMORY_VALUE = new Double(0);

    public Memory() {
        this.memory = DEFAULT_MEMORY_VALUE;
        this.memoryChanged = false;
    }

    public void memoryActions() {

        Console.println("Menu"
                + "\n1: M+  | Add value to current value in memory"
                + "\n2: MC  | Reset memory to 0.0"
                + "\n3: MRC | Recall the current value from memory"
                + "\n4: Go back to Main Menu"
        );
    }

    public void updateMemory(Double memoryInput){
        this.memory += memoryInput;
        this.memoryChanged = true;
    }

    public void clearMemory() {
        if(this.memory != 0) {
            this.memory = DEFAULT_MEMORY_VALUE;
            this.memoryChanged = true;
        }
    }

    public Double getMemory() {
        return this.memory;
    }

}
