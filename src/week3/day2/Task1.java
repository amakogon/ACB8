package week3.day2;

import helper.MatrixHelper;

public class Task1 {
  public static void main(String[] args) {
    int[][] matrix = MatrixHelper.generate(3, 3);
    MatrixHelper.print(matrix);

    int[] temp = matrix[0];
    matrix[0] = matrix[2];
    matrix[2] = temp;
    System.out.println("~~~~~~~~~~~~");
    MatrixHelper.print(matrix);

  }
}
