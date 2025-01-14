package ru.p3xi.lab3;

public class UnlockTools extends Tool {
    public UnlockTools(String name) {
        this.name = name;
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " видит " + name + " "  + where);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        if (this.name != obj.name) {
            return false;
        }

        return true;
    }
}
