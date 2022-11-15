public class Main {

    public static void main(String[] args) {

        System.out.println("\nIF-ELSE\n");
        int numeroIf = -5;
        // IF

        if (numeroIf < 0) {
            System.out.println("El numero " + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else {
            System.out.println("El numero es 0");
        }

        //WHILE
        System.out.println("\nWHILE\n");
        int numeroWhile = 1;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("El numero es: " + numeroWhile);
        }

        //DO - WHILE
        System.out.println("\nDO - WHILE\n");
        int numeroDoWhile = 2;
        do {
            numeroDoWhile++;
            System.out.println("El numero es: " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //FOR
        System.out.println("\nFOR\n");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("El numero es: " + numeroFor);
        }

        //SWITCH
        System.out.println("\nSWITCH\n");
        String estacion = "primavera";
        switch (estacion) {
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            default:
                System.out.println("No es una estación");
        }
    }
}