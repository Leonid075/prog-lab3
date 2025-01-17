package ru.p3xi.lab3;

public class Neznaika {
    public void lookAround(Room room) {
        for(Furniture f : room.furnitures()) {
            f.lookOn("Незнайка", "в комнате " + room.name());
        }
    }

    @Override
    public String toString() {
        return "Незнайка";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        return true;
    }
}