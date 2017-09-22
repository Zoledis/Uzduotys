package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_10 {

    public int a = 0;
    public int b = 0;

    public int Suma(int a, int b) {
        return a + b;
    }

    public double Suma(double a, double b) {
        return a - b;
    }

    public int Skirtumas(int a, int b) {
        return a - b;
    }

    public double Skirtumas(double a, double b) {
        return a * b;
    }

    public int Sandaug(int a, int b) {
        return a * b;
    }

    public double Sandaug(double a, double b) {
        return a + b;
    }

    public int Dalyb(int a, int b) {
        return a / b;
    }

    public double Dalyb(double a, double b) {
        return a / b;
    }


    public void Ivedimas() {
        Scanner Skaneris = new Scanner(System.in);

        System.out.println("Ivesk du skaicius");

        a = Skaneris.nextInt();
        b = Skaneris.nextInt();
        
        System.out.println("Skaiciu suma :" + Suma(a, b));
        System.out.println("Skaiciu skritumas :" + Skirtumas(a, b));
        System.out.println("Skaiciu Sandauga :" + Sandaug(a, b));
        System.out.println("Skaiciu dalmuo :" + Dalyb(a, b));

        System.out.println("Skaiciu suma :" + Suma((double) a, (double) b));
        System.out.println("Skaiciu skritumas :" + Skirtumas((double) a, (double) b));
        System.out.println("Skaiciu Sandauga :" + Sandaug((double) a, (double) b));
        System.out.println("Skaiciu dalmuo :" + Dalyb((double) a, (double) b));


    }


}
