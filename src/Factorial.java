
public class Factorial {
    public static void main (String[] args) {
        long result = 1;
        int factorialMax = 14;

        StringBuilder numbers = new StringBuilder("1");

        System.out.println("Факториал для чисел от 1 до " + factorialMax);
        System.out.println("!0 = 1");
        System.out.println("!1 = 1");

        for (int i = 2; i <= factorialMax; i++) {
            result = result * i;
            numbers.append(" x ").append(i);
            System.out.printf("!" + i + " = " + "[" + numbers + "]" + " = " + "%,d %n", result);
        }
    }

}
