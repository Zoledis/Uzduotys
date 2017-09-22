package com.company;

import Uzdaviniai.*;

import java.util.Scanner;

public class Main {
    public static final int UZDAVINYS_0 = 0;
    public static final int UZDAVINYS_1 = 1;
    public static final int UZDAVINYS_1_2 = 2;
    public static final int UZDAVINYS_1_3 = 3;
    public static final int UZDAVINYS_1_4 = 4;
    public static final int UZDAVINYS_1_5 = 5;
    public static final int UZDAVINYS_1_6 = 6;
    public static final int UZDAVINYS_1_8 = 8;
    public static final int UZDAVINYS_1_10 = 10;
    public static final int UZDAVINYS_1_12 = 12;

    public static void main(String[] args) {
        // write your code here

        Scanner Skaneris = new Scanner(System.in);

        while (true) {
            System.out.println("Kuri uzdavini darysime ?");
            System.out.println("Ivedus -1 programa bus baigta?");
            int uzdavinioNumeris = Skaneris.nextInt();
            switch (uzdavinioNumeris) {
                case UZDAVINYS_0:
                    Uzdavinys0 uzdavinys0 = new Uzdavinys0();
                    uzdavinys0.pasisveikinti();
                    break;
                case UZDAVINYS_1:
                    Uzdavinys1_1 uzdavinys1 = new Uzdavinys1_1();
                    uzdavinys1.ParasytVx5();
                    break;
                case UZDAVINYS_1_2:
                    Uzdavinys1_2 uzdavinys1_2 = new Uzdavinys1_2();
                    uzdavinys1_2.RaidzSkaic();
                    break;
                case UZDAVINYS_1_3:
                    Uzdavinys1_3 uzdavinys1_3 = new Uzdavinys1_3();
                    uzdavinys1_3.SumaSkirt();
                    break;
                case UZDAVINYS_1_4:
                    Uzdavinys1_4 uzdavinys1_4 = new Uzdavinys1_4();
                    uzdavinys1_4.SumaSkirtMet();
                    break;

                case UZDAVINYS_1_5:
                    Uzdavinys1_5 uzdavinys1_5 = new Uzdavinys1_5();
                    uzdavinys1_5.SumaSkirtMetOVer();
                    break;

                case UZDAVINYS_1_6:
                    Uzdavinys1_6 uzdavinys1_6 = new Uzdavinys1_6();
                    uzdavinys1_6.ApskaicKMI();
                    break;
                    case UZDAVINYS_1_8:
                    Uzdavinys1_8 uzdavinys1_8 = new Uzdavinys1_8();
                    uzdavinys1_8.ApskaicVid();
                    break;
                    case UZDAVINYS_1_10:
                    Uzdavinys1_10 uzdavinys1_10 = new Uzdavinys1_10();
                    uzdavinys1_10.Ivedimas();
                    break;
                case UZDAVINYS_1_12:
                    Uzduotis1_12 uzdavinys1_12 = new Uzduotis1_12();
                    uzdavinys1_12.ApskaicKMI();
                    break;


                default:
                    return;

            }

        }

    }
}
