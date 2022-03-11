import java.lang.Math;

public class Circulo extends Figura{
    private double r;

    public Circulo (double r)
    {
        this.r=r;
    }

    public double area()
    {
        return Math.pow(this.r,2)*(Math.PI);


    }
}
