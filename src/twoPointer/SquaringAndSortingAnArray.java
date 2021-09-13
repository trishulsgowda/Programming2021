package twoPointer;

import java.util.Arrays;

public class SquaringAndSortingAnArray {

	public static void main(String[] args) {
		//int[] a = new int[]{-6,-3,-1,2,4,5};
		//int[] a = new int[]{-4,-1,0,3,10};
		int[] a = new int[]{-7,-3,2,3,11};
		
		int b[] = new int[a.length];
		int i=0,k=a.length-1,j=a.length-1;
		
		while(i <=j){
			if(Math.abs(a[i]) > Math.abs(a[j])){
				
				b[k] = a[i] * a[i];
				i++;
			}else{
				b[k] = a[j] * a[j];
				j--;
			}
			k--;
		}
		
		Arrays.stream(b).forEach(System.out::print);
	}
}
