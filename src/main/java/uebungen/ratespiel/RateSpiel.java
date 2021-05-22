package Aufgabe1;

import java.util.Scanner;

public class RateSpiel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte Geben Sie Ihr Name: ");
        String name = scanner.next();
        System.out.println("Hallo " + name);
        System.out.println("Sie müssen eine Zahl im Intervall 0-100 ausdenken und schätzen.");
        int eingabe;
        int zahl = (int)(Math.random() * 101);
        int versuche = 0;

        do {
            versuche++;
            eingabe = scanner.nextInt();
            if (zahl < eingabe) {
                System.out.println("Die Eingabe ist zu groß");
            } else if (zahl > eingabe) {
                System.out.println("Die Eingabe ist zu klein");
            } else {
                System.out.println("Herzlichen Glückwunsch! Sie haben " + versuche + " Versuche benötigt.");
            }
        } while (eingabe != zahl);
        scanner.close();
        System.out.println("Die Zahl ist: " + zahl);
    }
}

