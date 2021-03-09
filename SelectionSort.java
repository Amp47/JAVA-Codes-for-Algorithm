/*
procedure selection sort 
   list  : array of items
   n     : size of list

   for i = 1 to n - 1
   // set current element as minimum
      min = i    
  
      // check the element to be minimum 

      for j = i+1 to n 
         if list[j] < list[min] then
            min = j;
         end if
      end for

      // swap the minimum element with the current element
      if indexMin != i  then
         swap list[min] and list[i]
      end if
   end for
	
end procedure


In short Time cplexity in,
Best Case:O(n ^ 2)
Worse case:O(n ^ 2)

full explanation video:
https://www.youtube.com/watch?v=9oWd4VJOwr0

*/

// Selection sort in Java

import java.util.Arrays;

public class SelectionSort {
  void selectionSort(int array[]) { 

    //here array elements "n" will be written as "array.length" in java

    int size = array.length;

    //"step" variable will be used to rin through array element chain.

    for (int step = 0; step < size - 1; step++) {


    // outer loop will be for total 5 passes or iterations or operations.

      /*
       the first loop var "size" will run from 0 to 5 if all elements are 6. 
       size - 1 , because total "pass" or "iteration" or "operation"stages for 6 elements 
       are 5. From 0th pass to 5th. When 0th index to 5th is sorted, 6th
       element will always be in its correct position and thus last one 
       doesn't need extra "pass" or "iteration".  
       Same as Bubble Sort.

      */

      int min_index = step;
    // first min value will be our value from index zero , first element and index will be saved inside step loop variable.


    // for second loop, "i" is used instead of "j" and used to find minimum value during running and comparing 
    // through array element chain. 
      for (int i = step + 1; i < size ; i++) {
        
        // second loop will be used to find minimum value.


        //Here i , or second loop variable will compare and run through array elements only 2nd element to last.
        
        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_index]) {
          min_index = i;
        }
      }

      //This small block is for "swap" action
      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_index];
      array[min_index] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int[] data = { 7, 4, 10, 8, 3, 1 };
    SelectionSort object1 = new SelectionSort();
    object1.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    /*
In Java, toString method guarantees that an object can be represented textually.
This is especially useful for logging, debugging, 
or any other circumstance where you need to be able to render any 
and every object you encounter as a string. When you print an object, 
 the java compiler calls the object's toString () method internally.

    */
    System.out.println(Arrays.toString(data));
  }
}