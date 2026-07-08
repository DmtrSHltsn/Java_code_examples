import java.math.BigInteger;

public class Factorial {
    public static void main (String[] args) {

        // Пример #1
        // Факториал до 20 включительно можно посчитать, используя тип переменной long
        // больше только через BigInteger
        long factorialValue = 1; // задаем первоначальное значение факториала для 0 и 1
        int factorialMax = 20; // задаем максимальный факториал для учебной задачи

        // через StringBuilder начинаем формировать строку со всеми множителями, входящими в факториал
        StringBuilder numbers = new StringBuilder("1"); // первый множитель ставим 1

        System.out.println("Факториал для чисел от 1 до " + factorialMax);
        System.out.println("!0 = 1");
        System.out.println("!1 = 1");

        for (int i = 2; i <= factorialMax; i++) {
            factorialValue *=i; // умножаем текущее значение факториала на i-й элемент факториала
            numbers.append(" x ").append(i); // добавляем в строку знак умножения и i-й элемент факториала

            System.out.println("!" + i + " = " + "[" + numbers + "]" + " = " + factorialValue);
            // System.out.printf("%,d %n", factorialValue); // применяем форматированный вывод факториала
            }

        System.out.println("-----------------------------------------------------------------------------------");

        // Пример #2
        // Для вычисления факториал свыше 20, используем тип BigInteger
        BigInteger bigFactorialValue = BigInteger.ONE; // задаем первоначальное значение факториала для 0 и 1
        int bigFactorialMax = 22; // задаем максимальный факториал для учебной задачи

        // через StringBuilder начинаем формировать строку со всеми множителями, входящими в факториал
        StringBuilder bigNumbers = new StringBuilder("1"); // первый множитель ставим 1

        System.out.println("Факториал для чисел от 1 до " + bigFactorialMax);
        System.out.println("!0 = 1");
        System.out.println("!1 = 1");

        for (int i = 2; i <= bigFactorialMax; i++) {
            bigFactorialValue = bigFactorialValue.multiply(BigInteger.valueOf(i)); // умножаем текущее значение факториала на i-й элемент факториала
            bigNumbers.append(" x ").append(i); // добавляем в строку знак умножения и i-й элемент факториала

            System.out.println("!" + i + " = " + "[" + bigNumbers + "]" + " = " + bigFactorialValue);
            //System.out.printf("%,d %n", bigFactorialValue); // применяем форматированный вывод факториала
        }
    }
}
