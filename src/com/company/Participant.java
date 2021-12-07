package com.company;

public class Participant extends person{
    public int CardID;

    public Participant(String F, int Ph, int ID) {
        super(F, Ph);
        CardID = ID;
    }
}
