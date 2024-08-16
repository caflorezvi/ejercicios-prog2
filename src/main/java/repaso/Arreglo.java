package repaso;

public class Arreglo {

    public static void main(String[] args) {

        Arreglo arreglo = new Arreglo();

        int[] arr = { 10,8,6,5 };
        arreglo.imprimir(arr);
        System.out.println();

        int[] respuesta = arreglo.invertirArreglo(arr);
        arreglo.imprimir(respuesta);
    }

    /**
     * Metodo que recibe un arreglo de enteros e imprime cada elemento en consola
     * @param arreglo arreglo de enteros
     */
    public void imprimir(int[] arreglo){
        for (int i =0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+"\t");
        }
    }

    /**
     * Metodo que recibe un arreglo de enteros y devuelve el mismo arreglo pero invertido
     * @param arreglo arreglo de enteros
     * @return arreglo invertido
     */
    public int[] invertirArreglo(int[] arreglo){

        int i = 0;
        int j = arreglo.length-1;

        while( i < j ){
            int temp = arreglo[j];
            arreglo[j] = arreglo[i];
            arreglo[i] = temp;
            i++;
            j--;
        }

        return arreglo;
    }

}
