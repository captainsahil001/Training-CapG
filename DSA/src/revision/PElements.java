package revision;

import java.util.Arrays;
import java.util.Scanner;

public class PElements {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] prices = new int[size];
		
		System.out.println("Enter " + size + " Prices of the shoes");
		for(int i=0;i<size;i++) {
			prices[i] = sc.nextInt();
		}
		Arrays.sort(prices);
		System.out.println("Enter the p value ( number of shoes they can carry) ");
		int p= sc.nextInt();
		System.out.println("The" + size + "show prices are");
		System.out.println(Arrays.toString(prices));
		int sumOfPrices = 0;
		for(int i=1;i<=p;i++) {
			if(prices[i-1]<0) {
				sumOfPrices += Math.abs(prices[i-1]);
			}
		}
		System.out.println("The max amount Shreya can earn is " + sumOfPrices);
		sc.close();
		
	}

}
