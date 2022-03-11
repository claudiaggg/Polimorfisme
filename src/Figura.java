import java.lang.Double;

public abstract class Figura {

    public Figura(){}

    abstract public double area();

    public int CompareTo(Figura f)
    {
        //return this.area().compareTo(f.area());
        if(f.area()>this.area()) {
            return -1;
        }
        else if (f.area()==this.area()){
            return 0;
        }
        else{
            return 1;
        }
    }
}
