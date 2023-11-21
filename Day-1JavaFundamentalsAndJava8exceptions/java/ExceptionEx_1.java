package exceptions.java;

public class ExceptionEx_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=0;
		try {
			if(b==0)
				throw new ArithmeticException("Division by zero is not possible");
			else
				System.out.println(a/b);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
