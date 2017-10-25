import java.util.Scanner;

public class TwoDimMatrix {
	
	public static void main (String[] args){
		
		Scanner in = new Scanner(System.in);
		int m = 2;
		int n = 2;
		int[][] a = new int [m][n];
		for (int i = 0; i < m; i++){
			for (int j =0; j < n; j++){
				a[i][j] = in.nextInt(); 
			}
		}
		
		//Print Matrix
		System.out.print("\n");
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n; j++){
				System.out.println(a[i][j] + " " );
			}
			 System.out.println();
		}
		
	}

}
