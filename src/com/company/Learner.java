package com.company;

public class Learner extends  Participant{
    public Parrent[] Parrents;

    public Learner(Parrent[] P, long Ph, int ID, String F) {
        super(F, Ph, ID);
        Parrents = P;
    }
}
