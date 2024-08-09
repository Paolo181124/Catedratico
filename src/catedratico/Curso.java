public class Curso {
    private int id;
    private String titulo;
    private int NumMaxAlumnos;
    private int creditos;
    private Catedratico catedratico;
    private int alumnosAsignados;

    public Curso(int id, String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico) {
        this.id = id;
        this.titulo = titulo;
        this.NumMaxAlumnos = NumMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosAsignados = 0;
    }
    public String getTitulo() {
        return titulo;
    }

    public boolean verificaEspacio() {
        return alumnosAsignados < NumMaxAlumnos;
    }

    public void asignarAlumno() {
        if (verificaEspacio()) {
            alumnosAsignados++;
        } else {
            System.out.println("No hay espacio disponible en el curso " + titulo);
        }
    }
}
