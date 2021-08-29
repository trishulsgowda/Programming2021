package slidingWindow;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FruitsIntoBasket {

	public static void main(String[] args) {
		int[] a = new int[]{3,3,3,1,2,1,1,2,3,3,4};
		int res = Integer.MIN_VALUE;
		int i=0,j=0;
		Map<Integer, Integer> map = new ConcurrentHashMap<>();
		
		while(j < a.length){
			map.put(a[j], map.containsKey(a[j]) ? map.get(a[j]) + 1 : 1);
			if(map.size() > 2){
				while(map.size() > 2){
					map.put(a[i], map.get(a[i]) -1);
					if(map.get(a[i]) == 0){
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
