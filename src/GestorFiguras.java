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
}
