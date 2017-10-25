package ArraysandStrings;

import java.util.Scanner;

public class ReplaceSpace5 {
	public static void main(String Args[]){
		
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
		System.out.println("replace string Method-1 ="+ ReplaceSpace5.replaceSpace("HELO how are you ?"));
		
	}
	public static String replaceSpace(String str){
		String[] words = str.split("");
		StringBuilder sb = new StringBuilder(words[0]);
		
		for (int i = 1; i< words.length; i++){
			sb.append("%20");
			sb.append(words[i]);
		}
		
		
		return sb.toString();
		
	}

}



///https://www.youtube.com/watch?v=0rB2JfqJkSc