import java.lang.Double;

public abstract class Figura implements Comparable<Figura>{

    public Figura(){}

    abstract public double area();

    public int compareTo(Figura f)
    {
        return Double.compare(this.area(),f.area());

    }
}
