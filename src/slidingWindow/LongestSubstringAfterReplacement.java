package slidingWindow;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LongestSubstringAfterReplacement {
	public static void main(String[] args) {

		//String s = "ZBABC"; int k=2;
		//String s = "ZBABC"; int k=1;
		//String s = "ABAB"; int k=2;
		String s = "AABABBA"; int k=1;
		
		char[] a = s.toCharArray();
		int res = Integer.MIN_VALUE;
		int i=0,j=0;
		Map<Character, Integer> map = new ConcurrentHashMap<>();
		
		while(j < a.length){
			
			map.put(a[j], map.containsKey(a[j]) ? map.get(a[j]) + 1 : 1);
			int current_count = map.get(a[j]);
			
			while(j-i+1 - current_count > k){
				if(map.get(a[i]) == 1){
					map.remove(a[i]);
				}else if (map.get(a[i]) > 1){
					map.put(a[i], map.get(a[j]) - 1);
				}
				i++;
			}
			
			res = Math.max(res, j+1-i);
			j++;
		}
		
		System.out.println("Max:" + res);
	}
}
