package junit.java;

public class MinMaxFinderQ1 {

	public static int[] findMinMax(int[] arr) {
		int[] res=new int[2];
		res[0]=arr[0];
		res[1]=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>res[1]) {
				res[1]=arr[i];
			}
			if(arr[i]<res[0]) {
				res[0]=arr[i];
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {56,34,7,3,54,3,34,34,53};
		int[] res=findMinMax(arr);
		for(int i:res) {
			System.out.println(i);
		}
	}

}