package Marcos.calcupro;

import java.util.Scanner;


public class TUIcalculadora {

	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		boolean exit = false;
		Calculadora cal=new Calculadora();
		
		while(!exit) {
			System.out.println("\n--------------------");
			System.out.println("1. Insertar un valor");
			System.out.println("2. Borrar el ultimo valor");
			System.out.println("3. Mostrar los valores de la memoria");
			System.out.println("4. Sumar los dos primeros valores de la memoria");
			System.out.println("5. Restar los dos primeros valores de la memoria");
			System.out.println("6. Multiplicar los dos primeros valores de la memoria");
			System.out.println("7. Dividir los dos primeros valores de la memoria");
			System.out.println("8. Potencia de la 1ª posición a la 2ª");
			System.out.println("9. Salir");
			System.out.println("--------------------");
			System.out.print("Introduzca opción: ");
			int opcion = sc.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Introduce un valor");
					double valor=sc.nextDouble();
					cal.insertar(valor);
					break;
				case 2:
					cal.borrar();
					break;
				case 3:
					cal.mostrar();
					break;
				case 4:
					cal.sumar();
					break;
				case 5:
					cal.restar();
					break;
				case 6:
					cal.multiplicar();
					break;
				case 7:
					cal.dividir();
					break;
				case 8:
					cal.potencia();
					break;
				case 9: 
					exit = true;
					break;
				default: 
					System.out.println("\nOpción no valida!");
			}
		}
		
		System.out.println("\nSe ha cerrado el programa");

	}

}
