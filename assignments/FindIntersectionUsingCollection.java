package week3.day2.assignments;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionUsingCollection {

	public static void main(String[] args) {
		int[] arr1={3,2,11,4,6,7};
		int[] arr2={1,2,8,4,9,7};
		Set<Integer>list1 = new LinkedHashSet<Integer>();
		Set<Integer>list2 = new LinkedHashSet<Integer>();
	for (int i = 0; i < arr1.length; i++) {
		list1.add(arr1[i]);
			}
	System.out.println("List of Array one = "+list1);
			for (int j = 0; j < arr2.length; j++) 
			{
				list2.add(arr2[j]);
			}
			System.out.println("List of Array two = "+list2);
			System.out.println("List of Array with Intersection ");
				for (int k = 0; k < list2.size(); k++) {		
		if (list1.retainAll(list2)) 
				{
					System.out.print(list1);
					System.out.print(" ");
					} else 
					{
					//System.out.println(" ");
					}
				}
	}
}