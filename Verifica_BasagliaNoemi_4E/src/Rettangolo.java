public class Rettangolo {
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
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
        return base * altezza;
    }

    //Metodo che compara l'area del rettangolo con l'area del quadrato
    public int compareTo(Quadrato quadrato) {
        double areaReattangolo = this.calcolaArea();
        double areaQuadrato = quadrato.calcolaArea();
        if(areaReattangolo < areaQuadrato){
            //Se l'area del Rettangolo è minore dell'area del Quadrato returna un 1
            return 1;
        }else if(areaReattangolo > areaQuadrato){
            //Se l'area del Rettangolo è maggiore dell'area del Quadrato returna un -1
            return -1;
        }else{
            //Se l'area del Rettangolo è uguale all'area del Quadrato returna un o
            return 0;
        }
    }

    //Metodo calcola Perimetro che restituisce il valore del perimetro.
    public double calcolaPerimetro(){
        return Math.abs(altezza*2 + base*2);
    }

    //Stampa le informazioni dell'oggetto
    public void getInformazioni(){
        System.out.println("Rettangolo:");
        System.out.println("Base: " + base + "\nAltezza: "+ altezza + "\nPerimetro: "+ calcolaPerimetro() + "\nArea: "+ calcolaArea());
    }

}