package week3.day1;

import helper.ArrayHelper;

public class FindMinInArray {
  public static void main(String[] args) {
    //create array with random size
    int[] array = ArrayHelper.createArray(5);
    //print array
    ArrayHelper.printArray(array);

    //find min and max index in array
    int minIndex = ArrayHelper.minIndex(array);
    int maxIndex = ArrayHelper.maxIndex(array);


//    for (int i = 0; i < array.length; i++) {
//      if (array[i] < array[minIndex]) {
//        minIndex = i;
//      } else if (array[i] > array[maxIndex]) {
//        maxIndex = i;
//      }
//    }

    //print max and min elements
//    System.out.println("Min = " + array[minIndex]);
    System.out.println("Min = " + ArrayHelper.min(array));
    System.out.println("Max = " + array[maxIndex]);

    //swap elements
    int temp = array[minIndex];
    array[minIndex] = array[maxIndex];
    array[maxIndex] = temp;

    //print max and min elements
    System.out.println("~~~~SWAP~~~~~");
    System.out.println("Min = " + array[minIndex]);
    System.out.println("Max = " + array[maxIndex]);
    ArrayHelper.printArray(array);

  }
}
