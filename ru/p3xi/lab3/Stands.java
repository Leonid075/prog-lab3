package ru.p3xi.lab3;
import java.util.ArrayList;

public class Stands extends Furniture {
    public Tool tool;

    @Override
    public void standOn(Tool tool) {
        try{
            if(this.tool != null) {
                throw new BusyException("подставка уже занята");
            }
            this.tool = tool;
        }
        catch(BusyException e){
            System.out.println("подставка уже занята");
        }
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

    public boolean equals(Stands stands) {
        if (this.tool.equals(stands.tool)) return true;
        else return false;
    }
}
