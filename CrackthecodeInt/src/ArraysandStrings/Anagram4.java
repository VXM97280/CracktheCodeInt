package ArraysandStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagram4 {
	public static void main(String[] args){
        System.out.println("Enter your String:");
		Scanner in  = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		System.out.println(anagram(str1, str2));
	}
	public static boolean anagram(String str1, String str2){
		
		char[] charString1 = str1.toCharArray();
		//char[] charString2 = str2.toCharArray();
		StringBuilder sb = new StringBuilder(str2);
		for ( char c : charString1 ){
			int index = sb.indexOf(String.valueOf(c));
			if (index!=-1){
				sb.deleteCharAt(index);
			} else{
				return false;
			}
		}
			return sb.length()==0;
		
		
	}

}


//https://www.youtube.com/watch?v=656KBws7bD0