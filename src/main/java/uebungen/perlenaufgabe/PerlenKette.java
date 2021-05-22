package Aufgabe2;

public class PerlenKette {
    Perle anfang;
    Perle ende;
    public static void main(String[] args) {
        PerlenKette kette = new PerlenKette();
        Perle perle1 = new Perle("blau");

        kette.einfaedeln(perle1);
        
        System.out.println(kette.getAnzahlPerlen());

       /* Perle perle = new Perle();
        perle.farbe = "Rot";
        Perle perle2 = new Perle();
        perle2.farbe = "Rot"; */
       /* for ( int i = 0; i < 10; i++) {
            Perle perle = new Perle("lila");
            perle.getFarbe() = i % 2 == 0 ? "Rot" : "Gelb";
            perlenkette.einfaedeln(perle);
        }
        Perle perli = new Perle();
        perli.getFarbe() = "lila";
        perlenkette.einfaedeln(perli);
*/
       /* perlenkette.einfaedeln(perle);
        perlenkette.einfaedeln(perle2); */
        //perlenkette.ausfaedeln();
    /*    perlenkette.getAnzahlPerlen();
        perlenkette.getAnzahlFarbigePerlen("Gelb");
        perlenkette.getAnzahlFarbigePerlen("Rot");
        perlenkette.getAnzahlFarbigePerlen("lila");*/
    }
    public void einfaedeln(Perle perle) {
        if (anfang == null) {
            anfang = perle;
            perle.setNachfolger(perle);
        } else if (ende != null) {
            ende.setNachfolger() = perle;
        }
        ende = perle;
        ende.setNachfolger(anfang);
    }
    public void ausfaedeln() {
        //Perle aktuell = anfang;
       // Perle vorgaenger;
        if (anfang == null) {
            System.out.println("Kette ist leer");
        } else if (anfang == anfang.nachfolger) {
            System.out.println("Kette hat nur eine Perle");
            anfang = null;
        } else {
            ende.nachfolger = anfang.nachfolger;
            anfang = anfang.nachfolger;
        }
    }
    public int getAnzahlPerlen() {
        int anzahl = 0;
        Perle aktuell = anfang;
        if (aktuell == null) {
            return anzahl;
        } else {
            while (!aktuell.equals(anfang)) {
                anzahl++;
                aktuell = aktuell.getNachfolger();
            }
            System.out.println("Es befinden sich " + anzahlPerlen + " Perlen in der Kette.");
        }
        return anzahl;
    }
    public int getAnzahlFarbigePerlen(String farbe) {
        int anzahlPerlen = 0;
        do {
            if (anfang.farbe == farbe) {
                anzahlPerlen++;
            }
            anfang = anfang.nachfolger;
        } while (!anfang.equals(ende));
        System.out.println("Es befinden sich " + anzahlPerlen + " Perlen mit der Farbe " + farbe + " in der Kette");
        return anzahlPerlen;
    }
}

            /* if (anfang == null) {
                anzahlPerlen = 0;
            } else {
                while (!anfang.equals(ende)) {
                    if (anfang.farbe.equals(farbe)) {
                        anzahlPerlen++;
                    }
                    anfang = anfang.nachfolger;
                    System.out.println("Es befinden sich " + anzahlPerlen + " Perlen mit der Farbe" + farbe + " in der Kette");
                }
            }
            return anzahlPerlen; */