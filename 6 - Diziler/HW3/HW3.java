public class HW3 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        printMatrix(matrix);

        int[][] transpoze = new int[3][2];

        transpoze = getTranspoze(matrix, transpoze);

        printMatrix(transpoze);
    }

    public static int[][] getTranspoze(int[][] matrix, int[][] transpoze) {
        if (matrix.length == transpoze[0].length) {
            for (int row = 0; row < matrix.length; row++) {
                for (int col = 0; col < matrix[row].length; col++) {
                    transpoze[col][row] = matrix[row][col];
                }
            }
        }

        return transpoze;
    }

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            System.out.println();
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
        }
    }
}
