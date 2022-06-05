public class Pratik3 {
    public static void main(String[] args) {
        String[][] matrix = new String[7][4];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if ((row == 0) || (row == 3) || (row == 6)) {
                    matrix[row][col] = " * ";
                } else if ((col == 0) || (col == 3)) {
                    matrix[row][col] = " * ";
                } else {
                    matrix[row][col] = "   ";
                }

		if ((row == 3) && (col == 3)) {
		    matrix[row][col] = "   ";
		}

                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }
}
