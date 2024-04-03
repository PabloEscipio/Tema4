package martes.dos.freidora.hijas;

import martes.dos.Exceptions.DataException;
import martes.dos.freidora.Freidora;

public class FreidoraAire extends Freidora {
    // Atributos
    private int volumenAire;

    // Constructor
    public FreidoraAire(String modelo, int precio, int consumo, int volumenAire) throws DataException {
        super(modelo, precio, consumo);
        setVolumenAire(volumenAire);
    }

    // Getters & Setters
    public int getVolumenAire() {
        return volumenAire;
    }

    public void setVolumenAire(int volumenAire) throws DataException {
        if (volumenAire > 0) {
            this.volumenAire = volumenAire;
        } else {
            throw new DataException();
        }
    }

    // toString
    @Override
    public String toString(boolean line) {
        if (line) {
            return super.toString(true) + "\tVolumen de aire: " + volumenAire;
        } else {
            return super.toString(false) + "\nVolumen de aire: " + volumenAire;
        }
    }

    // Metodos
}
