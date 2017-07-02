
public class StringReplaceSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Poonam";
		System.out.println("Input strinng is : "+str);
		int length = str.length();
		
		replaceSpaces(str, length);
	}

		public static void replaceSpaces(String str, int length){
			char[] charArr = str.toCharArray();
			int spaceCount = 0;
			
			for(int i = 0; i < length; i++){
				if(charArr[i] == ' '){
					spaceCount++;
				}
			}
			
			int newLength = length+spaceCount*2;
			char[] newCharArr = new char[newLength];
			
			for(int i = length-1; i >= 0; i--){
				if(charArr[i] == ' '){
					newCharArr[newLength - 1] = '0';
					newCharArr[newLength - 2] = '2';
					newCharArr[newLength - 3] = '%';
					newLength = newLength - 3;
				}
				
				else{
					newCharArr[newLength - 1] = charArr[i];
					newLength = newLength - 1;
				}
			}
			
			System.out.println("Output string : "+String.valueOf(newCharArr));
		}
}
