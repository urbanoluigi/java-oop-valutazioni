package org.lessons.java.valutazioni;

public class Studente {
    private int id;
    private int percentualeAssenze;
    private double mediaVoti;

    public Studente(int id, int percentualeAssenze, double mediaVoti) {
        this.id = id;
        this.percentualeAssenze = percentualeAssenze;
        this.mediaVoti = mediaVoti;
    }

    public boolean isPromosso() {
        if (percentualeAssenze > 50) {
            return false; // Bocciato se più del 50% di assenze
        } else if (percentualeAssenze >= 25 && mediaVoti > 2) {
            return true; // Promosso se tra il 25% e il 50% di assenze e media voti > 2
        } else if (percentualeAssenze < 25 && mediaVoti >= 2) {
            return true; // Promosso se meno del 25% di assenze e media voti >= 2
        } else {
            return false; // Altrimenti bocciato
        }
    }

    @Override
    public String toString() {
        return "Studente " + id + ": Assenze = " + percentualeAssenze + "%, Media Voti = " + mediaVoti;
    }
}
