package slidingWindow;

public class PermutationOfAString {

	public static void main(String[] args) {
		String s = "ABC";
		permute(s,0,s.length()-1);
	}

	private static void permute(String s,int l,int r) {
		
		if(l == r ){
			System.out.println(s);
		}
		
		for(int i=l;i < s.length(); i++){
			s = swap(s, i, l);
			permute(s, l+1, r);
			s = swap(s, i, l);
		}
		
	}

	private static String swap(String s, int i, int j) {
		char[] carr = s.toCharArray();
		char temp = carr[i];
		carr[i] = carr[j];
		carr[j] = temp;
		
		return new String(carr);
	}
}
