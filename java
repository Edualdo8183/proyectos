package modelo;

public class Persona {
    // Atributos sin private
    String nombre;
    int edad;
    double altura;
    String tipoSangre;

    // Constructor
    public Persona(String nombre, int edad, double altura, String tipoSangre) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.tipoSangre = tipoSangre;
    }

    // Métodos de comportamiento
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void caminar() {
        System.out.println(nombre + " está caminando.");
    }

    // Método para mostrar los datos de la persona
    public void mostrarDatos() {
        System.out.println("\nDatos de la persona:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad + " años");
        System.out.println("Altura: " + altura + " m");
        System.out.println("Tipo de sangre: " + tipoSangre);
    }
}