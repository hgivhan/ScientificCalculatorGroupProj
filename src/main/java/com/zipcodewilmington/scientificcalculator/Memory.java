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

    public Double updateMemory(Double memoryInput){ // removed void
        this.memory += memoryInput;
        memoryChanged();
        return this.memory; // added this line to pass the test
    }

    public void clearMemory() {
        if(this.memory != 0) {
            this.memory = DEFAULT_MEMORY_VALUE;
            memoryChanged();
        }
    }

    public Double getMemory() {
        return this.memory;
    }

    public void memoryChanged() { // created this method and called it in methods above
        this.memoryChanged = true;
    }
}
