package Uzdaviniai;

import java.lang.reflect.Constructor;
import java.util.Scanner;

public class Uzduotis1_12 {

    public double Ugis;
    public double Svoris;

    public void Uzduotis1_12(double Ugis, double Svoris) {
        this.Svoris = Svoris;
        this.Ugis = Ugis;
        System.out.println(Svoris/Math.pow(Ugis,2));
    }

    public void ApskaicKMI() {
        Scanner Skaneris = new Scanner(System.in);

        System.out.println("Ivesk savo Ugi (m) ir Svori (Kg)");
        Ugis = Skaneris.nextDouble();
        Svoris = Skaneris.nextDouble();

        System.out.println("Tavo KMI yra:");
        Uzduotis1_12(Ugis, Svoris);


    }


}
