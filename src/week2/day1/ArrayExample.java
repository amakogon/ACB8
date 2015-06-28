package week2.day1;

public class ArrayExample {
  public static void main(String[] args) {
    //data_type[] name = new data_type[array_size];

    int[] powerUsages = new int[5];

    //does not work. Sout each element of array
    System.out.println(powerUsages);

    System.out.println(powerUsages[0]);
    System.out.println(powerUsages[1]);
    System.out.println(powerUsages[2]);
    System.out.println(powerUsages[3]);
    System.out.println(powerUsages[4]);

//    System.out.println(powerUsages[10]);
    powerUsages[0] = (int) (Math.random() * 300);
    System.out.println("After cast " + powerUsages[0]);

    System.out.println(Math.random() * 300);

    powerUsages[1] = (int) (Math.random() * 300);
    powerUsages[2] = (int) (Math.random() * 300);
    powerUsages[3] = (int) (Math.random() * 300);
    powerUsages[4] = (int) (Math.random() * 300);

    //Bad code. Do not do that
/*    System.out.println(powerUsages[0]);
    System.out.println(powerUsages[1]);
    System.out.println(powerUsages[2]);
    System.out.println(powerUsages[3]);
    System.out.println(powerUsages[4]);*/

    for(int index = 0; index < 100; index = index + 1) {
      System.out.println(powerUsages[index]);
    }

  }
}
