package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicatesInArray_Collection {
	
	// get the length of the array
			// declare an int variable named count
			
			// iterate from 0 to the array length-1 (outer loop starts here)
			
				// assign 0 to count 
				
				// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
				
						// compare both the loop variables & check they're equal
					
								// increase the count if both the arrays are equal
						
				// Out of the inner loop, check and print the first array variable if count is more than 0
				
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer>list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			
		}
		Set<Integer>orset = new LinkedHashSet<Integer>();
		Set<Integer>dupset = new LinkedHashSet<Integer>();
		for (Integer val : list) {
			if(!orset.add(val)) {
				dupset.add(val);
			}

		}
		System.out.println("List of Duplicate valve in the Array = "+dupset);
}

}
