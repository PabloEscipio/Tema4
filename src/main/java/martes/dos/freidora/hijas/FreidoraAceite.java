package martes.dos.freidora.hijas;

import martes.dos.Exceptions.DataException;
import martes.dos.freidora.Freidora;

public class FreidoraAceite extends Freidora {
    // Atributos
    private int volumenAceite;

    // Constructores
    public FreidoraAceite(String modelo, int precio, int consumo, int volumenAceite) throws DataException {
        super(modelo, precio, consumo);
        setVolumenAceite(volumenAceite);
    }

    // Getters & Setters
    public int getVolumenAceite() {
        return volumenAceite;
    }

    public void setVolumenAceite(int volumenAceite) throws DataException {
        if (volumenAceite > 0) {
            this.volumenAceite = volumenAceite;
        } else {
            throw new DataException();
        }
    }

    // toString

    @Override
    public String toString(boolean line) {
        if (line) {
            return super.toString(true) + "\t Volumen de aceite: " + volumenAceite;
        } else {
            return super.toString(false) + "\nVolumen de aceite: " + volumenAceite;
        }
    }

    // Metodos
}
