package lunes.dos;

import java.util.Scanner;

public class principal {
    // Scanner
    public static Scanner sc = new Scanner(System.in);

    // Main
    public static void main(String[] args) {
        // Variables
        byte uIndice = -1;
        Triangulo triangulo = new Triangulo(pedirLado1(),pedirLado2(),pedirLado3());

        // Programa

        indice();
        uIndice = Byte.parseByte(sc.nextLine());

        while (uIndice!=0){
            try {
                switch (uIndice){
                    default -> System.out.println("Indice no valido");
                    case 0 ->{}
                    case 1 -> triangulo = new Triangulo(pedirLado1(),pedirLado2(),pedirLado3());
                    case 2 -> System.out.println("test2");
                    case 3 -> System.out.println("Test3");
                    case 4 -> System.out.println("Test4");
                    case 5 -> System.out.println("Test5");
                }
            }catch (Exception e){
                System.out.println("Error: " + e.getMessage());
            }
            indice();
            System.out.println(triangulo.toString());
            uIndice = Byte.parseByte(sc.nextLine());
        }
        System.out.println("Cerrando el programa...");
        sc.close();
    }

    // Pedir al usuario
    public static double pedirLado1(){
        System.out.println("Inserte 1º lado:");
        return Double.parseDouble(sc.nextLine());
    }

    public static double pedirLado2(){
        System.out.println("Inserte 2º lado:");
        return Double.parseDouble(sc.nextLine());
    }

    public static double pedirLado3(){
        System.out.println("Inserte 3º lado:");
        return Double.parseDouble(sc.nextLine());
    }

    // Indice
    public static void indice(){
        System.out.println("""
                ***** Indice *****
                0\tCerrar el programa
                1\tNuevo Triangulo
                2\t¿Es un triangulo?
                3\t¿Es isosceles?
                4\t¿Es escaleno?
                5\t¿Es equilatero?
                """);
    }
}
