/*
3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов 
двух входящих массивов в той же ячейке.  
Если длины массивов не равны, необходимо как-то оповестить пользователя.  
Важно: При выполнении метода единственное исключение, которое пользователь 
может увидеть - RuntimeException, т.е. ваше.
 */

import java.util.Arrays;

public class HomeTask3 {
    public static void main(String[] args) {
        // int[] a = new int[] { 10, 20, 30 }; // int[] a без исключений
        int[] a = new int[] { 10, 20 };     // int[] a для исключения 1 (длины массивов)
        int[] b = new int[] { 2, 4, 6 };    // int[] b без исключений
        // int[] b = new int[] { 2, 0, 6 };    // int[] b для исключения 2 (деление на ноль)

        System.out.println("Массив a: " + Arrays.toString(a));
        System.out.println("Массив b: " + Arrays.toString(b));
        System.out.println("Результат деления массивов a/b : " +
                Arrays.toString(divideArrays(a, b)));
    }

    private static int[] divideArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            throw new RuntimeException("Массивы не равны по длине");
        }
        int[] res = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (b[i] == 0) {
                throw new RuntimeException("Error: Деление на ноль.\n" +
                        "Значение 2-го массива по индексу " + i + " равно 0.");
            }
            res[i] = a[i] / b[i];
        }
        return res;
    }
}
