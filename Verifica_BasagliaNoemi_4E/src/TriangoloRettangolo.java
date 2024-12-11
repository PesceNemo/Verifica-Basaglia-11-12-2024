public class TriangoloRettangolo {
    private double base;
    private double altezza;

    public TriangoloRettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double calcolaArea() {
        return (base * altezza) / 2;
    }

    //Metodo che confronta l'area dell'oggetto attuale con quella di un altro oggetto della stessa classe.
    public int compareTo(TriangoloRettangolo altro) {
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
    //Stampa le informazioni dell'oggetto
    public void getInformazioni(){
        System.out.println("Triangolo:");
        System.out.println("Base: " + base + "\nAltezza: "+ altezza + "\nArea: " + calcolaArea());
    }
}