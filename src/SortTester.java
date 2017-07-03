import java.util.Date;

/**
 * Created by shannonsullivan on 7/3/17.
 */
public class SortTester {

  public static void main(String[] args)
  {
    runSortTest(10000);
    runSortTest(50000);
    runSortTest(100000);
  }

  public static void runSortTest(int arrLength) {
    java.util.Random random = new java.util.Random();
    int[] arr = new int [arrLength];

    for(int i=0; i < arrLength; i++) {
      arr[i] = random.nextInt(50);
    }

    Sort sort = new Sort();

    Date bubbleStart = new Date();
    sort.bubbleSort(arr.clone());
    Date bubbleEnd = new Date();
    long bubbleTime = bubbleEnd.getTime() - bubbleStart.getTime();

    System.out.printf("For Bubble Sort: %dms elapsed \n", bubbleTime);

    Date insertionStart = new Date();
    sort.insertionSort(arr.clone());
    Date insertionEnd = new Date();
    long insertionTime = insertionEnd.getTime() - insertionStart.getTime();

    System.out.printf("For Insertion Sort: %dms elapsed \n", insertionTime);

    Date mergeStart = new Date();
    sort.mergeSort(arr.clone(), 0, arrLength);
    Date mergeEnd = new Date();
    long mergeTime = mergeEnd.getTime() - mergeStart.getTime();

    System.out.printf("For Merge Sort: %dms elapsed \n", mergeTime);

    Date quickStart = new Date();
    sort.quickSort(arr.clone(), 0, arrLength - 1);
    Date quickEnd = new Date();
    long quickTime = quickEnd.getTime() - quickStart.getTime();

    System.out.printf("For Quick Sort: %dms elapsed \n", quickTime);
  }

  static void printArray(int a[])
  {   // prints the array
    for(int i=0; i<a.length;i++)
      System.out.println(a[i]);
  }
}
