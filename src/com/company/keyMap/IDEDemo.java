package com.company.keyMap;

public class IDEDemo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDEDemo(String name) {

        this.name = name;
    }

    public boolean checkName(String input) {
        return this.name.equals(input);
    }
}
