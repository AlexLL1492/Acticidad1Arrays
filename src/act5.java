public class act5 {
    public static void main(String[] args){
        int array[] = new int[7];
        int indice;
        array[6] = 42;

        indice = 0;
        array[indice] = 71;

        indice = 5;
        array[indice] = 23;

        indice = 3;

        array[2+2] = array[indice - 3];

        System.out.println(array);
    }
}
