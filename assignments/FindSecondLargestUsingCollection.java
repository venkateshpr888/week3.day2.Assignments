package week3.day2.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargestUsingCollection {
			

			/*
			 Pseudo Code:
			 1) Arrange the array in ascending order
			 2) Pick the 2nd element from the last and print it
			 */

			public static void main(String[] args) {
				int[] data = {3,2,11,4,6,7};
				
				List<Integer>list = new ArrayList<Integer>();
				for (int i = 0; i < data.length; i++) {
					list.add(data[i]);
				}
				System.out.println("orginal Array = "+list);
				Collections.sort(list);
				System.out.println("After sorting = "+list);
				
				System.out.println("Second Largest Number is "+list.get(4));
				
					
				}
					
				}
				
				
			

