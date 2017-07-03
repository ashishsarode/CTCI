/*Given a string, write a function to check if it is a permutation of
a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A
permutation is a rearrangement of letters. The palindrome does not need to be limited to just
dictionary words.
EXAMPLE
Input: Tact Coa
Output: True (permutations:"taco cat'; "atco cta'; etc.)*/

import java.util.*;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Tact Coa";
		String str = input.toLowerCase();
		char[] arr = str.toCharArray();
		
		System.out.println("input String is: "+input);
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character ch = null;
		Integer val = 0;
		int odd = 0, even = 0;
		
		for(int i=0; i<str.length(); i++){
			ch = str.charAt(i);
			if(!map.containsKey(ch)){
				map.put(ch, 1);
			}
			else{
				val = map.get(ch);
				map.put(ch, val+1);
			}
				
		}
		//System.out.println(map);
		
		Set<Character> keyset = map.keySet();
		//System.out.println(keyset);
		
		for(Character CH : keyset){
			val = (Integer)map.get(ch);
			//System.out.println(CH);
			//System.out.println(val);
			
			if(val == input.length()){
				System.out.println("Given string is pwrmutatuion of palindrome");
			}
				else if(val%2==1){
					odd++;
				}
				
				else if(val%2==0){
					even++;
				}
			
		}
		
		if(odd == 0 || odd == 1){
			System.out.println("Given string is permutatuion of palindrome");
		}
		
		else{
			System.out.println("Given string is not permutatuion of palindrome");
		}
	}

}
