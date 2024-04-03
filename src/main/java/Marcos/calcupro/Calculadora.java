package Marcos.calcupro;
/**
 * Lógica de la calculadora
 */

import java.util.ArrayList;

public class Calculadora {
	//Atributos internos
	//Máximo tamaño de la memoria
	final static int maxMemoria=2;
	
	//Almacena los datos de la calculadora
	private ArrayList<Double> memoria;
	
	/**
	 * Devuelve la lista de la memoria de la calculadora
	 * @return el ArrayList de la memoria
	 * 
	 */
	public ArrayList<Double> getMemoria() {
		return memoria;
	}
	
	/**
	 * Constructor para inicializar la memoria
	 */
	public Calculadora() {
		memoria=new ArrayList<Double>();
	}

	/**
	 * Añade un valor a la memoria
	 * 
	 */
	public void insertar(double valor) {
		if(this.memoria.size()<Calculadora.maxMemoria) {
			this.memoria.add(valor);
		}else {
			System.out.println("\nLa memoria esta llena");
		}
	}
	
	/**
	 * Borrar el último valor 
	 */
	public void borrar() {
		if(!this.memoria.isEmpty()) {
			this.memoria.remove(this.memoria.size()-1);
		}else {
			System.out.println("\nLa memoria vacía");
		}
	}
	
	/**
	 * Sumar los dos primeros valores de la calculadora
	 *  
	 */
	public void sumar(){
		double suma=0;
		try {
			suma=this.memoria.get(0)+this.memoria.get(1);
			this.memoria.clear();
			this.insertar(suma);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("\nERROR: No hay suficientes valores");
		}
	}
	
	/**
	 * Restar los dos primeros valores de la calculadora
	 *  
	 */
	public void restar(){
		double resta=0;
		try {
			resta=this.memoria.get(0)-this.memoria.get(1);
			this.memoria.clear();
			this.insertar(resta);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("\nERROR: No hay suficientes valores");
		}
		
	}
	
	/**
	 * Multiplicar los dos primeros valores de la calculadora
	 * 
	 */
	public void multiplicar(){
		double multiplicacion=0;
		try {
			multiplicacion=this.memoria.get(0)*this.memoria.get(1);
			this.memoria.clear();
			this.insertar(multiplicacion);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("\nERROR: No hay suficientes valores");
		}
	}
	
	/**
	 * Dividir los dos primeros valores de la calculadora
	 * 
	 */
	public void dividir() {
		double div=0;
		try {
			if(this.memoria.get(1)!=0) {
				div=this.memoria.get(0)/this.memoria.get(1);
				this.memoria.clear();
				this.insertar(div);
			}else {
				throw new ArithmeticException();
			}
		}catch(IndexOutOfBoundsException e) {
			System.err.println("\nERROR: No hay suficientes valores");
		}catch(ArithmeticException e) {		
			System.err.println("\nERROR: No se puede dividir por cero");
		}
	}
	
	/**
	 * Potencia del primer valor al segundo de la calculadora
	 *  
	 */
	public void potencia(){
		double potencia=0;
		try {
			potencia=Math.pow(this.memoria.get(0),this.memoria.get(1));
			this.memoria.clear();
			this.insertar(potencia);
		}catch(IndexOutOfBoundsException e) {
			System.err.println("\nERROR: No hay suficientes valores");
		}
	}
	
	/**
	 * Mostrar valores de la memoria
	 */
	public void mostrar() {
		if(this.memoria.isEmpty()) {
			System.out.println("\nMemoria vacia");
		}else {
			for(double valor:this.memoria) {
				System.out.println(valor);
			}
		}
	}
}
