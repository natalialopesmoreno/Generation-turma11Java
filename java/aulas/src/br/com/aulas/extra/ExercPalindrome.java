package br.com.aulas.extra;

public class ExercPalindrome {

	public static void main(String[] args) {
		
		System.out.println(checkPalindrome("aabaa"));

	}
	
	
	static boolean checkPalindrome(String inputString) {
		
		StringBuilder sb = new StringBuilder(inputString);
	   
	    StringBuilder pali = sb.reverse();
	    String palindrome = pali.toString();
	    System.out.println(palindrome);
	    System.out.println(inputString);
	    
	    if(palindrome.equals(inputString))
	    {
	        return true;
	    }else
	    { 
	        return false;
	    } 

	}

}
