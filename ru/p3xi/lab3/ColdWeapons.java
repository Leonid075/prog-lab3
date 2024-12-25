package ru.p3xi.lab3;

public abstract class ColdWeapons extends Weapon {
    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " видит " + name + " "  + where);
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
