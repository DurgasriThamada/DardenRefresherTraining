/**
 * 
 */
package core.java;

import java.util.Scanner;

public class IncomeTax_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the CTC to know tax amount");
		int CTC = sc.nextInt();
		if(CTC > 0 && CTC < 180000)
			System.out.println("Tax amount: 0");
		else if(CTC > 181001 && CTC < 300000)
			System.out.println("Tax amount: "+(CTC*0.1));
		else if(CTC > 300001 && CTC < 500000)
			System.out.println("Tax amount: "+(CTC*0.2));
		else if(CTC > 500001 && CTC < 1000000)
			System.out.println("Tax amount: "+(CTC*0.3));
		
	}

}
