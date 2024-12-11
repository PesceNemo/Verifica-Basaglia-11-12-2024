/*
    DOMANDE:

    -Perchè è utile avere metodi di calcolo in una classe?
        E' più ordinato ed organizzato, se tutti questo metodi si trovano nel Main sarebbe difficile trovarli  subito.
        Inoltre dato che siamo nel linguaggio java si parla di incapsulamento, cioè decidere la visibilità delle varibili o dei metodi;
        se una variabile e privata si può modificare a proprio piacimento senza far vedere all'utente il cambiamento.

    -
 */

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(1, 2);
        Quadrato quadrato = new Quadrato(6);
        TriangoloRettangolo triangolo = new TriangoloRettangolo(3, 4);

        //I metodi getInformazioni() sono metodi void che stampano a video le infomazioni delle classi.
        rettangolo.getInformazioni();
        quadrato.getInformazioni();
        triangolo.getInformazioni();

        if (rettangolo.compareTo(quadrato) > 0) {
            System.out.println("Il rettangolo ha un'area minore del quadrato.");
        } else {
            System.out.println("Il quadrato ha un'area minore o uguale a quella del rettangolo.");
        }
    }
}