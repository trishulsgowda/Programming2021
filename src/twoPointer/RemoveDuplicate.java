package twoPointer;

public class RemoveDuplicate {

	public static void main(String[] args) {
		char[] a = new char[]{'0','0','1','1','1','2','2','3','3','4'};
		
		int i=0, j=1;
		
		while(i < a.length && j < a.length){
			if(a[i] == a[j]){
				a[j] = '_';
				j++;
			}else if(a[i] != a[j]){
				i = j;
				j = i+1;
			}
		}
		
		for(char c: a){
			System.out.print(c);
		}
	}
}
