package intervals;

public class MergeIntervals {

	public static void main(String[] args) {
		Interval i1 = new Interval(1,3);
		Interval i2 = new Interval(2,4);
		Interval i3 = new Interval(5,7);
		Interval i4 = new Interval(6,8);

		Interval[] a = {i1,i2,i3,i4};
		
		// Given input is sorted, other we have to add sorting logic
		
		// Implementation
		int i=0;
		for(int j=1; j<a.length; j++){
			if(a[i].end > a[j].start){
				a[i].end = Math.max(a[i].end, a[j].end);
				a[i].start = Math.min(a[i].start, a[j].start);
			}else{
				i++; // Current interval cannot be merged and it is retained in result so go for next
				a[i] = a[j];
			}
		}
		
		for(int k=0; k<=i ; k++){
			System.out.println(a[k]);
		}
		
		
	}
}

class Interval{
	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}

	int start;
	int end;
	
	Interval(int start, int end){
		this.start = start;
		this.end = end;
	}
}
