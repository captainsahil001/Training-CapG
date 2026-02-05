package sortwithsearch;

public class InsertionSort {
    public int[] insertionSort(int[] nums) {
        int n = nums.length; 
        for (int i = 1; i < n; i++) {
            int key = nums[i]; 
            int j = i - 1;
            
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            
            nums[j + 1] = key;
        }
        
        return nums;
    }
    
    public static void main(String[] args) {
    	InsertionSort solution = new InsertionSort();
        
        int[] nums = {13, 46, 24, 52, 20, 9};
        
        System.out.println("Before Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        nums = solution.insertionSort(nums);
        
        System.out.println("After Using Insertion Sort: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}


//
//Algorithm,Time (Average),Time (Worst),Space,Stable?,In-Place?
//Bubble Sort,O(n2),O(n2),O(1),Yes,Yes
//Selection Sort,O(n2),O(n2),O(1),No,Yes
//Insertion Sort,O(n2),O(n2),O(1),Yes,Yes
//Merge Sort,O(nlogn),O(nlogn),O(n),Yes,No
//Quick Sort,O(nlogn),O(n2),O(logn),No,Yes