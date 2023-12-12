import java.util.Scanner;

public class ArrayTester {

    public static void main(String[] args) {
        int[] array = leerEnteros();
        System.out.println("Array original:");
        imprimirArray(array);

        int[] nuevoArray = transformarArray(array);
        System.out.println("Array transformado:");
        imprimirArray(nuevoArray);
    }

    public static int[] leerEnteros() {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        System.out.println("Introduce 5 números enteros:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] transformarArray(int[] array) {
        int[] nuevoArray = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                nuevoArray[i] = array[i];
            } else {
                nuevoArray[i] = -1;
            }
        }

        return nuevoArray;
    }
}