package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_6 {

    public double KMI(double Ugis, double Svoris) {
        return Svoris / Math.pow(Ugis, 2);
    }

    public void ApskaicKMI() {
        Scanner Skaneris = new Scanner(System.in);

        System.out.println("Ivesk savo Ugi (m) ir Svori (Kg)");
        double Ugis = Skaneris.nextDouble();
        double Svoris = Skaneris.nextDouble();

        System.out.println("Tavo KMI yra:");
        System.out.println(KMI(Ugis, Svoris));


    }

}
