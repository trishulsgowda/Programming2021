package slidingWindow;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LongestSubarrayWithOnes {

	public static void main(String[] args) {
		//int[] a = new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0}; int k=2;
		int[] a = new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1};  int k=3;
		int res = Integer.MIN_VALUE;
		int i=0,j=0;
		
		
		Map<Integer, Integer> map = new ConcurrentHashMap<>();
		
		while(j < a.length){
			int currentZeroCount = 0; 
			int windowSize = j - i +1;
			map.put(a[j], map.containsKey(a[j]) ? map.get(a[j]) + 1 : 1);
			
			if(a[j] == 0){
				currentZeroCount = map.get(a[j]);
			}
			
			while(currentZeroCount > k){
				if(map.get(a[i]) == 1){
					map.remove(a[i]);
				}else if (map.get(a[i]) > 1){
					map.put(a[i], map.get(a[i]) - 1);
				}
				if(a[i] == 0) currentZeroCount -= 1;
				i++;
			}
			res = Math.max(res, j+1-i);
			j++;
		}
		
		System.out.println("Max:" + res);
	}
}
