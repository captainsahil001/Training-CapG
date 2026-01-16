package oops.array;

public class SumOfEle {
	public static int sumOfElements(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {

        int[] a = {2, 4, 6, 8};

        int result = sumOfElements(a);

        System.out.println("Sum of elements = " + result);
    }

}
