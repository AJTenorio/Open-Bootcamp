public class Main {
    public static void main(String[] args) {
        //Primera Parte
        System.out.println("Primera parte....\n");
        int resultado = 0;
        resultado = suma(4, 2, 8);
        System.out.println("La Suma es: " + resultado);

        System.out.println("\n\nSegunda parte....\n");
        Coche miCoche = new Coche();
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        miCoche.AumentarPuerta();
        System.out.println("Mi Coche tiene " + miCoche.puertas + " puertas");
    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }

    public static class Coche {
        public int puertas = 0;

        public void AumentarPuerta() {
            this.puertas++;
        }
    }
}