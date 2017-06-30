/*Implement an algorithm to determine if a string has all unique characters. What if you
cannot use additional data structures? */

import java.util.*;

public class StringUniqueCharsDemo {

	public static void main(String[] args) {

		String str = "Punam!!";
		System.out.println("Input string is : "+str);
		uniqueChars(str);
	}//end of main method

	//method to find if string contains unique chars
	public static void uniqueChars(String str){
		HashSet hs = new HashSet();
		boolean isUnique = true;
		for(char c: str.toCharArray()){
			if(!hs.add(c)){
				isUnique = false;
			}
		}

		if(isUnique == false){
			System.out.println("String does not have unique characters");
		}

		else{
			System.out.println("String has unique characters");
		}
	}//end of uniqueChars method
}//end of StringUniqueCharsDemo method
