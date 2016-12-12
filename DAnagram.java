package CrackTheCode;

import java.util.Scanner;

public class DAnagram {
	public static void main(String[] args){
		Scanner str11 = new Scanner(System.in);
		Scanner str22 = new Scanner(System.in);
		String str1 = str11.nextLine();
		String str2 = str22.nextLine();
		System.out.println(anagram(str1,str2));
	}

	public static boolean anagram(String str1, String str2){
		char[] cStr1 = str1.toCharArray();
		System.out.println("+cStr1");
		StringBuilder sb = new StringBuilder(str2);
		for (char c: cStr1){
			int index = sb.indexOf(String.valueOf(c));
			System.out.println(index);
			if(index!=-1){
				sb.deleteCharAt(index);
			}else{
				return false;
			}
		}
		
		return sb.length()==0;
		
	}
}


/*
 *TestCsaes:
 *1. enetr two string swith differnt chars
 *2. Enter strings with same char
 *3. Enter number
 *4. Enter a tring and an Empty string
 *5. Enter alpha numeric characters 
 *
 * */
 