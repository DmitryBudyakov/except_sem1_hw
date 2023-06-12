/*
 * 1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.
 */

import java.util.Objects;

public class HomeTask1 {
 
    public static void main(String[] args) {
        System.out.println("--- ArithmeticException ---");
        try {
            int result = divide(10, 0);  // с исключением
            // int result = divide(10, 1);
            System.out.println(result);
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("--- NullPointerException ---");
        try {
            Object[] array = new Object[]{0,1,2,3,null,5,6}; // исключение
            // Object[] array = new Object[]{0,1,2,3,4,5,6};
            System.out.println(sumOfArray(array));
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        System.out.println("--- NumberFormatException ---");
        try {
            String s = "4O";    // исключение
            // String s = "40";
            System.out.println("String: " + s + " -> Integer: " + stringToInt(s));
            
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println("Error: Ошибка конвертации строки в число.");
        }

        System.out.println();
        System.out.println("Конец программы");

    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Error: Деление на ноль");
        }
        return a/b;
    }

    public static int sumOfArray(Object[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (Objects.isNull(array[i])) {
                throw new RuntimeException("Индекс " + i 
                + " имеет значение null");
            }
            sum += (int)array[i];
        }
        return sum;
    }

    public static int stringToInt(String s){
        return  Integer.parseInt(s);
    }
 }