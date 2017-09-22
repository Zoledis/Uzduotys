package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_3 {

    public void SumaSkirt() {
        System.out.println("irasyk du skaicius");

        Scanner Skaneris = new Scanner(System.in);

        int a = Skaneris.nextInt();
        int b = Skaneris.nextInt();


        System.out.println("Suma lygi:");
        System.out.println(a + b);
        System.out.println("Skirtumas lygus:");
        System.out.println(a - b);


    }
}
