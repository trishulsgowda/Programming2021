package slidingWindow;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class NonRepeatingSubstring {

	public static void main(String[] args) {
		String s = "bbbbb";
		char[] a = s.toCharArray();
		int res = Integer.MIN_VALUE;
		int i=0,j=0;
		Map<Character, Integer> map = new ConcurrentHashMap<>();
		
		while(j < a.length){
			
			if(!map.containsKey(a[j]))
				map.put(a[j], 1);
			else{
				while(map.containsKey(a[j]) && i!=j){
					if(a[i] != a[j]){
						map.remove(a[i]);
					}
					i++;
				}
			}
			
			res = Math.max(res, j+1-i);
			j++;
		}
		
		System.out.println("Max:" + res);
	}
}
