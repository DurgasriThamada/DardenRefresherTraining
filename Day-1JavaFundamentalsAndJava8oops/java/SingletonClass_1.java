package oops.java;

public final class SingletonClass_1 {
	
	private static SingletonClass_1 instance;

    private SingletonClass_1() {
        // Initialization code, if needed
    }

    // Public method to get the singleton instance
    public static SingletonClass_1 getInstance() {
        
        if (instance == null) {
            instance = new SingletonClass_1();
        }
        return instance;
    }
	
}


/*** ex class cannot inherit the above singleton class ***/
class ex extends SingletonClass_1{
	public static void main(String args[]) {
		
	}
}