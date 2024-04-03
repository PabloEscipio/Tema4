package lunes.dos;

public class Triangulo {
    // Atributos
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructores
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Getters & Setters
    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    // toString
    public String toString(){
        return "Lado 1: " + lado1 + "\tLado 2 : " + lado2 + "\tLado 3 : " + lado3;
    }

    // Metodos

    /**
     * @Descrition Devuelve "true" si es un triángulo (la suma de dos lados es mayor que el otro lado).
     * @return boolean
     */
    public boolean esTriangulo(){
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }

    /**
    * @Descrition Devuelve "true" si es Isosceles (dos lados iguales).
    * @Return boolean
     */
    public boolean isosceles(){
        return lado1 == lado2 || lado1 == lado3 || lado2 == lado3;
    }

    /**
    * @Descrition Devuelve "true" si es Escaleno (todos los lados diferentes).
    * @Return boolean
     */
    public boolean escaleno(){
        return lado1 != lado2 && lado1 != lado3 && lado2 != lado3;
    }

    /**
    * @Descrition Devuelve "true" si es Equilatero (todos los lados iguales).
    * @Return boolean
     */
    public boolean equilatero(){
        return lado1 == lado2 && lado1 == lado3;
    }
}
