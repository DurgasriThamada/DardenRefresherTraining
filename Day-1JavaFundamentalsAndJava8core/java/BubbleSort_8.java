package core.java;

public class BubbleSort_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		System.out.println("Array before sorting");
		displayArray(arr);
		bubbleSort(arr);
		System.out.println("\nArray after sorting");
		displayArray(arr);
	}

	private static void bubbleSort(int[] arr) {
		// TODO Auto-generated method stub\
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j= i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
	}

	private static void displayArray(int[] arr) {
		// TODO Auto-generated method stub
		for(int i=0; i< arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
