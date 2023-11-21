package core.java;

import java.util.Scanner;

public class TotalAverageMarks_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of student A in 3 subjects");
		int stA[] = new int[3];
		stA[0]= sc.nextInt();
		stA[1]= sc.nextInt();
		stA[2]= sc.nextInt();
		System.out.println("Enter marks of student B in 3 subjects");
		int stB[] = new int[3];
		stB[0]= sc.nextInt();
		stB[1]= sc.nextInt();
		stB[2]= sc.nextInt();
		System.out.println("Enter marks of student C in 3 subjects");
		int stC[] = new int[3];
		stC[0]= sc.nextInt();
		stC[1]= sc.nextInt();
		stC[2]= sc.nextInt();
		int total[]= new int[3];  // total marks of each student
		total[0]= (stA[0]+stA[1]+stA[2]);
		total[1]= (stB[0]+stB[1]+stB[2]);
		total[2]= (stC[0]+stC[1]+stC[2]);
		int subTotal[]= new int[3]; // total marks of students in each subject
		subTotal[0]= stA[0]+stB[0]+stC[0];
		subTotal[1]= stA[1]+stB[1]+stC[1];
		subTotal[2]= stA[2]+stB[2]+stC[2];
		System.out.println("Total marks of students A, B, C: "+total[0]+" "+total[1]+" "+total[2]);
		System.out.println("Average marks of students A, B, C: "+(total[0]/3)+" "+(total[1]/3)+" "+(total[2]/3));
		System.out.println("Total marks of students in each subject: "+subTotal[0]+" "+subTotal[1]+" "+subTotal[2]);
		System.out.println("Average marks of students in each subject: "+subTotal[0]/3+" "+(subTotal[1]/3)+" "+(subTotal[2]/3));
	}

}
