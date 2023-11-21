package core.java;

public class ArmstrongNumberRange_2 {

	public static void main(String args[]) {
		
		int n=100, m=999;
		System.out.println("Armstrong numbers between 100-999:");
		for(int i=n;i<=m;i++) {
			if(ArmstrongNumber_1.isArmStrongNumber(i)) {
				System.out.print(i+" ");
			}
		}
	}
	
}
