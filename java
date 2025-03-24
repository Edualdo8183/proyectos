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

package vista;

import modelo.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos al usuario
        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();

        System.out.print("¿Cuál es tu altura? ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("¿Cuál es tu tipo de sangre? ");
        String tipoSangre = scanner.nextLine();

        // Crear objeto Persona con los datos ingresados
        Persona persona1 = new Persona(nombre, edad, altura, tipoSangre);

        // Mostrar datos y llamar métodos
        persona1.mostrarDatos();
        persona1.comer();
        persona1.caminar();

        scanner.close();
    }
}