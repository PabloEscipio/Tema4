package martes.dos;

import martes.dos.Exceptions.DataException;
import martes.dos.freidora.Freidora;
import martes.dos.freidora.hijas.FreidoraAceite;
import martes.dos.freidora.hijas.FreidoraAire;

import java.io.FileWriter;
import java.util.ArrayList;

import java.util.Scanner;

public class Principal {
    // Scanner
    public static Scanner sc = new Scanner(System.in);

    // Main
    public static void main(String[] args) {
        // Variables
        byte uIndice = -1;
        ArrayList<Freidora> listFreidoras = new ArrayList<>();

        try {
            listFreidoras.add(new FreidoraAire("R2-D2", 6900, 420, 990));
            listFreidoras.add(new FreidoraAceite("Freineitor2000", 720, 1100, 500));
            listFreidoras.add(new FreidoraAire("Dune2", 18, 5, 90000));
        } catch (DataException de) {
            System.out.println(de);
        }

        // Programa
        do {
            try {
                indice();
                uIndice = Byte.parseByte(sc.nextLine());

                switch (uIndice) {
                    case 0 -> System.out.println("Cerrando el programa...");
                    case 1 -> addFreidora(listFreidoras);
                    case 2 -> aumentarPrecio21(listFreidoras);
                    case 3 -> mostrarProductos(listFreidoras);
                    case 4 -> VolcarFichero(listFreidoras);
                    default -> System.out.println("Indice no valido");
                }
            } catch (DataException de) {
                System.out.println(de);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while (uIndice != 0);
        sc.close();
    }

    // Metodos
    // Pedir al Usuario
    public static String pedirModelo() {
        System.out.println("Inserte MODELO:");
        return sc.nextLine();
    }

    public static int pedirPrecio() {
        System.out.println("Inserte PRECIO:");
        return Integer.parseInt(sc.nextLine());
    }

    public static int pedirConsumo() {
        System.out.println("Inserte CONSUMO:");
        return Integer.parseInt(sc.nextLine());
    }

    public static int pedirVolumen() {
        System.out.println("Inserte Volumen");
        return Integer.parseInt(sc.nextLine());
    }

    // Indice
    public static void indice() {
        System.out.println("""
                                
                ***** INDICE *****
                1\tAñadir freidoras
                2\tAumentar el precio en un 21%
                3\tMostrar datos
                4\tVolcar datos a fichero ordenando por precio
                """);
    }

    // Añadir nueva freidora

    /**
     * Añade una nueva freidora al Arraylist.
     */
    public static void addFreidora(ArrayList<Freidora> listFreidoras) throws DataException {
        System.out.println("""
                *** OPCIONES ***
                1\tFreidora de Aceite
                2\tFreidora de Aire
                """);
        byte option = Byte.parseByte(sc.nextLine());
        switch (option) {
            case 1 ->
                    listFreidoras.add(new FreidoraAceite(pedirModelo(), pedirPrecio(), pedirConsumo(), pedirVolumen()));
            case 2 -> listFreidoras.add(new FreidoraAire(pedirModelo(), pedirPrecio(), pedirConsumo(), pedirVolumen()));
            default -> System.out.println("Opción no valida. Volviendo...");
        }
    }

    // Subir Precio un 21%

    /**
     * Aumenta el precio de todas las freidoras en un 21%.
     */
    public static void aumentarPrecio21(ArrayList<Freidora> listFreidoras) throws DataException {
        for (Freidora freidora : listFreidoras) {
            freidora.setPrecio(freidora.getPrecio() * 1.21f);
            System.out.println(freidora.toString(true));
        }
    }

    // Mostrar todos los productos
    public static void mostrarProductos(ArrayList<Freidora> listFreidoras) {
        for (Freidora freidora : listFreidoras) {
            System.out.println(freidora.toString(true));
        }
    }

    public static void VolcarFichero(ArrayList<Freidora> listFreidoras) throws Exception {
        FileWriter fwFreidoras = new FileWriter("txt/freidora/listFreidoras.txt");
        for (Freidora freidora : listFreidoras) {
            fwFreidoras.write(freidora.toString(true) + '\n');
        }
        fwFreidoras.close();
    }
}
