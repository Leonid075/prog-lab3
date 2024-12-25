package ru.p3xi.lab3;

public abstract class PoliceTool extends Tool{
    protected String name;

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " видит " + name + " " + where);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}