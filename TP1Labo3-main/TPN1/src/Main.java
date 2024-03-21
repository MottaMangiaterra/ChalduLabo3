
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        Ejercicio8(lector);
    }
    public static void Ejercicio1()
    {
        int x = 0;
        float y = 1.2F;

        System.out.println("Hola mundo!");
        System.out.println("El entero es: "+x);
        System.out.println("El flotante es: "+y);
    }

    public static void Ejercicio2(Scanner lector)
    {
        System.out.println("El numero entero ingresado es "+Escanearentero(lector));
    }

    public static int Escanearentero(Scanner lector)
    {
        System.out.print("Ingrese un numero entero: ");

        return lector.nextInt();
    }

    public static int Sumar(int x,int y)
    {
        int suma=0;

        suma=x+y;

        return suma;
    }

    public static void Ejercicio3(Scanner lector)
    {
        System.out.println(Sumar(Escanearentero(lector),Escanearentero(lector)));
    }

    public static void Ejercicio4()
    {
        for (int i=1;i<=10;i++)
        {
          System.out.print(i+" ");
        }
    }

    public static void Ejercicio5(Scanner lector)
    {
        int base = 0;
        int altura = 0;

        System.out.println("Ingrese la base :");
        base = Escanearentero(lector);

        System.out.println("Ingrese la altura :");
        altura = Escanearentero(lector);

        System.out.println("El area del rectangulo es "+Multiplicar(base,altura));
    }

    public static int Multiplicar(int x,int y)
    {
        int multiplicacion = 0;

        multiplicacion=x*y;

        return multiplicacion;
    }

    public static void Ejercicio6(Scanner lector)
    {
        int x = Escanearentero(lector);

        if (esonoPar(x)==true)
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }

    public static boolean esonoPar(int x)
    {
        boolean espar = false;

        if (x % 2 == 0)
        {
            espar = true;
        }

        return espar;
    }

    public static void Ejercicio7(Scanner lector)
    {
        int x = Escanearentero(lector);

        System.out.println(Factorial(x));
    }

    public static void Ejercicio8(Scanner lector)
    {
        //int x = Escanearentero(lector);

        System.out.println(Fibonacci(3,0));
    }

    public static int Factorial(int x)
    {

        if (x==0)
        {
            return 1;
        }
        else
        {
            x=x*Factorial(x-1);
        }

        return x;
    }

    public static int Fibonacci (int x,int sucesion) {


        return 0;
    }
}