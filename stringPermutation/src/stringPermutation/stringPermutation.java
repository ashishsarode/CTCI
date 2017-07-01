/*Given two strings, write a method to decide if one is a permutation of the
other.*/

/*Solution: sort the two strings and then compare using equals() method*/

package stringPermutation;
import java.util.*;

public class stringPermutation {
public static void main(String[] args){
	String str1 = "god";
	String str2 = "dog ";
	System.out.println("Input strings are : "+str1+" and "+str2);
	
	if (sortString(str1).equals(sortString(str2))){
		System.out.println("Given two strings are anagrams of each other");
	}
	
	else{
		System.out.println("Given two strings are not anagrams of each other");
	}
}
	
	public static String sortString(String str){
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);
		return new String(charArr);
	}
}

