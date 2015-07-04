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

  public static void print(int[][] matrix){
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }


}
