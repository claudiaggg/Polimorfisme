import java.util.Arrays;

public abstract class GestorFiguras {

    public abstract double area();

    public static double Suma(GestorFiguras[] v)
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

    public static GestorFiguras[] Ordena(GestorFiguras[] v)
    {
        Arrays.sort(v);
        return v;
    }


    public static void main(String[] args)
    {
        GestorFiguras c1 = new Circulo(30);
        GestorFiguras t1 = new Triangulo(20,10);
        GestorFiguras c2 = new Cuadrado(37);
        GestorFiguras r1 = new Rectangulo(70,10);


        GestorFiguras[] v= {c1, t1, c2, r1};
        double SumaTotal = Suma(v);
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(t1.area());
        System.out.println(r1.area());

        System.out.println("La suma total es: " + SumaTotal);

        GestorFiguras[] ordenado = Ordena(v);

        System.out.println(v[0].area());
        System.out.println(v[1].area());

        System.out.println(v[2].area());
        System.out.println(v[3].area());



    }
}
