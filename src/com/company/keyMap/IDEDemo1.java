package com.company.keyMap;

public class IDEDemo1 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IDEDemo1(String name) {

        this.name = name;
    }

    public boolean checkName1(String input) {
        return this.name.equals(input);
    }
}
