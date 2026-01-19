package oops.array.array2D;

public class RowColumnSum {
	
	    public static void rowWiseSum(int[][] arr) {
	        System.out.println("Row-wise Sum:");
	        for (int i = 0; i < arr.length; i++) {
	            int sum = 0;
	            for (int j = 0; j < arr[i].length; j++) {
	                sum += arr[i][j];
	            }
	            System.out.println("Row " + i + " sum = " + sum);
	        }
	    }

	    
	    public static void columnWiseSum(int[][] arr) {
	        System.out.println("Column-wise Sum:");
	        for (int j = 0; j < arr[0].length; j++) {
	            int sum = 0;
	            for (int i = 0; i < arr.length; i++) {
	                sum += arr[i][j];
	            }
	            System.out.println("Column " + j + " sum = " + sum);
	        }
	    }

	    public static void main(String[] args) {

	        int[][] arr = {
	            {1, 2, 3},
	            {4, 5, 6}
	        };

	        rowWiseSum(arr);
	        columnWiseSum(arr);
	    }
	


}
