package listas;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {

        Listas listas = new Listas();

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Marcador");
        lista.add("Azul");
        lista.add("Aroma");
        lista.add("Oro");

        Respuesta repuesta = listas.crearListas(lista);

        System.out.println( repuesta.getListaConsonantes() );
        System.out.println( repuesta.getListaVocales() );

    }

    /**
     * Método que recibe una lista de palabras y devuelve dos listas,
     * una con las palabras que empiezan y terminan con consonante
     * y otra con las palabras que empiezan y terminan con vocal.
     * @param palabras Lista de palabras
     * @return Objeto listas.Respuesta con las dos listas
     */
    public Respuesta crearListas(ArrayList<String> palabras){

        ArrayList<String> listaVocales = new ArrayList<>();
        ArrayList<String> listaConsonantes = new ArrayList<>();

        for(String palabra : palabras){

            if( validarConsonanteInicioFin(palabra) ){
                listaConsonantes.add(palabra);
            }else{
                if( validarVocalInicioFin(palabra) ){
                    listaVocales.add(palabra);
                }
            }

        }

        // Se crea un objeto listas.Respuesta con las dos listas
        return new Respuesta(listaVocales, listaConsonantes );
    }

    /**
     * Método que recibe una palabra y devuelve true si la palabra empieza y termina con consonante
     * @param palabra Palabra a validar
     * @return true si la palabra cumple con la condición
     */
    public boolean validarConsonanteInicioFin(String palabra){

        palabra = palabra.toLowerCase();

        char letraInicial = palabra.charAt(0);
        char letraFinal = palabra.charAt( palabra.length()-1 );

        return esConsonante(letraInicial) && esConsonante(letraFinal);
    }

    /**
     * Método que recibe una palabra y devuelve true si la palabra empieza y termina con vocal
     * @param palabra Palabra a validar
     * @return true si la palabra cumple con la condición
     */
    public boolean validarVocalInicioFin(String palabra){

        palabra = palabra.toLowerCase();

        char letraInicial = palabra.charAt(0);
        char letraFinal = palabra.charAt( palabra.length()-1 );

        return esVocal(letraInicial) && esVocal(letraFinal);
    }

    /**
     * Método que recibe una letra y devuelve true si es una vocal
     * @param letra Letra a validar
     * @return true si la letra es una vocal
     */
    public boolean esVocal(char letra){
        return letra == 'a' ||
                letra == 'e' ||
                letra == 'i' ||
                letra == 'o' ||
                letra == 'u' ||
                letra == 'á' ||
                letra == 'é' ||
                letra == 'í' ||
                letra == 'ó' ||
                letra == 'ú';
    }

    /**
     * Método que recibe una letra y devuelve true si es una consonante
     * @param letra Letra a validar
     * @return true si la letra es una consonante
     */
    public boolean esConsonante(char letra){

        if( !esVocal(letra) && (letra>=97 && letra<=122) ){
            return true;
        }else{
            return false;
        }

    }

}
