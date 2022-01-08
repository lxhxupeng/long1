package com.company.keyMap;

public class QuickKey {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QuickKey(String name) {

        this.name = name;
    }

    public boolean checkName(String input) {
        return name.equals(input);
    }
}
