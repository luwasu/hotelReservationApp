package model;

public class FreeRoom extends Room {


    public FreeRoom() {
        super.price = 0.0;
    }

    @Override
    public String toString() {
        return "This is a free room";
    }
}
