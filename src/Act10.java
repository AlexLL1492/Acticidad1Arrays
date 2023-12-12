public class Act10 {
    public static void main(String[] args) {
        char[] profesora = {'p', 'a', 't', 'r', 'i', 'c', 'i', 'a'};

        System.out.print("En orden reverso: ");
        for (int i = profesora.length - 1; i >= 0; i--) {
            System.out.print(profesora[i] + " ");
        }
    }
}
