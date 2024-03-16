import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        int a = scanner.nextInt();
        System.out.print("Введите b: ");
        int b = scanner.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

    double d = Math.pow(max, 5) - 3.2 * min / (1 + min);
System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("d: " + d);

        scanner.close();
    }
}