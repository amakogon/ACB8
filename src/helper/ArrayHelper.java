package helper;

public class ArrayHelper {

  public static int[] createArray(int size) {
    int[] array = new int[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * 10);
    }

    return array;
  }

  public static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static int minIndex(int[] array) {
    int minIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] < array[minIndex]) {
        minIndex = i;
      }
    }
    return minIndex;
  }

  public static int min(int[] array) {
//    int min = array[0];
//    for (int i = 0; i < array.length; i++) {
//      if (array[i] < min) {
//        min = array[i];
//      }
//    }
    return array[minIndex(array)];
  }

  public static int maxIndex(int[] array) {
    int maxIndex = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] > array[maxIndex]) {
        maxIndex = i;
      }
    }
    return maxIndex;
  }

}
