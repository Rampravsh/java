public class Array2 {
    public static void main(String[] args) {
        // int[][] matrix = new int[3][4];
        // int x = 29;
        // for (int i = 0; i < matrix.length; i++) {
        //     for (int j = 0; j < matrix[i].length; j++) {
        //         matrix[i][j] = x++;
        //     }
        // }

        int[][] matrix={{1,2,4},{3,4,5,6}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
