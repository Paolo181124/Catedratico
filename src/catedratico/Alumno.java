public class Alumno {
    private static int CCarnet = 0;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;

    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = ++CCarnet;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("carnet: " + carnet);
        System.out.println("nombre: " + nombre);
        System.out.println("dirección: " + direccion);
        System.out.println("teléfono: " + telefono);
        System.out.println("Edad: " + edad);
    }
}
