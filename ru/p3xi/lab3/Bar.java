package ru.p3xi.lab3;
import java.util.ArrayList;

public class Bar extends Furniture {
    public ArrayList<Tool> tools;

    public Bar() {
        tools = new ArrayList<Tool>();
    }

    @Override
    public void standOn(Tool tool) {
        tools.add(tool);
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " смотрит на прилавок " + where);
        for(Tool t : tools) {
            t.lookOn(watcher, "на прилавке");
        }
    }

    @Override
    public String toString() {
        return "прилавок";
    }

    @Override
    public int hashCode() {
        Integer hash = 0;
        for(Tool tool : tools) {
            hash += tool.hashCode();
        }
        return hash;
    }

    public Boolean equals(Bar stands) {
        for(Tool tool1 : this.tools) {
            for(Tool tool2 : stands.tools) {
                if (tool1.equals(tool2)) return false;
            }
        }
        return true;
    }
}