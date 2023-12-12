public class act12 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};

        int[] array2 = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
                array2[i] = array1[array1.length - 1 - i];
        }

        System.out.println("array1: ");
        for (int value : array1) {
                System.out.print(value + " ");
        }

        System.out.println("array2 (en orden inverso): ");
        for (int value : array2) {
                System.out.print(value + " ");
        }
    }
}

