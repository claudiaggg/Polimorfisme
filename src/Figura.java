import java.util.Arrays;

public abstract class Figura implements Comparable<Figura> {
    public Figura(){}

    abstract public double area();

    public int CompareTo(Figura f)
    {
        return Double.compare(this.area(),f.area());
    }
}
