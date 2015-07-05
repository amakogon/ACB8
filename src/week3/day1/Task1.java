package week3.day1;

import helper.MatrixHelper;

public class Task1 {
  public static void main(String[] args) {
    int[][] matrix = MatrixHelper.generate(3, 4);
    MatrixHelper.print(matrix);

//    change first and last row in matrix
//    for (int i = 0; i < matrix[0].length; i++) {
//      MatrixHelper.swap(matrix, 0, i, matrix.length - 1, i);
//    }
    MatrixHelper.changeRows(matrix, 0, matrix.length - 1);
    System.out.println("~~~~~~~~~~~~~~~~");
    MatrixHelper.print(matrix);

  }
}
