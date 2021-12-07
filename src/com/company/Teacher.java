package com.company;

public class Teacher extends Participant{
    public String Position;
    public String Qualification;

    public Teacher(String Po, String Q, int Ph, int ID, String F) {
        super(F, Ph, ID);
        Position = Po;
        Qualification = Q;
    }
}
