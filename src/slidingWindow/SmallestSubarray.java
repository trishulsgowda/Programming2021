package slidingWindow;

public class SmallestSubarray {

	public static void main(String[] args) {
		int[] a = new int[]{1, 2, 4};
		int target =8;
		
		System.out.println(smallestSubarray(a,target));
	}

	private static int smallestSubarray(int[] a, int target) {
		int min = Integer.MAX_VALUE;
		int i=0,j=0;
		int sum=0;
		int c=0;
		while(j < a.length){
			sum += a[j];
			c++;
			
			while(sum > target){
				sum -= a[i];
				i++;
				c--;
				if(sum > target)
				min = Math.min(min, c);
			}
			j++;
		}
		
		return min;
	}
}
