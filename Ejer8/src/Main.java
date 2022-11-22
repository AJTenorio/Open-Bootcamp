public class Main {
    public static void main(String[] args) {

        Persona newPerson = new Persona();
        newPerson.setNombre("Antony Tenorio Cevallos");
        System.out.printf("Mi nombre es: " + newPerson.getNombre() + " \n");
        newPerson.setEdad(28);
        System.out.printf("Tengo: " + newPerson.getEdad() + " \n");
        newPerson.setTelefono("0938451842");
        System.out.printf("Y mi numero de telefono es: " + newPerson.getTelefono() + " \n");
    }
}

class Persona {
    private String Nombre;
    private int Edad;
    private String Telefono;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }
}