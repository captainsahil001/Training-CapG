package heap;

import java.util.ArrayList;
import java.util.List;


//the problem is fixed with sliding window size of 3 elements .
public class Problem {
	public static List<Integer> maxOfEachWindow(int[] num){
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<num.length-2;i++) {
			
			int max =  ((num[i]>num[i+1] && num[i]>num[i+2])?num[i]:(num[i+1]>num[i+2])?num[i+1]:num[i+2]);
			list.add(max);
		}
		return list;
	}
	public static void main(String[] args) {
		int[] a = {1,1,3,4,2,4,6,8};
		System.out.println(maxOfEachWindow(a));
	}

}
