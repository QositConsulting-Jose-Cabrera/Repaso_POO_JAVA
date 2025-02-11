package modelo;

public class Persona {

    private String nombre;
    private int edad;

  
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   
    public String getNombre() {
        return nombre;
    }

 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public int getEdad() {
        return edad;
    }

    
    public void setEdad(int edad) {
        this.edad = edad;
    }

 
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {

        // Ejemplo de uso
        Persona persona = new Persona("Juan", 25);
        persona.mostrarInformacion();

        persona.equals(persona);
        Persona persona2 = new Persona("Manolo", 30);
        persona2.mostrarInformacion();


        // Comparando los dos objetos

        if (persona.equals(persona2)) {
            System.out.println("Los objetos son iguales");
        } else {
            System.out.println("Los objetos son diferentes");
        }

    }

    
}
