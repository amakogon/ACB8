package week2.day2;

import java.util.Scanner;

public class CreateArray {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array size");
    int size = scanner.nextInt();

    int[] mas = createArray(size);

    for (int i = 0; i < mas.length; i++) {
      System.out.print(mas[i] + " ");
    }
  }

  public static int[] createArray(int size) {
      int[] array = new int[size];

      for (int i = 0; i < array.length; i++) {
        array[i] = (int) (Math.random() * 10);
      }

      return array;
  }
}
