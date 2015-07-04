package week3.day1;

import helper.MatrixHelper;

public class MatrixExample {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};
/*    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }*/
    MatrixHelper.print(matrix);

    System.out.println("~~~~~~~~~~~~~");
    int[][] matrix2 = MatrixHelper.generate(3, 4);
    MatrixHelper.print(matrix2);


  }
}
