package cloudVandana;

public class Pangram {
	public static void main(String[] args) {
		String inputString = "The quick brown fox jumps over the lazy dog";
		boolean result = isPangram(inputString);

		if (result) {
			System.out.println("The input is a pangram.");
		} else {
			System.out.println("The input is not a pangram.");
		}
	}

	static boolean isPangram(String input) {
	        
	        input = input.toLowerCase();

	     
	        boolean[] alphabetArray = new boolean[26];

	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	          
	            if (ch >= 'a' && ch <= 'z') {
	              
	                alphabetArray[ch - 'a'] = true;
	            }
	        }

	 
	        for (boolean letter : alphabetArray) {
	            if (!letter) {
	                return false;
	            }
	        }

	        return true ;
	    }

}
