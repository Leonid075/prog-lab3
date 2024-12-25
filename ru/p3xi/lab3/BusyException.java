package ru.p3xi.lab3;

public class BusyException extends Exception { 
    public BusyException(String errorMessage) {
        super(errorMessage);
    }
}
