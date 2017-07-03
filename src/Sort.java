/**
 * Created by shannonsullivan on 7/3/17.
 */
public class Sort {

  public Sort(){}

  /* Bubble Sort function */
  public void bubbleSort( int List[])
  {
    int temp;
    int size = List.length;
    for (int i = 0; i < (size - 1); i++)
    {
      for(int j=0; j< (size -(i+1)); j++)
      {
        if (List[j]> List[j+1])
        {
          temp = List[j];
          List[j]= List[j+1];
          List[j+1] = temp;
        }
      }
    }
  }


  /* Insertion Sort function */
  public void insertionSort(int a[])
  {
    int size = a.length;

    for(int i=1; i<size; i++)
    {
      int  index = a[i];
      int j = i-1;
      while(index < a[j])
      {
        a[j+1]= a[j];
        a[j] = index;
        j--;
        if(j< 0)
          break;
      }
    }
  }


  /* Merge Sort function */
  public void mergeSort(int[] a, int low, int high)
  {
    int N = high - low;
    if (N <= 1)
      return;
    int mid = low + N/2;
    // recursively sort
    mergeSort(a, low, mid);
    mergeSort(a, mid, high);
    // merge two sorted subarrays
    int[] temp = new int[N];
    int i = low, j = mid;
    for (int k = 0; k < N; k++)
    {
      if (i == mid)
        temp[k] = a[j++];
      else if (j == high)
        temp[k] = a[i++];
      else if (a[j]<a[i])
        temp[k] = a[j++];
      else
        temp[k] = a[i++];
    }
    for (int k = 0; k < N; k++)
      a[low + k] = temp[k];
  }

  /* Quick Sort function */
  public void quickSort(int[] arr, int low, int high)
  {
    //check for empty or null array
    if (arr == null || arr.length == 0){
      return;
    }

    if (low >= high){
      return;
    }

    //Get the pivot element from the middle of the list
    int middle = low + (high - low) / 2;
    int pivot = arr[middle];

    // make left < pivot and right > pivot
    int i = low, j = high;
    while (i <= j)
    {
      //Check until all values on left side array are lower than pivot
      while (arr[i] < pivot)
      {
        i++;
      }
      //Check until all values on left side array are greater than pivot
      while (arr[j] > pivot)
      {
        j--;
      }
      //Now compare values from both side of lists to see if they need swapping
      //After swapping move the iterator on both lists
      if (i <= j)
      {
        swap (arr, i, j);
        i++;
        j--;
      }
    }
    //Do same operation as above recursively to sort two sub arrays
    if (low < j){
      quickSort(arr, low, j);
    }
    if (high > i){
      quickSort(arr, i, high);
    }
  }

  public static void swap (int[] array, int x, int y)
  {
    int temp = array[x];
    array[x] = array[y];
    array[y] = temp;
  }
}
