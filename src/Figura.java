import java.lang.Double;

public abstract class Figura implements Comparable<Figura> {
    public Figura(){}

    abstract public double area();

    public int CompareTo(Figura f)
    {
        return Double.compareTo(this.area(),f.area());
    }
}
