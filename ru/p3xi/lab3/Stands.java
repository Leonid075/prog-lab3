package ru.p3xi.lab3;
import java.util.ArrayList;

public class Stands extends Furniture {
    public Tool tool;

    @Override
    public void standOn(Tool tool) throws BusyException {
        if(this.tool != null) {
            throw new BusyException("подставка уже занята");
        }
        this.tool = tool;
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " смотрит на деревянную подставку " + where);
        tool.lookOn(watcher, "на деревянной подставке");
    }

    @Override
    public String toString() {
        return "деревянная подставка";
    }

    @Override
    public int hashCode() {
        return tool.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Stands stands = (Stands) obj;
        if (this.tool.equals(stands.tool)) return true;
        else return false;
    }
}
