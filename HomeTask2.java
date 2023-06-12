/*
 * 2. Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 
 */

public class HomeTask2 {
    public static void main(String[] args) {
        System.out.println("--- 0. No Exceptions ---");
        String[][] array = new String[][] {
                { "0", "1", "2", "3", "4" }, { "5", "6", "7", "8", "9" } };
        System.out.println("Сумма = " + sum2d(array));

        System.out.println();
        System.out.println("--- 1. NumberFormatException ---");
        String[][] array1 = new String[][] {    // с исключением
                { "0", "1Z", "2", "3", "4" }, { "5", "6", "7", "8", "9" } };
        // String[][] array1 = new String[][] {    // без исключения
        //         { "0", "1", "2", "3", "4" }, { "5", "6", "7", "8", "9" } };
        System.out.println("Сумма = " + sum2d(array1));

        System.out.println();
        System.out.println("--- 2. ArrayIndexOutOfBoundsException ---");
        String[][] array2 = new String[][] {    // с исключением
                { "0", "1", "2", "3"}, { "5", "6", "7", "8", "9" } };
        // String[][] array2 = new String[][] {    // без исключения
        //         { "0", "1", "2", "3", "4"}, { "5", "6", "7", "8", "9" } };
        System.out.println("Сумма = " + sum2d(array2));
        System.out.println();

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
