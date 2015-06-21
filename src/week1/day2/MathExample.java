package week1.day2;

import java.util.Scanner;

public class MathExample {
  public static void main(String[] args) {
    int a = 3;
    int b = 8;
    int result = a + b;
    System.out.println("Sum a + b = " + result);

    //helper to input variables
    Scanner keyboard = new java.util.Scanner(System.in);
    System.out.println("Enter first value");
    int first = keyboard.nextInt();
    System.out.println("Enter second value");
    int sec = keyboard.nextInt();
    System.out.println(first + sec);

  }
}
