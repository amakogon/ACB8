package week3.day1;

import helper.MatrixHelper;

public class Task1 {
  public static void main(String[] args) {
    int[][] matrix = MatrixHelper.generate(3, 4);
    MatrixHelper.print(matrix);

//    change first and last row in matrix
    for (int i = 0; i < matrix[0].length; i++) {

      int temp = matrix[0][i];
      matrix[0][i] = matrix[matrix.length - 1][i];
      matrix[matrix.length - 1][i] = temp;

    }
    System.out.println("~~~~~~~~~~~~~~~~");
    MatrixHelper.print(matrix);

  }
}
