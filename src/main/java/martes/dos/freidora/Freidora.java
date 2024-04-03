package martes.dos.freidora;

import martes.dos.Exceptions.DataException;

public class Freidora {
    // Atributos
    protected String modelo;
    protected float precio;
    protected int consumo;

    // Constructor
    public Freidora(String modelo, int precio, int consumo) throws DataException {
        this.modelo = modelo;
        setPrecio(precio);
        setConsumo(consumo);
    }

    // Getters & Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) throws DataException {
        if (precio > 0) {
            this.precio = precio;
        } else {
            throw new DataException();
        }
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) throws DataException {
        if (consumo > 0) {
            this.consumo = consumo;
        } else {
            throw new DataException();
        }
    }

    // toString

    /**
     * @return String
     * @ param boolean line: Formato en linea si/no
     */
    public String toString(boolean line) {
        if (line) {
            return "Modelo: " + modelo + "\tPrecio: " + precio + "\tConsumo: " + consumo;
        } else {
            return "--- Freidora ---" + "\nModelo: " + modelo + "\nPrecio: " + precio + "\nConsumo: " + consumo;
        }
    }

    // Metodos

    // Tests
}
