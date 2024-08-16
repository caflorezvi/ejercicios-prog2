package estudiantes;

import java.util.ArrayList;

public class Escuela {

    private ArrayList<Estudiante> estudiantes;

    public Escuela(){
        //Inicializar la lista de estudiantes
        this.estudiantes = new ArrayList<>();
    }

    /**
     * Agrega un estudiante a la lista de estudiantes
     * @param id Identificador del estudiante
     * @param nombre Nombre del estudiante
     * @param edad Edad del estudiante
     * @param nota Nota del estudiante
     * @throws Exception En caso de que la edad sea negativa o la nota no esté entre 0 y 5
     */
    public void agregarEstudiante(String id, String nombre, short edad, float nota) throws Exception{

        if(edad < 0){
            throw new Exception("La edad NO puede ser negativa");
        }

        if(nota < 0 || nota >5){
            throw new Exception("La nota debe entar entre 0 y 5");
        }

        //Crear un nuevo estudiante
        Estudiante estudiante = new Estudiante(id, nombre, edad, nota);
        //Agregar el estudiante a la lista
        estudiantes.add(estudiante);
    }

    /**
     * Elimina un estudiante de la lista de estudiantes
     * @param id Identificador del estudiante a eliminar
     * @throws Exception En caso de que el id no exista
     */
    public void eliminarEstudiante(String id) throws Exception{
        //Buscar el estudiante con el id
        Estudiante estudiante = buscarEstudiante(id);
        //Eliminar el estudiante
        estudiantes.remove(estudiante);
    }

    /**
     * Busca un estudiante por su id
     * @param id Identificador del estudiante a buscar
     * @return El estudiante con el id proporcionado
     * @throws Exception En caso de que el id no exista
     */
    public Estudiante buscarEstudiante(String id) throws Exception{

        //Recorrer la lista de estudiantes
        for(int i = 0; i<estudiantes.size(); i++){
            Estudiante e = estudiantes.get(i);
            if(e.getId().equals(id)){
                return e;
            }
        }

        //Si no se encontró el estudiante se lanza una excepción
        throw new Exception("El id "+id+" NO existe");
    }

    /**
     * Imprime la lista de estudiantes en consola
     */
    public void imprimirEstudiantes(){
        System.out.println(estudiantes);
    }

}
