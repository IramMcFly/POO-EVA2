package eva2_22_polimorfismofiguuras;

import java.util.Scanner;

public class EVA2_22_POLIMORFISMOFIGUURAS {

    public static void main(String[] args) {

        Circulo datos[] = new Circulo[10];

        // un arreglo en java va de la posicion 0 a la N-1
        //N es la cantidad de elementos del arreglo
        /*
        for(int i = 0; i<datos.length; i++){
            datos[i] = new Circulo(i);
        }
        for(int i = 0; i<datos.length; i++){
            System.out.println("");
            datos[i].imprimirDatos();
        }
         */ //curso de arreglos uwu
        Figuras[] figuras; //declaramos arreglo pero no lo creamos

        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas figuras desea capturar: ");
        int n = sc.nextInt();

        figuras = new Figuras[n]; //le asignamos un tamano al arreglo de N;

        for (int i = 0; i < n; i++) {
            System.out.println("Seleccione el tipo de figura: ");
            System.out.println("1 - Circulo");
            System.out.println("2 - Triangulo");
            System.out.print("Seleccione > ");
            int in = sc.nextInt();

            if (in == 1) {
                System.out.print("Inserte el radio del circulo: ");
                double r = sc.nextDouble();
                figuras[i] = new Circulo(r);

            } else if (in == 2) {
                System.out.print("Inserte la base y altura del triangulo: ");
                int b = sc.nextInt();
                int a = sc.nextInt();
                figuras[i] = new Triangulo(b, a);

            } else {
                System.out.println("Opcion no valida!!!");
            }

        }

        for (int i = 0; i < n; i++) {
            if (figuras[i] instanceof Circulo) {
                //System.out.println("\nCirculo:");
                Circulo c = (Circulo) figuras[i];
                c.imprimirDatos();
            } else {
                //System.out.println("\nTriangulo:");
                Triangulo t = (Triangulo) figuras[i];
                t.imprimirDatos();
            }

            
            
            /*
            System.out.println("Figura #" + (i + 1));
            System.out.println("Area: " + figuras[i].calcularArea());
            System.out.println("Perimetro: " + figuras[i].calcularPer());
          */
        }
    }

    //polimorfismo: conventir una subclase a un objeto de una superclase
    //Convertimos un circulo/triangulo en una figura 
    // si hicimos polimorfismo:
    //
}
