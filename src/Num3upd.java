import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        
        int[][] matrix = new int[rows][cols];
        Random random = new Random();
        
        // Заполнение матрицы случайными значениями
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(21) - 10; // случайное число от -10 до 10
            }
        }
        
        // Печать матрицы
        System.out.println("Матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        
        // Построение вектора B
        int[] B = new int[rows];
        for (int i = 0; i < rows; i++) {
            B[i] = countNonNegativeElements(matrix[i]);
        }
        
        // Печать вектора B
        System.out.println("Вектор B:");
        for (int i = 0; i < rows; i++) {
            System.out.print(B[i] + " ");
        }
    }
    
    public static int countNonNegativeElements(int[] arr) {
        int count = 0;
        for (int i : arr) {
            if (i >= 0) {
                count++;
            }
        }
        return count;
    }
}