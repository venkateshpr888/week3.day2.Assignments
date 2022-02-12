package week3.day2.assignments;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hpsf.Array;

public class RemoveDuplicatesUsingCollections {
	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		//int count=0;
		String[] split = text.split(" ");
		System.out.println("Orginal Text is "+"\n"+text);
		//char[] charArray = text.toCharArray();
		Set<String>charSet=new LinkedHashSet<String>();
		//Set<Character>dupSet=new LinkedHashSet<Character>();
		for (int i = 0; i < split.length; i++) {
			charSet.add(split[i]);
		}
		System.out.println("After removing duplicates using SET is "+"\n"+charSet);
		
		}
		

		
	}


