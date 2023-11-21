package junit.java;

import java.util.Arrays;
import java.util.List;

public class MinMaxFinderQ2 {
	private int max;
	private int min;
	public MinMaxFinderQ2(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}
	
	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "MinMax [max=" + max + ", min=" + min + "]";
	}
	public static MinMaxFinderQ2 findMinMax(int[] arr) {
		int min=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return new MinMaxFinderQ2(min,max);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers={56,34,7,3,54,3,34,34,53};
		MinMaxFinderQ2 m=findMinMax(numbers);
		System.out.println(m);
	}

}