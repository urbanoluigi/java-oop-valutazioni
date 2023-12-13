package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.List;

public class Corso {
    private List<Studente> studenti = new ArrayList<>();

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public void rimuoviStudente(Studente studente) {
        studenti.remove(studente);
    }

    public void mostraElencoStudenti() {
        for (Studente studente : studenti) {
            System.out.println(studente);
        }
    }

    public double percentualePromossi() {
        long promossi = studenti.stream().filter(Studente::isPromosso).count();
        return (double) promossi / studenti.size() * 100;
    }
}
