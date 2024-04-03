package ejercicioCadena;

/**
 * Almacena una palabra para poder hacer distintas operaciones con ella.
 */
public class Cadena {

    // Atributos
    private String palabra;

    //Contructores

    /**
     * Constructor de la clase cadena. Almacena la palabra introducida como un atributo.
     * @param palabra
     */
    public Cadena(String palabra){
        this.palabra = palabra;
    }
    // Getters & Setters

    /**
     * Obtiene la palabra almacenada
     * @return String
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * Cambia la palabra almacenada por la introducida.
     * @param palabra
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    // Metodos

    /**
     * Invierte la palabra almacenada en el objeto usando charAt.
     * @return String
     */
    public String palabraInvertida(){
        StringBuilder inversa = new StringBuilder();

        for (int i = palabra.length()-1; i>=0 ; i--){
            inversa.append(palabra.charAt(i));
        }

        return inversa.toString();
    }

    /**
     * Invierte la palabra almacenada en el objeto usando un Array
     * @return String
     */
    public String palabraInvertida2(){
        StringBuilder inversa = new StringBuilder();
        char[] word = palabra.toCharArray();

        for (int i = word.length-1 ; i >= 0; i--){
            inversa.append(word[i]);
        }

        return inversa.toString();
    }
}
