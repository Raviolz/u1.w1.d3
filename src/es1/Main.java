package es1;

public class Main {
    static void main(String[] args) {

        Rettangolo rettangolo1 = new Rettangolo(10.5, 5.2);
        Rettangolo rettangolo2 = new Rettangolo(3.4, 12.3);
        System.out.println("--------Rettangolo 1--------");
        Rettangolo.stampaRettangolo(rettangolo1);
        System.out.println("---------Rettangolo --------");
        Rettangolo.stampaRettangolo(rettangolo2);
        System.out.println("--------Recap piu somme-------");
        Rettangolo.stampaDueRettangoli(rettangolo1, rettangolo2);
    }
}