package uebungen.uebung00;
/**
 * Generiert String und repräsentiert diesen (zB Alphabet der Kleinbuchstaben
 * String Objektvariable ergebnis für die Zeichenkette)
 */

public class Zeichenkette {

    private String ergebnisZeichenkette; //objektvariable generell private, verändert nur durch methoden, ncith so nach ausßen geben

    public String getErgebnisZeichenkette() { //getter
        return ergebnisZeichenkette;
    }

    public Zeichenkette(){ //konstrukto
        ergebnisZeichenkette = "";
    }

    private void makeAlphabetRekursiv(int buchstabe){
        if (buchstabe == 'z'){
            ergebnisZeichenkette += "z";
        } else {
            ergebnisZeichenkette += (char)buchstabe;
            makeAlphabetRekursiv((int) (buchstabe)+1);
        }
    }

    public void makeAlphabet(){
        ergebnisZeichenkette = "";
        makeAlphabetRekursiv(97);
    }

    public void makePrim(){
        ergebnisZeichenkette = "";
        makePrim(100);
    }

    private void makePrim(int n){
        if( n == 3){
            ergebnisZeichenkette = n + "," + ergebnisZeichenkette;
        } else if (isPrim(n) == true){
            ergebnisZeichenkette  = n + "," + ergebnisZeichenkette;
            makePrim(n-1);
        } else {
            makePrim(n-1);
        }
    }

    private boolean isPrim(int zahl){
        boolean isPrimzahl = true;
        if (zahl <= 2){
            System.err.println("Die Zahl ist zu klein!");
        } else {
            for (int i = 2; i < zahl; i++) {
                isPrimzahl = isPrimzahl && (zahl % i != 0);
            }
        }
        return isPrimzahl;
    }

    public static void main(String [] args){
    Zeichenkette zeichenkette = new Zeichenkette();
    zeichenkette.makeAlphabet();
    zeichenkette.makePrim();
    System.out.println(zeichenkette.getErgebnisZeichenkette()); //zeichnet alphabet
       // System.out.println(zeichenkette);


    }

}
