package twoPointer;

import java.util.Arrays;

public class TripletSumLessThanTarget {

	public static void main(String[] args) {
		int arr[] = {5, 1, 3, 4, 7};
		int target = 12;
		
		Arrays.sort(arr);
		
		int i=0;
		int k = arr.length-1;
		int count =0;
		
		for(i =0; i<arr.length -2 ; i++){
			int j = i+1;
			while(j < k){
				int sum = arr[i] + arr[j] + arr[k];
				if(sum >= target){
					k--; // try to reduce the sum
				}else{
					count += k -j; // all items between j and k is smaller
					j++;
				}
			}
		}
		
		System.out.println(count);
	}
}
