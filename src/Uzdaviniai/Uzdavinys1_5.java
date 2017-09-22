package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_5 {

    public int Suma(int a, int b)

    {

        return a + b;
    }

    public float Suma(float a, float b)

    {

        return a + b;
    }

    public float Skirtumas(float a, float b)

    {

        return a - b;
    }

    public void SumaSkirtMetOVer() {
        System.out.println("irasyk du skaicius");

        Scanner Skaneris = new Scanner(System.in);


        int a = Skaneris.nextInt();
        int b = Skaneris.nextInt();


        System.out.println("Suma");
        System.out.println(Suma(a, b));
        System.out.println("Skirtumas");
        System.out.println(Skirtumas(a, b));


    }
}
