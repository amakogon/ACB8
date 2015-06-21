package week1.day2;

import java.util.Scanner;

public class ChooseRoadExample {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose road");
    int value = scanner.nextInt();

    if (value < 0) {
      System.out.println("You will loose your horse");
    } else if (value > 0) {
      System.out.println("You will find a wife");
    } else {
      System.out.println("You will die");
    }


  }
}
