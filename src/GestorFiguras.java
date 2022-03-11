import java.util.Arrays;

public class GestorFiguras {

    public static double Suma(Figura[] v)
    {
        double suma=0;
        for (Figura f: v)
        {
            suma+=f.area();
        }
        return suma;

    }

    public static void Ordena(Figura[] v)
    {
        Arrays.sort(v);

    }


    public static void main(String[] args)
    {
        Figura c1 = new Circulo(30);
        Figura t1 = new Triangulo(20,10);
        Figura c2 = new Cuadrado(37);
        Figura r1 = new Rectangulo(70,10);


        Figura[] v= {c1, t1, c2, r1};
        double SumaTotal = Suma(v);
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(t1.area());
        System.out.println(r1.area());

        System.out.println("La suma total es: " + SumaTotal);

//        Ordena(v);
//
//        System.out.println(v[0].area());
//        System.out.println(v[1].area());
//
//        System.out.println(v[2].area());
//        System.out.println(v[3].area());



    }
}
