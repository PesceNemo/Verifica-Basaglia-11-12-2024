public class Punto {
    // Attributi privati
    private double x;
    private double y;

    // Costruttore che accetta x e y
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter per x
    public double getX() {
        return x;
    }

    // Setter per x
    public void setX(double x) {
        this.x = x;
    }

    // Getter per y
    public double getY() {
        return y;
    }

    // Setter per y
    public void setY(double y) {
        this.y = y;
    }

    // Metodo che calcola la distanza tra il punto corrente e un altro punto
    public double distanza(Punto altro) {
        //Formula per trovare le distanze delle x e y: x1 - x2, y1 - y2
        double dx = altro.getX() - this.x;
        double dy = altro.getY() - this.y;
        //Teorema di Pitagora: dx alla 2 + dy alla 2 tutto sotto radice
        //Math.sqrt calcola la radice.
        return Math.sqrt(dx * dx + dy * dy);
    }
}
