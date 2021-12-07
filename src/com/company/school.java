package com.company;

public class school {
    public Employee[] Employes;
    public Teacher[] Teachers;
    public Learner[] Learners;
    public String Adress;
    public String Name;
    public Class[] Classes;
    public elective[] Electives;
    public section[] Sections;

    public school(Employee[] E, Teacher[] T, Learner[] L, String A, String Na, Class[] C, elective[] El, section[] Se) {
        Employes = E;
        Teachers = T;
        Learners = L;
        Adress = A;
        Name = Na;
        Classes = C;
        Electives = El;
        Sections = Se;
    }

    public void getListTeachers()
    {

    }
    public void getListEmployeers()
    {

    }
    public void getListLearners()
    {

    }
    public void getElectronicJournal()
    {

    }
    public Participant getParticipant()
    {
        return ;
    }
}
