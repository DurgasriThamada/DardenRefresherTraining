package core.java;

import java.util.Scanner;

public class SearchInArray_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to search in array");
		int n = sc.nextInt();
		int i;
		for (i=0;i<arr.length;i++)
			if(arr[i]==n) {
				System.out.println(n+" is found");
				break;
			}
		if(i==arr.length)
			System.out.println(n+" is not found");
	}

}
