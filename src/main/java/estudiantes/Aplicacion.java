package estudiantes;

public class Aplicacion {

    public static void main(String[] args) throws Exception{

        Escuela escuela = new Escuela();
        escuela.agregarEstudiante("123","Pepito", (short) 20, 5.0f);
        escuela.agregarEstudiante("421","Marcos", (short) 21, 5.0f);
        escuela.agregarEstudiante("451","Juanita", (short) 22, 5.0f);

        escuela.imprimirEstudiantes();

        escuela.eliminarEstudiante("421");

        escuela.imprimirEstudiantes();

    }

}
