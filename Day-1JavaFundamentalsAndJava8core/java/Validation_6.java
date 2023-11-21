package core.java;

import java.util.Scanner;

public class Validation_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String userName, password;
		int count = 0;
		while(count<3) {
			System.out.println("Enter username");
			userName = sc.next();
			System.out.println("Enter password");
			password = sc.next();
			if(userName.equals("Durga") && password.equals("123456")) {
				System.out.println("Welcome "+userName+"!");
				break;
			}
			count ++;
		}
		if(count>=3) {
			System.out.println("Contact admin");
		}
			
	}

}
