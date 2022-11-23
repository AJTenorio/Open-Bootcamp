public class Main {
    public static void main(String[] args) {

        Cliente client = new Cliente();

        client.Nombre = "Antony Tenorio Cevallos";
        client.Edad = 28;
        client.Telefono = "0985742398";
        client.Credito = 2516.82;

        System.out.printf("Nombre de cliente: " + client.Nombre + " tiene " + client.Edad + " años, su numero telefonico es: "
                + client.Telefono + " y tiene un credito de " + client.Credito + " $");

        System.out.printf("\n\n");

        Trabajador employee = new Trabajador();

        employee.Nombre = "Jenniffer Llivisaca";
        employee.Edad = 28;
        employee.Telefono = "0954531258";
        employee.Salario = 6242.35;

        System.out.printf("Nombre del trabajador: " + employee.Nombre + " tiene " + employee.Edad + " años, su numero telefonico es: "
                + employee.Telefono + " y tiene un credito de " + employee.Salario + " $");

        System.out.printf("\n");
    }
}

class Persona {
    int Edad;
    String Telefono;
    String Nombre;
}

class Cliente extends Persona {
    double Credito;
}

class Trabajador extends Persona {
    double Salario;
}