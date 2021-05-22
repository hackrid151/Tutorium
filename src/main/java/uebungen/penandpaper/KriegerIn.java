package uebungen.penandpaper;

public class KriegerIn {
    String name;
    int angriff;
    int verteidigung;
    int lebenspunkte;

    void initialisieren(String name, int angriff, int verteidigung, int lebenspunkte){
        this.name = name;
        this.angriff = angriff;
        this.verteidigung = verteidigung;
        this.lebenspunkte = lebenspunkte;
    }
/*liefert true, wenn angriffspunkte grösser wurf*/
    boolean angreifen(int wurf){
        return (angriff >= wurf);
    }
/*liefert true, falls Wurf erfolgreich*/
    boolean verteidigen(int wurf){
        return verteidigung >= wurf;
    }
/*liefert true, wenn Lebenspunkte kleiner gleich 0*/
    boolean istBewusstlos(){
        return lebenspunkte <= 0;
    }
}

