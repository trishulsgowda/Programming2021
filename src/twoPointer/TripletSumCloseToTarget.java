package twoPointer;

import java.util.Arrays;

public class TripletSumCloseToTarget {

	public static void main(String[] args) {
		
		int target = 10;
		int[] a = new int[]{1, 2, 3, 4, -5};
		
		Arrays.sort(a);
		int closeness = Integer.MAX_VALUE;
		int closestSum = 0;
		int l,r;
		for(int i=0; i<a.length-2; i++){
			l = i+ 1;
			r = a.length -1;
			
			while(l < r){
				int sum = a[i] + a[l] + a[r];
				int currentCloseness = Math.abs(sum - target);
				if(currentCloseness < closeness){
					closestSum = sum;
					closeness = currentCloseness;
				}
				
				if(sum < target) l++;
				else if(sum > target) r--;
			}
		}
		
		System.out.println("Closest Sum = " + closestSum);
	}
}
