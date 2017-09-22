package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_8 {

    public double Vidurkis(double KuroSan, double Atstumas)

    {
        return (KuroSan * 100) / Atstumas;
    }

    public void ApskaicVid() {
        Scanner Skaneris = new Scanner(System.in);
        System.out.println("Ivesk kuro sanaudas");
        double KuroSan = Skaneris.nextDouble();
        System.out.println("Ivesk atstuma");
        double Atstumas = Skaneris.nextDouble();

        System.out.println("Vidurkis lygus :" + Vidurkis(KuroSan, Atstumas));


    }


}
