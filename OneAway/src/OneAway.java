/*There are three types of edits that can be performed on strings: insert a character,
remove a character, or replace a character. Given two strings, write a function to check if they are
one edit (or zero edits) away.
EXAMPLE
pale, ple -) true
pales, pale -) true
pale, bale -) true
pale, bae -) false*/

public class OneAway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "pale";
		String str2 = "pal";
		
		boolean result = oneEditAway(str1, str2);
		
		if(result == false){
			System.out.println("The two strings are not one edit away");
		}
		
		else{
			System.out.println("The two strings are one edit away");
		}
			
	}//end of main method
	
		public static boolean oneEditAway(String s1, String s2){
			if(s1.length() == s2.length()){
				return oneEditReplace(s1, s2);
			}
			
			else if(s1.length()+1 == s2.length()){
				return OneEditInsert(s1, s2);
			}
			
			else if(s1.length()-1 == s2.length()){
				return OneEditInsert(s2, s1);
			}
			return false;
		}//end of oneEditAway()
		
		public static boolean oneEditReplace(String s1, String s2 ){
			boolean foundDifference = false;
			for(int i = 0; i< s1.length(); i++){
				if(s1.charAt(i)!=s2.charAt(i)){
					if(foundDifference){
						return false;
					}
					foundDifference = true;
				}
			}
			return true;
		}//end of oneEditReplace()
		
		public static boolean OneEditInsert(String s1, String s2 ){
			int index1 = 0;
			int index2 = 0;
			
			while(index2 < s2.length() && index1 < s1.length()){
				if(s1.charAt(index1)!= s2.charAt(index2)){
					if(index1 != index2){
						return false;
					}
					index2++;
				}
				else{
					index1++;
					index2++;
				}
			}//end of while loop
			return true;
		}//end of oneEditInsert()

}//end of method
