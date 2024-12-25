package ru.p3xi.lab3;

public abstract class Firearms extends Weapon {
    protected Caliber caliber;

    public Firearms(Caliber caliber, String name) {
        this.caliber = caliber;
        this.name = name;
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " видит " + name + " " + caliber + " " + where);
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
