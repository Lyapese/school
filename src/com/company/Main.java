package com.company;

public class Main {
    public static void main(String[]args){
        Employee E1 = new Employee("Директор", 89000000000L, 001, "Дмитрий Яковлевич");
        Employee E2 = new Employee("Завуч", 89000000001L, 002, "Анастасия Юрьевна");
        Employee E3 = new Employee("Учитель", 89000000002L, 003, "Юлия Игоревна");
        Employee E4 = new Employee("Учитель", 89000000003L, 004, "Александр Владимирович");
        Employee E5 = new Employee("Охранник", 89000000004L, 005, "Виктор Викторович");
        Employee E6 = new Employee("Уборщик", 89000000005L, 006, "Галина Сергеевна");
        Employee[] EE = new Employee[5];
        EE[0] = E1;
        EE[1] = E2;
        EE[2] = E3;
        EE[3] = E4;
        EE[4] = E5;
        EE[5] = E6;

        Parrent P1 = new Parrent("Галина Федоровна", 89000000006L, 007);
        Parrent P2 = new Parrent("Игорь Юрьевич", 89000000007L, 008);
        Parrent P3 = new Parrent("Ирина Сергеевна", 89000000008L, 009);
        Parrent P4 = new Parrent("Антон Владимирович", 89000000009L, 010);
        Parrent P5 = new Parrent("Антон Антонович", 89000000010L, 011);
        Parrent P6 = new Parrent("Светлана Ильична", 89000000011L, 012);
        Parrent P7 = new Parrent("Екатерина Алексеевна", 89000000012L, 013);
        Parrent P8 = new Parrent("Елизавета Андреевна", 89000000013L, 014);
        Parrent P9 = new Parrent("Андрей Игоревич", 89000000014L, 015);
        Parrent[] PP = new Parrent[8];
        PP[0] = P1;
        PP[1] = P2;
        PP[2] = P3;
        PP[3] = P4;
        PP[4] = P5;
        PP[5] = P6;
        PP[6] = P7;
        PP[7] = P8;
        PP[8] = P9;

    }
}
