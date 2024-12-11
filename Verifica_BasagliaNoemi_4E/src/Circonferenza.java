public class Circonferenza {
    private double raggio;

    public Circonferenza(double raggio) {
        this.raggio = raggio;
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }

    //Metodo che confronta l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe.
    public int compareTo(Circonferenza altro) {
        double areaOggettoAttuale = this.calcolaArea(); //Oggetto attuale
        double areaAltroOggetto = altro.calcolaArea(); //Altro oggetto
        if(areaOggettoAttuale < areaAltroOggetto){
            //Se l'oggetto attuale ha un'area minore a quella dell'altro oggetto returna un 1
            return 1;
        }else if(areaOggettoAttuale > areaAltroOggetto){
            //Se l'oggetto attuale ha un'area maggiore a quella dell'altro oggetto returna un 1
            return -1;
        }else{
            //Se l'oggetto attuale ha un'area uguale a quella dell'altro oggetto returna un o
            return 0;
        }
    }
}