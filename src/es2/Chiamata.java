package es2;

public class Chiamata {

    // LISTA ATTRIBUTI
    private String numeroChiamato;
    private double durata;

    //  LISTA COSTRUTTORI

    public Chiamata(String numChiamataInput, double durataInput) {
        numeroChiamato = numChiamataInput;
        durata = durataInput;
    }

    // LISTA METODI

    public void stampaChiamata() {
        System.out.println("Numero chiamato: " + numeroChiamato +
                " durata: " + durata + " minuti");
    }


}

