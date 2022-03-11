import java.util.Arrays;

public abstract class GestorFiguras {

    public abstract double area();

    public double Suma(GestorFiguras[] v)
    {
        double suma=0;
        for (GestorFiguras f: v)
        {
            suma+=f.area();
        }
        return suma;

    }
    public int compareTo (GestorFiguras f)
    {
        return Double.compare(this.area(),f.area());

    }

    public GestorFiguras[] Ordena(GestorFiguras[] v)
    {
        Arrays.sort(v);
        return v;
    }
}
