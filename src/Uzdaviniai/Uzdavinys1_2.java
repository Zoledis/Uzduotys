package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_2 {

    public void RaidzSkaic() {


        System.out.println("Irasyk zodi ir bus suskaiciuota kiek raidziu jame");

        Scanner Skaneris = new Scanner(System.in);

        String Zodis = Skaneris.nextLine();

        System.out.println(Zodis.length());

    }
}
