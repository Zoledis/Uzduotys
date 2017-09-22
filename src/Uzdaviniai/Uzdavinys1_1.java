package Uzdaviniai;

import java.util.Scanner;

public class Uzdavinys1_1 {

public void ParasytVx5 (){

    System.out.println("Ivesk savo varda ");

    Scanner Skaneris = new Scanner(System.in);
    String Vardas = Skaneris.nextLine();

    for (int i=0 ; i<5; i++) {
        System.out.println(Vardas);
    }
}

}
