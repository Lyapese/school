package com.company;

public class Learner extends  Participant{
    public Parrent[] Parrents;

    public Learner(Parrent[] P, int Ph, int ID, String F) {
        super(F, Ph, ID);
        Parrents = P;
    }
}
