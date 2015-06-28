package week2.day1;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter array size");
    int arraySize = scanner.nextInt();

    int[] nums = new int[arraySize];

    for (int i = 0; i < arraySize; i++) {
      nums[i] = (int) (Math.random() * 10);
      System.out.print(nums[i] + " ");
    }

  }




}
