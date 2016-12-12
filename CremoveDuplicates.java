package CrackTheCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CremoveDuplicates {
	
	public static void main(String[] args){
		
		Scanner str1 = new Scanner(System.in);
		String str2 = str1.nextLine();
		System.out.println(removeDuplicates(str2));
		
		
	}
	public static String removeDuplicates(String str){
		//char[] charset = new char[256];
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		System.out.println(sf);
		
		for(int i = 0; i < str.length();i++){
			Character c = str.charAt(i);
			if (!set.contains(c)){
				set.add(c);
				sf.append(c);
			}
		}
		
		return sf.toString();
		
	}
	

}

/*
 *TestCases:
 *1. String with all Upper case
 *2. String with all lower case
 *3. Strig with space 
 *4. String with Null
 *5. String with special charaters
 *6. String with alpha numeric 
 *7. String with numbers
 
 * 
 * */
 