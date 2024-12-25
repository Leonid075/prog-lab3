package ru.p3xi.lab3;

public abstract class FaceChanger extends Tool {
    protected String color;

    public FaceChanger(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " видит " + color + " " + name + " "  + where);
    }

    @Override
    public String toString() {
        return color + " " + name;
    }
}
