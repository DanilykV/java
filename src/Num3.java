public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, -2, 3, -4},
            {-5, 6, -7, 8},
            {9, -10, 11, 12}
        };

        int[] B = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] >= 0) {
                    count++;
                }
            }
            B[i] = count;
        }

        System.out.print("Вектор B: ");
        for (int i = 0; i < B.length; i++) {
            System.out.print(B[i] + " ");
        }
    }
}