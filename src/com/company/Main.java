package com.company;

public class Main {
    public static void main(String[]args){
        Employee E1 = new Employee("Директор", 89000000000L, 1, "Дмитрий Яковлевич");
        Employee E2 = new Employee("Завуч", 89000000001L, 2, "Анастасия Юрьевна");
        Employee E3 = new Employee("Охранник", 89000000004L, 3, "Виктор Викторович");
        Employee E4 = new Employee("Уборщик", 89000000005L, 4, "Галина Сергеевна");
        Employee[] EE = new Employee[3];
        EE[0] = E1;
        EE[1] = E2;
        EE[2] = E3;
        EE[3] = E4;

        Parrent P1 = new Parrent("Галина Федоровна", 89000000006L, 5);
        Parrent[] PP = new Parrent[0];
        PP[0] = P1;
        Parrent P2 = new Parrent("Игорь Юрьевич", 89000000007L, 6);
        Parrent[] PPP = new Parrent[0];
        PPP[0] = P2;
        Parrent P3 = new Parrent("Ирина Сергеевна", 89000000008L, 7);
        Parrent[] pp = new Parrent[0];
        pp[0] = P3;
        Parrent P4 = new Parrent("Антон Владимирович", 89000000009L, 8);
        Parrent[] ppp = new Parrent[0];
        ppp[0] = P4;
        Parrent P5 = new Parrent("Антон Антонович", 89000000010L, 9);
        Parrent[] Pp = new Parrent[0];
        Pp[0] = P5;
        Parrent P6 = new Parrent("Светлана Ильична", 89000000011L, 10);
        Parrent[] pP = new Parrent[0];
        pP[0] = P6;
        Parrent P7 = new Parrent("Екатерина Алексеевна", 89000000012L, 11);
        Parrent[] PPp = new Parrent[0];
        PPp[0] = P7;
        Parrent P8 = new Parrent("Елизавета Андреевна", 89000000013L, 12);
        Parrent[] pppp = new Parrent[0];
        pppp[0] = P8;
        Parrent P9 = new Parrent("Андрей Игоревич", 89000000014L, 13);
        Parrent[] PPPP = new Parrent[0];
        PPPP[0] = P9;

        PP[1] = P2;
        PP[2] = P3;
        PP[3] = P4;
        PP[4] = P5;
        PP[5] = P6;
        PP[6] = P7;
        PP[7] = P8;
        PP[8] = P9;

        Teacher T1 = new Teacher("учитель", "математик-физик", 89000000015L, 14, "Людвиг Сергеевич");
        Teacher T2 = new Teacher("Учитель", "Химик", 89000000016L, 15, "Юлия Владимировна");
        Teacher T3 = new Teacher("Учмтель", "Руссич-литератор", 89000000017L, 16, "Ольга Дмитриевна");
        Teacher T4 = new Teacher("Учитель", "Физрук", 89000000018L, 17, "Евгений Маркович");
        Teacher T5 = new Teacher("Учитель", "Англичанин", 89000000019L, 18, "Анастасия Сергеевна");
        Teacher T6 = new Teacher("Учитель", "Психолог", 89000000020L, 19, "Александр Федорович");
        Teacher[] TT = new Teacher[5];
        TT[0] = T1;
        TT[1] = T2;
        TT[2] = T3;
        TT[3] = T4;
        TT[4] = T5;
        TT[5] = T6;

        Learner L1 = new Learner(PP, 89000000021L, 20, "Михаил");
        Learner L2 = new Learner(PPP, 89000000022L, 21, "Мария");
        Learner L3 = new Learner(pp, 89000000023L, 22, "Игорь");
        Learner L4 = new Learner(ppp, 89000000024L, 23, "Евгений");
        Learner L5 = new Learner(Pp, 89000000025L, 24, "Александра");
        Learner L6 = new Learner(pP, 89000000026L, 25, "Виктория");
        Learner L7 = new Learner(PPp, 89000000027L, 26, "Анастасия");
        Learner L8 = new Learner(pppp, 89000000028L, 27, "Кирилл");
        Learner L9 = new Learner(PPPP, 89000000029L, 28, "Жанна");
        Learner L10 = new Learner(PPPP, 89000000030L, 29, "София");
        Learner[] LL = new Learner[9];
        LL[0] = L1;
        LL[1] = L2;
        LL[2] = L3;
        LL[3] = L4;
        LL[4] = L5;
        LL[5] = L6;
        LL[6] = L7;
        LL[7] = L8;
        LL[8] = L9;
        LL[9] = L10;

    }
}
