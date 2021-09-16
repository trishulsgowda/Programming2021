package twoPointer;

import java.util.Arrays;

public class TripletSumToZero {

	public static void main(String[] args) {
		//int a[] = {0, -1, 2, -3, 1}; 
		int a[] = {1, -2, 1, 0, 5};
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++){
			int l= i+1;
			int r = a.length-1;
			
			while(l < r){
				int sum = a[i] + a[l] + a[r];
				if(sum == 0){
					System.out.println("Found Triplet : " + a[i] + "," + a[l] + "," + a[r] );
					break;
				}else if(sum > 0){
					r--;
				}else if(sum < 0){
					l++;
				}
			}
		}
	}
}
