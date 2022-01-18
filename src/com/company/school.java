package com.company;

public class school {
    public Employee[] Employees;
    public Teacher[] Teachers;
    public Learner[] Learners;
    public String Adress;
    public String Name;
    public Class[] Classes;
    public elective[] Electives;
    public section[] Sections;

    public school(Employee[] E, Teacher[] T, Learner[] L, String A, String Na, Class[] C, elective[] El, section[] Se) {
        Employees = E;
        Teachers = T;
        Learners = L;
        Adress = A;
        Name = Na;
        Classes = C;
        Electives = El;
        Sections = Se;
    }

    public void getListTeachers() {System.out.println(Teachers);}
    public void getListEmployeers() {System.out.println(Employees);}
    public void getListLearners() {System.out.println(Learners);}
    public void getElectronicJournal() {
    }
    public Participant getParticipant(int CardID) {
        for (int i = 0; i<Employees.length; i++){
            if (Employees[i].CardID == CardID){
                return Employees[i];
            }
        }
        for (int i = 0; i < Teachers.length; i++) {
            if (Teachers[i].CardID == CardID) {
                return Teachers[i];
            }
        }
        for (int i = 0; i < Learners.length; i++){
            if (Learners[i].CardID == CardID){
                return Learners[i];
            }
        }
        return null;
    }
}
