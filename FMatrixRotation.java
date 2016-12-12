package CrackTheCode;

public class FMatrixRotation {
	

	    public static void main(String args[]){
	        int[][] matrix = new int[6][6];
	        initializeMatrix(matrix,6);
	        System.out.println("Input: ");
	        printMatrix(matrix,6);
	        rotate(matrix,6);
	        printMatrix(matrix,6);
	    }

	    public static void rotate(int[][] matrix, int n) {
	        for (int layer = 0; layer < n / 2; ++layer) {
	         
	            int last = n - 1 - layer;
	            for(int i = layer; i < last; ++i) {
	                int offset = i - layer;
	                int buffer = matrix[layer][i]; // save top
	               
	                // left -> top
	                matrix[layer][i] = matrix[last-offset][layer];          

	                // bottom -> left
	                matrix[last-offset][layer] = matrix[last][last - offset]; 

	                // right -> bottom
	                matrix[last][last - offset] = matrix[i][last]; 

	                // top -> right
	                matrix[i][last] = buffer; // right <- saved top

	              
	                
	            }
	           

	        }
	    }

	    public static void printMatrix(int[][] matrix,int n){
	        System.out.print("\n");
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                System.out.print(" "+matrix[i][j]);
	            }
	            System.out.print("\n");
	        }
	    }

	    public static void initializeMatrix(int[][] matrix,int n){
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                matrix[i][j]=(int) (Math.random() * 1000);
	            }
	        }
	    }

	}


