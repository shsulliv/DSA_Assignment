For Bubble Sort: 237ms elapsed 
For Insertion Sort: 28ms elapsed 
For Merge Sort: 4ms elapsed 
For Quick Sort: 3ms elapsed 
For Bubble Sort: 5361ms elapsed 
For Insertion Sort: 479ms elapsed 
For Merge Sort: 7ms elapsed 
For Quick Sort: 3ms elapsed 
For Bubble Sort: 16654ms elapsed 
For Insertion Sort: 1888ms elapsed 
For Merge Sort: 14ms elapsed 
For Quick Sort: 5ms elapsed 

# Data Structures and Algorithms Coursework
By Shannon Sullivan

## Part I: Analysis of Sorting Algorithms
To compare the efficiency of different sorting algorithms, I have generated a large array of random numbers. The array was then "copied" using the Java `Array.clone()` method, and passed to the following four sorting algorithms:

* Bubble sort
* Insertion sort
* Merge sort
* Quick sort

To capture the time necessary to complete the sorting methods I utilized the Java `Date()` object. I applied the `getTime()` method at the start and end of each sorting method call and calculated the time elapsed.

#### Figure 1
![alt text](figure_1.png)
Figure 1 below illustrates a comparison of the amount of time elapsed for each of the three algorithms.

#### Figure 2
![alt text](figure_2.png)
Figure 2 illustrates the same comparison of sorting times as a bar graph.

### Reflection
Running the four sorting algorithms with varying quantities of data demonstrated that for certain algorithms, the amount of time required to
complete the sort increased as the amount of data inputs increased. For other algorithms, the time required to complete the sort remained
relatively linear regardless of the number of data inputs.

In particular, the time required to complete the Bubble Sort algorithm increased exponentially as the amount of data inputs increased, which is
in line with its complexity  of `O(n^2)`. The Insertion Sort algorithm performed better,
with very little time required to complete the sort while inputs remained low, but the time increased drastically as the inputs increased. For this
reason, Insertion Sort also shares a complexity of `O(n^2)`.

In contrast, the Merge Sort and Quick Sort algorithms remained relatively linear as the data inputs increased, to the point where their plot points are indistinguishable
from each other on both charts. Both of these algorithms boast a complexity of `O(n log n)`.


