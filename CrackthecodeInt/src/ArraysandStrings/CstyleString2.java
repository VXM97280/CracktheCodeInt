package ArraysandStrings;

import java.util.Scanner;

public class CstyleString2 {
	public static void main(String Args[]){
		System.out.println("Enter string");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(reverse(s));	
	}
//	public static String reverse(String input){
//		char[] data = input.toCharArray();
//		int i = 0;
//		int j = data.length -1;
//		char temp;
//		
//		while(i < j){
//			temp = data[i];
//			data[i] = data[j];
//			data[j] = temp;
//			i++;
//			j--;
//		}
//		String s = new String(data);
//		return s;
//		
//	}
public static String reverse(String input){
	char[] A = input.toCharArray();
	int i = 0;
	int j = A.length - 1;
	char temp;
	while(i<j){
		temp = A[i];
		A[i] = A[j];
		A[j] = temp;
		i++;
		j--;
			
	}
	String s = new String(A);
	return s;
}
}
