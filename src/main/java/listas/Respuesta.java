package listas;

import java.util.ArrayList;

/**
 * Clase que contiene las listas de palabras que empiezan y terminan con vocal y consonante
 * @author caflorezvi
 *
 */
public class Respuesta {

    private ArrayList<String> listaVocales;
    private ArrayList<String> listaConsonantes;

    public Respuesta(ArrayList<String> listaVocales, ArrayList<String> listaConsonantes) {
        this.listaVocales = listaVocales;
        this.listaConsonantes = listaConsonantes;
    }

    public ArrayList<String> getListaVocales() {
        return listaVocales;
    }

    public void setListaVocales(ArrayList<String> listaVocales) {
        this.listaVocales = listaVocales;
    }

    public ArrayList<String> getListaConsonantes() {
        return listaConsonantes;
    }

    public void setListaConsonantes(ArrayList<String> listaConsonantes) {
        this.listaConsonantes = listaConsonantes;
    }
}
