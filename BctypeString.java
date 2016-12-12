package CrackTheCode;

import java.util.Scanner;

public class BctypeString {
	
	public static void main(String[] args){
		Scanner str = new Scanner(System.in);
		String Str = str.nextLine();
		System.out.println(cType(Str));
	}
	public static String cType(String str){
		char[] data = str.toCharArray();
		int i = 0;
		int j = data.length - 1;
		System.out.println(j);
		char temp;
		
		while(i<j){
			temp = data[i];
			data[i]=data[j];
			data[j]=temp;
			i++;
			j--;
			
		}
		String s = new String(data);
		return s;
	}

}


/*
 * Test cases:
 * 1. All upper case latters
 * 2. All lower case letters
 * 3. Strings with space 
 * 4. alpha numeric strings with space
 * 5. Null string
 * 6. Empty string
 * 7. Space + xtring
 * 
 * 
 * */
