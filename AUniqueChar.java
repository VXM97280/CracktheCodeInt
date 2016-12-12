package CrackTheCode;

import java.util.Scanner;

public class AUniqueChar {
	
	public static void main(String[] args){
		Scanner s1 = new Scanner(System.in);
		String Str = s1.nextLine();
		System.out.println(uniqueChar(Str));
	}
	public static boolean uniqueChar(String str){
		
		boolean[] charSet = new boolean[256];
		//System.out.println(charSet);
		for(int i=0;i<str.length();i++){
			int val = str.charAt(i);
			if(charSet[val]) return false;
			charSet[val]=true;
		}
		return true;
	}
}

/*
 * TestCases:
 * 1. All upper case letters
 * 2. All lowercase letters
 * 3. All numbers
 * 4. Alpha numeric numbers
 * 5. Special charecters
 * 6. Special symbols
 * 7. Both lower and upper case letters
 */