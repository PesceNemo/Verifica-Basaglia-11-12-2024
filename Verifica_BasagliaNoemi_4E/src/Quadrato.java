public class Quadrato {
    private double lato;

    public Quadrato(double lato) {
        this.lato = lato;
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    public double calcolaArea() {
        return lato * lato;
    }

    //Metodo che confronta l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe.
    public int compareTo(Quadrato altro) {
        double areaOggettoAttuale = this.calcolaArea(); //Oggetto attuale
        double areaAltroOggetto = altro.calcolaArea(); //Altro oggetto

        if(areaOggettoAttuale < areaAltroOggetto){
            //Se l'oggetto attuale ha un'area minore a quella dell'altro oggetto returna un 1
            return 1;
        }else if(areaOggettoAttuale > areaAltroOggetto){
            //Se l'oggetto attuale ha un'area maggiore a quella dell'altro oggetto returna un -1
            return -1;
        }else{
            //Se l'oggetto attuale ha un'area uguale a quella dell'altro oggetto returna un o
            return 0;
        }
    }
    //Stampa le informazioni dell'oggetto
    public void getInformazioni(){
        System.out.println("Quadrato:");
        System.out.println("Lato: " + lato + "\nArea: "+ calcolaArea());
    }
}