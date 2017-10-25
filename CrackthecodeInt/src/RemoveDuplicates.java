import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String args[]){
//		System.out.println("Enter String");
//		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
//		System.out.println(removeDuplicates("Hello"));
		//removeDuplicates("Hello");
	}
	
	public static void removeDuplicates(char[] str) {
		 if (str == null) return;
		int len = str.length;
		if (len < 2) return;
	
	 int tail = 1;
	
		 for (int i = 1; i < len; ++i) {
	 int j;
		 for (j = 0; j < tail; ++j) {
		 if (str[i] == str[j]) break;
		 }
		 if (j == tail) {
		 str[tail] = str[i];
		 ++tail;
	 }
		 }
		 str[tail] = 0;
		 }
	
	

}
