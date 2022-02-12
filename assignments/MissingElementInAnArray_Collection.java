package week3.day2.assignments;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray_Collection {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
//		Map<Integer,String>list1 = new LinkedHashMap<Integer,String>();
//Set<Entry<Integer,String>> entrySet =list1.entrySet();
//	for (Entry<Integer, String> each : entrySet) {
		
		Set<Integer>list = new TreeSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
				}
		System.out.println("List of Array after sorting= "+list);
	
		for (int i = 0; i < arr.length; i++) 
		{
			if (arr[i+1]==arr[i]+1) {
					
				} else 
				{
					System.out.println("Misssing Number is = "+(arr[i]+1));
				break;
				}
			}
		
	}
	
	}


