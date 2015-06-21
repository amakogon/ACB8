package week1.day2;

import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first value");
    int a = sc.nextInt();
    System.out.println("Enter second value");
    int b = sc.nextInt();

    if (a > 20 && b > 20) {
      System.out.println("Good");
    } else {
      System.out.println("Bad");
    }

  }
}
