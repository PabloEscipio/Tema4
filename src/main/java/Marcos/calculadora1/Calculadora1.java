package calculadora1;

public class Calculadora1 {

	public static int sumar(int a, int b) {
		return a+b;
	}
	
	public static int restar(int a, int b) {
		return a-b;
	}
	
	public static int dividir(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}
		return a/b;
	}
	
	public static void main(String[] args) {
		int a=3;
		int b=2;
		int res=sumar(a,b);
		int esperado=5;
		if(res==esperado) {
			System.out.println("CORRECTO");
		}else {
			System.out.println("INCORRECTO");
		}
		
	}

}
