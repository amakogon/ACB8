package week1.day2;

import java.util.Scanner;

public class IfExample {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter positive number");
    int value = sc.nextInt();

    if(value < 0){
      System.out.println("Wrong number");
    }

  }
}
