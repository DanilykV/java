public class Main {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо передать два числа в качестве аргументов");
            return;
        }
        
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        
        int result = x > y ? x * 5 : y * 5;
        
        System.out.println("Результат: " + result);
    }
}