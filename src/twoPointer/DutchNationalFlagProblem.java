package twoPointer;

import java.util.Arrays;

public class DutchNationalFlagProblem {
	
	public static void main(String[] args) {
		int[] a = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		int low=0,mid=0,high=a.length-1;
		
		while(mid<=high){
			if(a[mid] == 0){
				swap(low,mid,a);
				low++;
				mid++;
			}else if(a[mid] == 1){
				mid++;
			}else if(a[mid] == 2){
				swap(mid,high,a);
				high--;
			}
		}
		
		Arrays.stream(a).forEach(n -> System.out.print(n));
	}

	private static void swap(int low, int mid, int[] a) {
		int temp = a[low];
		a[low] = a[mid];
		a[mid] = temp;
	}
	
}
