package helper;

public class MatrixHelper {

  public static int[][] generate(int rows, int columns) {
    int[][] matrix = new int[rows][columns];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
      }
    }
    return matrix;
  }

  public static void print(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void swap(int[][] matrix, int i1, int j1, int i2, int j2) {
    int c = matrix[i1][j1];
    matrix[i1][j1] = matrix[i2][j2];
    matrix[i2][j2] = c;
  }

  public static void changeRows(int[][] matrix, int row1, int row2) {
//    for (int i = 0; i < matrix[row1].length; i++) {
//      MatrixHelper.swap(matrix, row1, i, row2, i);
//    }
    int[] temp = matrix[row1];
    matrix[row1] = matrix[row2];
    matrix[row2] = temp;
  }


}
