package calculadora2;

public class Calculadora2 {
	//Atributo interno
	private int bf;
	
	//constructor
	public Calculadora2() {
		this.bf=0;
	}
	
	//Getter - Setter
	public int getBf() {
		return bf;
	}
	
	public void setBf(int bf) {
		this.bf=bf;
	}
	
	//Métodos
	public int add(int a, int b) {
		bf=a+b;
		return bf;
	}
	
	public int add(int a) {
		bf+=a;
		return bf;
	}
	
	public int subs(int a, int b) {
		bf=a-b;
		return bf;
	}
	
	public int subs(int a) {
		bf-=a;
		return bf;
	}
	
	public void clear() {
		bf=0;
	}
	
	public int div(int a, int b) {
		if(b==0) {
			throw new ArithmeticException("No se puede dividir por cero");
		}
		bf=a/b;
		return bf;
	}
}
