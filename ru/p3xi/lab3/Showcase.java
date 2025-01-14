package ru.p3xi.lab3;
import java.util.ArrayList;

public class Showcase extends Furniture {
    public String nameplate;
    public ArrayList<Tool> tools;

    public Showcase(String nameplate) {
        this.nameplate = nameplate;
        tools = new ArrayList<Tool>();
    }

    @Override
    public void standOn(Tool tool) throws BusyException {
        tools.add(tool);
    }

    public void lookOn(String watcher, String where) {
        System.out.println(watcher + " смотрит на витрину с табличкой " + nameplate);
        for(Tool t : tools) {
            t.lookOn(watcher, "на витрине с табличкой " + nameplate);
        }
    }

    @Override
    public String toString() {
        return "витрина с табличкой " + nameplate;
    }

    @Override
    public int hashCode() {
        Integer hash = nameplate.hashCode();
        for(Tool tool : tools) {
            hash += tool.hashCode();
        }
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        final Showcase stands = (Showcase) obj;
        if (!this.nameplate.equals(stands.nameplate)) return false;

        for(Tool tool1 : this.tools) {
            for(Tool tool2 : this.tools) {
                if (tool1.equals(tool2)) return false;
            }
        }
        return true;
    }
}
