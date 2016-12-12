package CrackTheCode;

import java.util.Scanner;

public class HSubstring {
	public static void main(String[] args){
		Scanner str11 = new Scanner(System.in);
		Scanner str22 = new Scanner(System.in);
		String str1 = str11.nextLine();
		String str2 = str22.nextLine();
		System.out.println(isRotation(str1,str2));
	}
	
	public static boolean isRotation(String s1, String s2) {
		
		    int len = s1.length();
		
		    /* check that s1 and s2 are equal length and not empty */
		
		    if (len == s2.length() && len > 0) { 
		
		/* concatenate s1 and s1 within new buffer */
		
		String s1s1 = s1 + s1;
		
		return isRotation(s1s1, s2);
		
		}
		
		return false;
		
	}
}
