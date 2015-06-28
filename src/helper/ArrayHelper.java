package helper;

public class ArrayHelper {

  public static int[] createArray(int size) {
    int[] array = new int[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 10);
    }

    return array;
  }

  public static void printArray(int[] array){
    for(int i = 0; i < array.length; i++){
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }
}
