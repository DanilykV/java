public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int max = Math.max(a, b); // Наибольшее число из a и b
        int min = Math.min(a, b); // Наименьшее число из a и b

        double d = Math.pow(max, 5) - 3.2 * min / (1 + min);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("d: " + d);
    }
}