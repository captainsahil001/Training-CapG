package oops.array;

public class RemoveDup {
	public static int[] removeDuplicates(int[] arr) {

        if (arr.length == 0) return arr;

        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index]) {
                arr[++index] = arr[i];
            }
        }

        int[] result = new int[index + 1];
        for (int i = 0; i <= index; i++) {
            result[i] = arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 3, 4, 4};

        int[] result = removeDuplicates(a);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }

}
