public class MatrixCalculations {
    
    public static void main(String[] args){

        // Define the 2 Matrices.
        int [][] matrix1 = {
            {10,20,30},
            {40,50,60}
        };

        int [][] matrix2 = {
            {70,80,90},
            {100,110,120}
        };

        // Matrix Result
        int[][] result = new int[matrix1.length][matrix2[0].length];

        // Multiply Matrices.
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Display Result with an enhanced for loop.
        System.out.println("Matrix Result: ");
        for (int[] row: result) {
            for (int value: row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}

    

