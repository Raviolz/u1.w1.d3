package es2;

public class Main2 {
    static void main(String[] args) {
        Sim sim1 = new Sim("3334421789");
        sim1.stampa();


        Chiamata chiamata1 = new Chiamata("328560029", 3.02);
        System.out.println("----------Aggiunta chiamata-------");
        chiamata1.stampaChiamata();
        sim1.aggiungiChiamata(chiamata1);


        System.out.println("--------test per vedere nuova chiamata aggiunta--------");
        sim1.stampa();

        Chiamata chiamata2 = new Chiamata("3476689123", 16.45);
        sim1.aggiungiChiamata(chiamata2);
        System.out.println("--------test per vedere SECONDA chiamata aggiunta--------");
        sim1.stampa();

    }
}
