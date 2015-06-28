package week2.day2;

public class MethodExample {
  public static void main(String[] args) {
    int result = sum(2, 3);
    System.out.println(result);

    System.out.println(sum(5,19));
    System.out.println(sum(15,12));
    System.out.println(sum(5,12));
  }

  public static int sum(int a, int b) {
    int result = a + b;
    return result;
  }



}
