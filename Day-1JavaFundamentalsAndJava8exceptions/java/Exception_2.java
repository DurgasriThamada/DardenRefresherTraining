package exceptions.java;

public class Exception_2 {

	public static void main(String[] args) {

		int a=10,b=0;
		try {
			if(b==0)
				throw new UnsupportedOperationException("Division by zero is not possible");
			else
				System.out.println(a/b);
		}
		catch(UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
