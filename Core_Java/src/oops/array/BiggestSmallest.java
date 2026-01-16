package oops.array;

public class BiggestSmallest {
	public static int findSmallest(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    
    public static int findBiggest(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] a = {4, 7, 2, 9, 1, 6};

        int smallest = findSmallest(a);
        int biggest = findBiggest(a);

        System.out.println("Smallest element: " + smallest);
        System.out.println("Biggest element: " + biggest);
    }

}
