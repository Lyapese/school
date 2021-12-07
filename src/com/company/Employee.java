package com.company;

public class Employee extends Participant{
    public String Position;

    public Employee(String Po, int Ph, int ID, String F) {
        super(F, Ph, ID);
        Position = Po;
    }
}
