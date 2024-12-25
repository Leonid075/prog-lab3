package ru.p3xi.lab3;

public class UnlockTools extends Tool {
    public UnlockTools(String name) {
        this.name = name;
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " видит " + name + " "  + where);
    }
}
