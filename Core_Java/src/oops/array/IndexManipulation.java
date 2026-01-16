package oops.array;

public class IndexManipulation {
	public static int[] addElement(int[] arr, int index, int value) {

        int[] newArr = new int[arr.length + 1];

        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = value;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }
	public static int[] removeElement(int[] arr, int index) {

        int[] newArr = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;
    }
	public static int[] replaceElement(int[] arr, int index, int value) {

        arr[index] = value;
        return arr;
    }
	public static void printArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
	public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        
        arr = addElement(arr, 2, 25);
        System.out.print("After Add: ");
        printArray(arr);

        
        arr = removeElement(arr, 3);
        System.out.print("After Remove: ");
        printArray(arr);

        
        arr = replaceElement(arr, 1, 99);
        System.out.print("After Replace: ");
        printArray(arr);
    }

    
}

