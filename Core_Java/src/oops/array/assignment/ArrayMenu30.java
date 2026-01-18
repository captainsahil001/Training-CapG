package oops.array.assignment;

import java.util.*;

public class ArrayMenu30 {

    static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            int ch = readInt("Enter choice (1-30) or 0 to exit: ");
            if (ch == 0) {
                System.out.println("Bye!");
                break;
            }

            try {
                switch (ch) {
                    case 1 -> q1_PrintAllElements();
                    case 2 -> q2_PrintEvenIndexElements();
                    case 3 -> q3_PrintOddIndexElements();
                    case 4 -> q4_SumOfElements();
                    case 5 -> q5_ProductOfElements();
                    case 6 -> q6_ReverseWithoutNewArray();
                    case 7 -> q7_CopyArray();
                    case 8 -> q8_ReverseUsingNewArray();
                    case 9 -> q9_LargestElement();
                    case 10 -> q10_SecondLargestElement();
                    case 11 -> q11_FrequencyOfOccurrence();
                    case 12 -> q12_DuplicateElements();
                    case 13 -> q13_RemoveDuplicates();
                    case 14 -> q14_UniqueElements();
                    case 15 -> q15_PrimeNumbers();
                    case 16 -> q16_FibonacciElements();
                    case 17 -> q17_InsertAtIndex();
                    case 18 -> q18_RemoveAtIndex();
                    case 19 -> q19_RightRotate();
                    case 20 -> q20_LeftRotate();
                    case 21 -> q21_SortArray();
                    case 22 -> q22_NthLargest();
                    case 23 -> q23_DuplicatePrimeElements();
                    case 24 -> q24_LinearSearch();
                    case 25 -> q25_BinarySearch();
                    case 26 -> q26_BubbleSort();
                    case 27 -> q27_FirstLastCharacter();
                    case 28 -> q28_MergeTwoArrays();
                    case 29 -> q29_ZigZagMerge();
                    case 30 -> q30_PairsSumTarget();
                    default -> System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Input error! Please try again.");
                sc.nextLine();
            }

            System.out.println("\n--- Press Enter to continue ---");
            sc.nextLine();
        }
    }

    // ================= MENU =================
    static void printMenu() {
        System.out.println("""
        ===============================
        ARRAY QUESTIONS (1–30)
        ===============================
        1. Print all elements of an array
        2. Print even index elements
        3. Print odd index elements
        4. Print sum of elements
        5. Print product of elements
        6. Reverse array WITHOUT new array
        7. Copy array
        8. Reverse array USING new array
        9. Largest element
        10. Second largest element
        11. Frequency of an occurrence (each element)
        12. Repeated/Duplicate elements
        13. Remove duplicates (keep first, order)
        14. Unique elements (appear once)
        15. Prime numbers in array
        16. Fibonacci elements in array
        17. Insert element at particular index
        18. Remove element at particular index
        19. Right rotate array by k
        20. Left rotate array by k
        21. Sort array (normal sorting)
        22. Nth largest element
        23. Duplicate prime elements
        24. Linear search
        25. Binary search (sorted)
        26. Bubble sort
        27. First and Last character (String)
        28. Merge two arrays
        29. Merge two arrays in Zig-Zag manner
        30. All pairs sum = target
        0. Exit
        ===============================
        """);
    }

    // ================= HELPERS =================
    static int readInt(String msg) {
        System.out.print(msg);
        while (!sc.hasNextInt()) {
            System.out.print("Enter a valid integer: ");
            sc.next();
        }
        int x = sc.nextInt();
        sc.nextLine(); // consume newline
        return x;
    }

    static int[] readArray() {
        int n = readInt("Enter array size: ");
        int[] a = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) a[i] = readInt("");
        return a;
    }

    static void printArray(int[] a) {
        for (int x : a) System.out.print(x + " ");
        System.out.println();
    }

    static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l]; a[l] = a[r]; a[r] = t;
            l++; r--;
        }
    }

    static boolean isPrime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2) if (x % i == 0) return false;
        return true;
    }

    static boolean isPerfectSquare(long v) {
        long s = (long) Math.sqrt(v);
        return s * s == v;
    }

    static boolean isFibo(int x) {
        if (x < 0) return false;
        long n = x;
        return isPerfectSquare(5 * n * n + 4) || isPerfectSquare(5 * n * n - 4);
    }

    // ================= Q1–Q30 =================
    static void q1_PrintAllElements() {
        int[] a = readArray();
        System.out.println("Elements:");
        printArray(a);
    }

    static void q2_PrintEvenIndexElements() {
        int[] a = readArray();
        System.out.println("Even index elements (0,2,4...):");
        for (int i = 0; i < a.length; i += 2) System.out.print(a[i] + " ");
        System.out.println();
    }

    static void q3_PrintOddIndexElements() {
        int[] a = readArray();
        System.out.println("Odd index elements (1,3,5...):");
        for (int i = 1; i < a.length; i += 2) System.out.print(a[i] + " ");
        System.out.println();
    }

    static void q4_SumOfElements() {
        int[] a = readArray();
        long sum = 0;
        for (int x : a) sum += x;
        System.out.println("Sum = " + sum);
    }

    static void q5_ProductOfElements() {
        int[] a = readArray();
        long product = 1;
        for (int x : a) product *= x;
        System.out.println("Product = " + product);
    }

    static void q6_ReverseWithoutNewArray() {
        int[] a = readArray();
        reverse(a, 0, a.length - 1);
        System.out.println("Reversed (no new array):");
        printArray(a);
    }

    static void q7_CopyArray() {
        int[] a = readArray();
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[i];
        System.out.println("Copied array:");
        printArray(b);
    }

    static void q8_ReverseUsingNewArray() {
        int[] a = readArray();
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[a.length - 1 - i];
        System.out.println("Reversed (using new array):");
        printArray(b);
    }

    static void q9_LargestElement() {
        int[] a = readArray();
        if (a.length == 0) { System.out.println("Empty array"); return; }
        int mx = a[0];
        for (int x : a) mx = Math.max(mx, x);
        System.out.println("Largest = " + mx);
    }

    static void q10_SecondLargestElement() {
        int[] a = readArray();
        if (a.length < 2) { System.out.println("Need at least 2 elements"); return; }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : a) {
            if (x > largest) {
                second = largest;
                largest = x;
            } else if (x > second && x != largest) {
                second = x;
            }
        }

        if (second == Integer.MIN_VALUE) System.out.println("Second largest not found (all elements same?)");
        else System.out.println("Second Largest = " + second);
    }

    static void q11_FrequencyOfOccurrence() {
        int[] a = readArray();
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : a) freq.put(x, freq.getOrDefault(x, 0) + 1);

        System.out.println("Element : Frequency");
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    static void q12_DuplicateElements() {
        int[] a = readArray();
        LinkedHashMap<Integer, Integer> freq = new LinkedHashMap<>();
        for (int x : a) freq.put(x, freq.getOrDefault(x, 0) + 1);

        System.out.println("Duplicate elements:");
        boolean any = false;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > 1) {
                System.out.print(e.getKey() + " ");
                any = true;
            }
        }
        if (!any) System.out.print("None");
        System.out.println();
    }

    static void q13_RemoveDuplicates() {
        int[] a = readArray();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int x : a) set.add(x);

        System.out.println("After removing duplicates:");
        for (int x : set) System.out.print(x + " ");
        System.out.println();
    }

    static void q14_UniqueElements() {
        int[] a = readArray();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : a) freq.put(x, freq.getOrDefault(x, 0) + 1);

        System.out.println("Unique elements (appear once):");
        boolean any = false;
        for (int x : a) {
            if (freq.get(x) == 1) {
                System.out.print(x + " ");
                any = true;
            }
        }
        if (!any) System.out.print("None");
        System.out.println();
    }

    static void q15_PrimeNumbers() {
        int[] a = readArray();
        System.out.println("Prime numbers:");
        boolean any = false;
        for (int x : a) if (isPrime(x)) { System.out.print(x + " "); any = true; }
        if (!any) System.out.print("None");
        System.out.println();
    }

    static void q16_FibonacciElements() {
        int[] a = readArray();
        System.out.println("Fibonacci elements:");
        boolean any = false;
        for (int x : a) if (isFibo(x)) { System.out.print(x + " "); any = true; }
        if (!any) System.out.print("None");
        System.out.println();
    }

    static void q17_InsertAtIndex() {
        int[] a = readArray();
        int idx = readInt("Index to insert (0.." + a.length + "): ");
        int val = readInt("Value: ");
        if (idx < 0 || idx > a.length) { System.out.println("Invalid index"); return; }

        int[] b = new int[a.length + 1];
        for (int i = 0, j = 0; i < b.length; i++) {
            if (i == idx) b[i] = val;
            else b[i] = a[j++];
        }
        System.out.println("After insertion:");
        printArray(b);
    }

    static void q18_RemoveAtIndex() {
        int[] a = readArray();
        int idx = readInt("Index to remove (0.." + (a.length - 1) + "): ");
        if (idx < 0 || idx >= a.length) { System.out.println("Invalid index"); return; }

        int[] b = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i == idx) continue;
            b[j++] = a[i];
        }
        System.out.println("After removal:");
        printArray(b);
    }

    static void q19_RightRotate() {
        int[] a = readArray();
        if (a.length == 0) return;
        int k = readInt("Rotate right by k: ") % a.length;

        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);

        System.out.println("After right rotation:");
        printArray(a);
    }

    static void q20_LeftRotate() {
        int[] a = readArray();
        if (a.length == 0) return;
        int k = readInt("Rotate left by k: ") % a.length;

        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
        reverse(a, 0, a.length - 1);

        System.out.println("After left rotation:");
        printArray(a);
    }

    static void q21_SortArray() {
        int[] a = readArray();
        Arrays.sort(a);
        System.out.println("Sorted array:");
        printArray(a);
    }

    static void q22_NthLargest() {
        int[] a = readArray();
        int n = readInt("Enter n (1 means largest): ");
        if (n < 1 || n > a.length) { System.out.println("Invalid n"); return; }

        Integer[] b = new Integer[a.length];
        for (int i = 0; i < a.length; i++) b[i] = a[i];
        Arrays.sort(b, Collections.reverseOrder());

        System.out.println(n + "th largest = " + b[n - 1]);
    }

    static void q23_DuplicatePrimeElements() {
        int[] a = readArray();
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int x : a) if (isPrime(x)) freq.put(x, freq.getOrDefault(x, 0) + 1);

        System.out.println("Duplicate prime elements:");
        boolean any = false;
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
            if (e.getValue() > 1) { System.out.print(e.getKey() + " "); any = true; }
        }
        if (!any) System.out.print("None");
        System.out.println();
    }

    static void q24_LinearSearch() {
        int[] a = readArray();
        int key = readInt("Enter key to search: ");
        int idx = -1;
        for (int i = 0; i < a.length; i++) if (a[i] == key) { idx = i; break; }
        System.out.println("Index = " + idx);
    }

    static void q25_BinarySearch() {
        int[] a = readArray();
        Arrays.sort(a);
        System.out.print("Sorted array: ");
        printArray(a);

        int key = readInt("Enter key to search: ");
        int l = 0, r = a.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (a[mid] == key) { ans = mid; break; }
            else if (a[mid] < key) l = mid + 1;
            else r = mid - 1;
        }
        System.out.println("Index = " + ans);
    }

    static void q26_BubbleSort() {
        int[] a = readArray();

        for (int i = 0; i < a.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j]; a[j] = a[j + 1]; a[j + 1] = t;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("After bubble sort:");
        printArray(a);
    }

    static void q27_FirstLastCharacter() {
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        if (s.length() == 0) { System.out.println("Empty string"); return; }
        System.out.println("First: " + s.charAt(0));
        System.out.println("Last : " + s.charAt(s.length() - 1));
    }

    static void q28_MergeTwoArrays() {
        System.out.println("Array 1:");
        int[] a = readArray();
        System.out.println("Array 2:");
        int[] b = readArray();

        int[] m = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) m[i] = a[i];
        for (int i = 0; i < b.length; i++) m[a.length + i] = b[i];

        System.out.println("Merged array:");
        printArray(m);
    }

    static void q29_ZigZagMerge() {
        System.out.println("Array 1:");
        int[] a = readArray();
        System.out.println("Array 2:");
        int[] b = readArray();

        System.out.println("Zig-Zag merge:");
        int i = 0, j = 0;
        while (i < a.length || j < b.length) {
            if (i < a.length) System.out.print(a[i++] + " ");
            if (j < b.length) System.out.print(b[j++] + " ");
        }
        System.out.println();
    }

    static void q30_PairsSumTarget() {
        int[] a = readArray();
        int target = readInt("Target sum: ");

        HashMap<Integer, Integer> freq = new HashMap<>();
        boolean found = false;

        System.out.println("Pairs (x y) where x+y=" + target + ":");
        for (int x : a) {
            int need = target - x;
            int count = freq.getOrDefault(need, 0);

            for (int k = 0; k < count; k++) {
                System.out.println(need + " " + x);
                found = true;
            }

            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }

        if (!found) System.out.println("No pairs found");
    }
}

