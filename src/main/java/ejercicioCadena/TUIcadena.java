package ejercicioCadena;

import java.util.Scanner;

public class TUIcadena {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Palabra a invertir:");
        Cadena palabra = new Cadena(sc.nextLine());
        System.out.println(palabra.palabraInvertida());
        System.out.println(palabra.palabraInvertida2());
        sc.close();
    }
}
