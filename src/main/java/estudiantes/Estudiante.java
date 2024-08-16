package estudiantes;

public class Estudiante {

    private String id;
    private String nombre;
    private short edad;
    private float nota;

    public Estudiante(String id, String nombre, short edad, float nota) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.nota = nota;
    }

    public String getId(){
        return id;
    }

    @Override
    public String toString() {
        return id+" - "+nombre;
    }
}
