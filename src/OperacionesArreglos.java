import java.util.Scanner;

public class OperacionesArreglos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Definir dos arreglos unidimensionales para 7 números
        int[] arreglo1 = new int[7];
        int[] arreglo2 = new int[7];
        int[] arreglo3 = new int[7]; // Tercer arreglo para la diferencia

        double sumaTotal = 0; // Variable para calcular el promedio

        System.out.println("=== LLENADO DEL PRIMER ARREGLO ===");
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingresa el número para la posición " + (i + 1) + ": ");
            arreglo1[i] = scanner.nextInt();
        }

        System.out.println("\n=== LLENADO DEL SEGUNDO ARREGLO ===");
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingresa el número para la posición " + (i + 1) + ": ");
            arreglo2[i] = scanner.nextInt();
        }

        // 2. Llenar el tercer arreglo con la diferencia (Arreglo 1 - Arreglo 2)
        for (int i = 0; i < 7; i++) {
            arreglo3[i] = arreglo1[i] - arreglo2[i];

            // Sumamos los datos del tercer arreglo para sacar su promedio
            sumaTotal += arreglo3[i];
        }

        // Calcular el promedio (usamos 7.0 para que el resultado tenga decimales exactos)
        double promedio = sumaTotal / 7.0;

        // 3. Mostrar todos y cada uno de los datos del tercer arreglo
        System.out.println("\n=== RESULTADOS DEL TERCER ARREGLO (DIFERENCIA) ===");
        for (int i = 0; i < 7; i++) {
            System.out.println("Posición [" + i + "] = " + arreglo3[i]);
        }

        // 4. Mostrar el promedio
        System.out.println("\n------------------------------------------------");
        System.out.println("El promedio de los datos del tercer arreglo es: " + promedio);
        System.out.println("------------------------------------------------");

        scanner.close();
    }
}