package core.java;

public class SimpleAndCompoundInterest_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double p=1000, t=3, r=5;
		System.out.println("Principal: Rs.1000,  Time: 3 years,  Rate of Interest:5%");
		System.out.println("Simple Interest:"+((p*t*r)/100));
		System.out.println("Compound Interest:"+((p*Math.pow((1+(r/100)), t))-p));
	}

}
