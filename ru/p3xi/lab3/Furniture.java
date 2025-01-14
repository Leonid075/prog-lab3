package ru.p3xi.lab3;
import java.util.ArrayList;

public abstract class Furniture implements Visible {
    public abstract void standOn(Tool tool) throws BusyException;
}
