import java.util.ArrayList;
import java.util.List;

public class Asignacion {
    private Alumno alumno;
    private List<Curso> cursos;

    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            cursos.add(curso);
            curso.asignarAlumno();
        } else {
            System.out.println("El curso " + curso.getTitulo() + " no tiene espacio disponible.");
        }
    }
}
