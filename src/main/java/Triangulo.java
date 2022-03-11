public class Triangulo extends Figura {

    private double h; //Altura
    private double b; //Base

    public Triangulo(double h, double b) {
        this.h = h;
        this.b = b;
    }

    public double area() {
        return (this.h*this.b)/2;
    }


}
