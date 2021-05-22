package uebungen.uebung00;

public class Rasenmaeher {

    float tankvolumen;
    float tankinhalt;

    public Rasenmaeher(float tankvolumen, float tankinhalt){

        if ( tankinhalt > tankvolumen || tankinhalt < 0 || tankvolumen < 0){
            throw new IllegalArgumentException("Inhalt muss kleiner Volumen sein!");
        }
        this.tankvolumen = tankvolumen;
        this.tankinhalt = tankinhalt;
        System.out.println("Neuer Rasenmäher erzeugt.");
    }

    public Rasenmaeher(float tankvolumen) {
        new Rasenmaeher(tankvolumen, 0);
    }

    public float berechneVerbrauch(float flaeche){
        float verbrauch = 0.005f;
        return flaeche * verbrauch;
    }

    public void maehen(float flaeche) {
        if (tankinhalt < 0){
            throw new IllegalArgumentException("Zuviel gemäht!");
        }
        tankinhalt = tankinhalt - berechneVerbrauch(flaeche);
        System.out.println("Gemäht " + flaeche + " qm, Rest im Tank: " + tankinhalt + "l.");
    }

    public static void main (String [] args){
        Rasenmaeher rasenmaeher = new Rasenmaeher(1.5f,1.0f);
        rasenmaeher.maehen(100);
    }
}

