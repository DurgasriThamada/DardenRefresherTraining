package core.java;

import java.util.Scanner;

public class ArmstrongNumber_1 {
	
	public static boolean isArmStrongNumber(int n) {
		int value = 0,k;
		for(int i=n; i>0; i = i/10) {
			k = i%10;
			value += k*k*k;
		}
		if (n== value)
			return true;
		return false;
	}

	public static void main(String ars[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check whether it is an 'ArmStrong number'");
		int n = sc.nextInt();
	
		if(isArmStrongNumber(n))
			System.out.println(n+" is an Armstrong number");
		else
			System.out.println(n+" is not an Armstrong number");
	}
}
