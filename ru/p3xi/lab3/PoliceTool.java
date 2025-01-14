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

    // @Override
    // public boolean equals(Object obj) {
    //     if (obj == null) {
    //         return false;
    //     }

    //     if (obj.getClass() != this.getClass()) {
    //         return false;
    //     }

    //     if (this.name != obj.name) {
    //         return false;
    //     }

    //     return true;
    // }
}
