package org.lessons.java.valutazioni;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Corso corso = new Corso();
        Random random = new Random();

        // Aggiungi un numero casuale di studenti tra 10 e 20
        int numStudenti = random.nextInt(11) + 10;

        for (int i = 1; i <= numStudenti; i++) {
            int assenze = random.nextInt(101);
            double voti = random.nextDouble() * 5;
            Studente studente = new Studente(i, assenze, voti);
            corso.aggiungiStudente(studente);
        }

        // Mostra l'elenco degli studenti
        corso.mostraElencoStudenti();

        // Mostra la percentuale dei promossi
        System.out.println("Percentuale di studenti promossi: " + corso.percentualePromossi() + "%");
    }
}
