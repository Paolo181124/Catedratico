public class Test {
    public static void main(String[] args) {
        
        Catedratico cat1 = new Catedratico("Juan", "Calle 1", "12345678", "Mate");
        Catedratico cat2 = new Catedratico("Pedro", "Calle 2", "87654321", "Fisica");
        Catedratico cat3 = new Catedratico("Daniel", "Calle 3", "11223344", "Ingles");

        Curso curso1 = new Curso(1, "Mate 99", 2, 4, cat1);
        Curso curso2 = new Curso(2, "Fisica 88", 5, 3, cat2);
        Curso curso3 = new Curso(3, "Ingles 93", 5, 3, cat3);

        Alumno alumno1 = new Alumno("Paolo", "Calle A", "55667788", 20);
        Alumno alumno2 = new Alumno("Andre", "Calle B", "11111111", 22);
        Alumno alumno3 = new Alumno("Pancrasio", "Calle C", "216541651", 21);

        Asignacion asignacion1 = new Asignacion(alumno1);
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);

        Asignacion asignacion2 = new Asignacion(alumno2);
        asignacion2.addCurso(curso1); // Aquí no debería haber espacio si se ha llenado con Carlos
        asignacion2.addCurso(curso3);

        Asignacion asignacion3 = new Asignacion(alumno3);
        asignacion3.addCurso(curso2);
        asignacion3.addCurso(curso3);

        System.out.println("Datos de los Catefraticos:");
        cat1.imprimirDatos();
        cat2.imprimirDatos();
        cat3.imprimirDatos();

        System.out.println("Datos de los Alumnos:");
        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();

        System.out.println("Verificación de espacio en los cursos:");
        System.out.println("Curso 1: " + curso1.getTitulo() + " - Espacio disponible: " + curso1.verificaEspacio());
        System.out.println("Curso 2: " + curso2.getTitulo() + " - Espacio disponible: " + curso2.verificaEspacio());
        System.out.println("Curso 3: " + curso3.getTitulo() + " - Espacio disponible: " + curso3.verificaEspacio());
    }
}
