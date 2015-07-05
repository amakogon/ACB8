package week3.day2;

import java.util.Scanner;

public class GuessNumber {
  public static void main(String[] args) {
    int random = (int) (Math.random() * 10);

    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number");
    int input = scanner.nextInt();

    while (input != random){
      System.out.println("Try again");
      input = scanner.nextInt();
    }

    System.out.println("Congratulations!");

  }
}
