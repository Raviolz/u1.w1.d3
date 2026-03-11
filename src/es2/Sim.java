package es2;

public class Sim {
    // LISTA ATTRIBUTI

    private String numero;
    private double credito;
    private Chiamata[] listaChiamate;
    private int numeroChiamate;


    // LISTA COSTRUTTORI

    public Sim(String numeroInput) {
        numero = numeroInput;
        credito = 0.0;
        numeroChiamate = 0;
        listaChiamate = new Chiamata[5];
    }


    // LISTA METODI

    public void stampa() {
        System.out.println("Numero di telefono: " + numero);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime chiamate:");
        if (numeroChiamate == 0) {
            System.out.println("Nessuna chiamata effettuata"); // se no non stampava nulla
        } else {
            for (int i = 0; i < numeroChiamate; i++) { // scorro e stampo chiamate con metodo della classe Chiamata
                listaChiamate[i].stampaChiamata();
            }
        }
    }

    public void aggiungiChiamata(Chiamata chiamataInput) {
        if (numeroChiamate < 5) {
            listaChiamate[numeroChiamate] = chiamataInput; // uso il numero di chiamate presenti come indice da riempire dell array con nuova c
            numeroChiamate++;                  // aggiorno e di conseguenza cambiera' anche l indice
        }
    }
}
