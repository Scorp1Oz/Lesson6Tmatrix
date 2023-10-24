import java.util.Scanner;
import java.util.Arrays;
public class Project {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введіть кількість рядків (M): ");
            int M = scanner.nextInt();
            System.out.print("Введіть кількість стовпців (N): ");
            int N = scanner.nextInt();

            int[][] originalMatrix = new int[M][N];
            int[][] transposedMatrix = new int[N][M];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    originalMatrix[i][j] = (int) (Math.random() * 100);
                }
            }

            System.out.println("Початкова матриця:");
            printMatrix(originalMatrix);

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    transposedMatrix[j][i] = originalMatrix[i][j];
                }
            }

            System.out.println("Транспонована матриця:");
            printMatrix(transposedMatrix);

            for (int i = 0; i < M; i++) {
                Arrays.sort(originalMatrix[i]);
            }

            System.out.println("Матриця з відсортованими рядками:");
            printMatrix(originalMatrix);

            System.out.print("Введіть число для пошуку: ");
            int searchNumber = scanner.nextInt();
            boolean found = false;
            for (int i = 0; i < M; i++) {
                if (Arrays.binarySearch(originalMatrix[i], searchNumber) >= 0) {
                    found = true;
                    System.out.println("Число " + searchNumber + " знайдено в рядку " + i);
                    break;
                }
            }
            if (!found) {
                System.out.println("Число " + searchNumber + " не знайдено в матриці.");
            }
        }

        public static void printMatrix(int[][] matrix) {
            for (int[] row : matrix) {
                for (int element : row) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }
}

