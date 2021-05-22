package uebungen.penandpaper;

public class Wuerfel {
    int anzahlAugen;

    void initialisieren(int anzahlAugen){
        this.anzahlAugen = anzahlAugen;
    }

    int wuerfeln() {
        return (int) (Math.random() * anzahlAugen) + 1;
    }
}