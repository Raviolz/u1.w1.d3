package es1;

public class Rettangolo {

    // LISTA ATTRIBUTI
    private double altezza;
    private double larghezza;

    // LISTA COSTRUTTORI

    public Rettangolo(double altezzaInput, double larghezzaInput) {
        altezza = altezzaInput;
        larghezza = larghezzaInput;
    }

    // LISTA METODI

    public static void stampaRettangolo(Rettangolo oggRettangoloInput) {
        System.out.println("Area: " + oggRettangoloInput.getArea());
        System.out.println("Perimetro: " + oggRettangoloInput.getPerimetro());
    }

    public static void stampaDueRettangoli(Rettangolo oggRettangolo1, Rettangolo oggRettangolo2) {
        System.out.println("Area e Perimetro primo rettangolo:");
        stampaRettangolo(oggRettangolo1);
        System.out.println("Area e Perimetro secondo rettangolo:");
        stampaRettangolo(oggRettangolo2);
        System.out.println("Somma aree: " + (oggRettangolo1.getArea() + oggRettangolo2.getArea()));
        System.out.println("Somma perimetri: " + (oggRettangolo1.getPerimetro() + oggRettangolo2.getPerimetro()));
    }

    public double getPerimetro() {
        return 2 * (altezza + larghezza);
    }

    public double getArea() {
        return altezza * larghezza;
    }
}
