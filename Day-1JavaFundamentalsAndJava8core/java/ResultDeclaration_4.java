package core.java;

import java.util.Scanner;

public class ResultDeclaration_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks of 3 subjects");
		double sub1 = sc.nextInt();
		double sub2 = sc.nextInt();
		double sub3 = sc.nextInt();
		int count=0;
		if(sub1 >60) count++;
		if(sub2 >60) count++;
		if(sub3 >60) count++;
		if(count == 3) 
			System.out.println("Passed");
		else if(count == 2)
			System.out.println("Promoted");
		else
			System.out.println("Failed");
	}
}
