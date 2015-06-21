package week1.day2;

import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first value");
    int a = sc.nextInt();
    System.out.println("Enter second value");
    int b = sc.nextInt();

    int sum = a + b;
    int diff = a - b;
    int multiplication = a * b;
    double division = a * 1.0 / b;

    System.out.println("Sum = " + sum);
    System.out.println("Diff = " + diff);
    System.out.println("Multiplication = " + multiplication);
    System.out.println("Division = " + division);
  }
}
