package fastAndSlowPointer;

public class HappyNumber {

	public static void main(String[] args) {
	
		int n =20;
		
		if(n<10 && n!=1){
			System.out.println("Not a happy number");
		}
		
		int num = n;
		while(num > 9){
			num = sumOfSquares(num);
		}
		
		if(num == 1){
			System.out.println("Happy Number");
		}else{
			System.out.println("Not a happy number");
		}
	}

	private static int sumOfSquares(int num) {
		
		int sum =0; 
		
		while(num>0){
			int r = num % 10;
			sum += r*r;
			num = num / 10;
		}
		
		return sum;
	}
	
	
}
