import java.util.Scanner;

public class Cstyle {
	
		public static void main(String args[]){
			System.out.println("Enter String");
			Scanner in = new Scanner(System.in);
			String s = in.nextLine();
			System.out.println(reverse(s));
		}
		
		public static String reverse(String input){
			char[] data = input.toCharArray();
			int i = 0;
			int j = data.length - 1;
			char temp;
			
			while(i < j){
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
				i++;
				j--;
			}
			
			String s = new String(data);
			return s;
		}
	}

