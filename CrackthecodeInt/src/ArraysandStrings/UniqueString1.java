package ArraysandStrings;

import java.util.Scanner;

public class UniqueString1 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		System.out.println(isUniqueChar(s1));
		
		
		//isUniqueChar("Hello");
		
	}
//	public static boolean isUniqueChar (String str){
//		boolean[] char_set = new boolean[256];
//		for(int i = 0; i < str.length() ; i++){
//			int val = str.charAt(i);
//			if(char_set[val]) return false;
//			char_set[val]=true;
//		}
//		return true;
//	}
	
	public static boolean isUniqueChar (String str){
		
	boolean[] charSet = new boolean[256];
	for (int i = 0;i<str.length(); i++){
		int val = str.charAt(i);
		if(charSet[val]) return false;
		charSet[val]=true;
		
	}
	
		
		return true;
		
	}
	

}
