package uebungen.penandpaper;

public class Anwendung {
    public static void main(String [] args){
        Wuerfel wuerfel = new Wuerfel();
        wuerfel.initialisieren(16);
        KriegerIn k1 = new KriegerIn();
        KriegerIn k2 = new KriegerIn();
        k1.initialisieren("Snorre",17,7,50);
        k2.initialisieren("Ork",7,5,7);
        int kampfreihenfolge = 0;

        while (!k1.istBewusstlos() && !k2.istBewusstlos()){
            kampfreihenfolge++;

            if( k1.angreifen(wuerfel.wuerfeln()) && kampfreihenfolge % 2 == 0){
                if( !k2.verteidigen(wuerfel.wuerfeln()) ){
                    System.out.println(k2.name + " hat durch einen Angriff von " + k1.name + " Schaden genommen.");
                    k2.lebenspunkte--;
                } else {
                    System.out.println("Verteidigung von " + k2.name + " war erfolgreich");
                }
            } else {
                System.out.println("Angriff von " + k1.name + " war nicht erfolgreich");
            }


            if( k2.angreifen(wuerfel.wuerfeln()) && kampfreihenfolge % 2 != 0){
                if( !k1.verteidigen(wuerfel.wuerfeln()) ){
                    System.out.println(k1.name + " hat durch einen Angriff von " + k1.name + " Schaden genommen.");
                    k1.lebenspunkte--;
                } else {
                    System.out.println("Verteidigung von " + k1.name + "war erfolgreich");
                }
            } else {
                System.out.println("Angriff von " + k2.name + " war nicht erfolgreich");
            }
        }

        if(k1.istBewusstlos() && !k2.istBewusstlos()){
            System.out.println(k1.name + " ist bewusstlos! " + k2.name + " hat gewonnen.");
        } else if (!k1.istBewusstlos() && k2.istBewusstlos()){
            System.out.println(k2.name + " ist bewusstlos! " + k1.name + " hat gewonnen.");
        } else if (k1.istBewusstlos() && k2.istBewusstlos()) {
            System.out.println("Beide KriegerInnen sind bewusstlos!");
        }





        //dann rollen tauschen usw bis einer bewusstlos ist
    }


}
