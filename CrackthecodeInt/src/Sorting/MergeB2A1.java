package Sorting;



public class MergeB2A1 {
	
	public static void merge (int[] A,int[] B,int n, int m ){
		int k = m + n - 1; // index of last location of array B
		System.out.println("Hello K is "+k);
		int i = n - 1 ; //index of last element in array B
		System.out.println("Hello i is "+i);
		int j = m - 1; // index of last element in array A
		System.out.println("Hello j is " +j);
		System.out.println("Hello A[K] is" +A[k]);
		System.out.println("Hello A[K--] is" +A[k--]);
		System.out.println("Hello B[j] is" +B[j]);
		System.out.println("Hello B[j--] is" +B[j--]);
		
		
		//comparing the two different arrays for having one sorted array 
		
		while( i >= 0 && j >= 0){
			
			System.out.println("Hello A[i] is" +A[i]);
			System.out.println("Hello B[j] is" +B[j]);
			
			if (A[i] > B[j]){ //0>9 
				//System.out.println("Hello 1A[K--]" +A[k--]);
				A[k--] = A[i--];
				System.out.println("Hello 1A[K--]" +A[k--]);
				
			}else {
				//System.out.println("Hello 2 A[K--]" +A[k--]);
				A[k--] = B[j--];  //A[9] = 0 = B[4] = 9
				System.out.println("Hello 2 A[K--]" +A[k--]);
			}
		}while(j>=0){
			A[k--]=B[j--];
			System.out.println("Adiya"+A[k]);
		}
		
	}
	 public static void main( String[] args )
	    {
		 
		// Scanner in = new Scanner(System.in);
		 
		 
		    int[] A = {1,3,5,7,0,0,0,0,0,0,0,0,0};
	        int[] B = {2,4,6,8,9};
	        merge( A, B, 5, 5 );
	        for( int i = 0; i < 9; i++ )
	        {
	            System.out.print( A[i] );
	        }
	        System.out.println();
	    }


	        

}

