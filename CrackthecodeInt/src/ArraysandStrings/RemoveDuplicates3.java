package ArraysandStrings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates3 {
	
	public static void main (String[] args ){
		System.out.println("Enter String:\n");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		System.out.println(removeDuplicates3(s));
		
	}
	
	
	public static String removeDuplicates3(String str){
		Set<Character> set = new HashSet();
		StringBuffer sf = new StringBuffer(); //Why we use string buffer ?
	
		
		for ( int i = 0;i<str.length() ; i++){
			Character c =str.charAt(i);
			if(!set.contains(c)){
				set.add(c);
				sf.append(c);
			}
			
		}
		
		return sf.toString();
		
	}

}

//https://www.youtube.com/watch?v=k20wLXEVZr8