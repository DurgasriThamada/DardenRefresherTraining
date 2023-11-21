package string.java;

public class StringAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)
		String str = "Hello World";
		System.out.println("Length of the string 'Hello World': "+str.length());
		//2)
		String str1="Hello";
		String str2="How are you?";
		System.out.println("Joining of two strings: "+str1.concat(" ").concat(str2));
		String s = new String("Java String pool refers to collection of Strings which are stored in heap memory");
		String st = new String(s);
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(st.replace('a', '$'));
		if(s.contains("collection"))
			System.out.println("'collection' is found");
		else System.out.println("'collection' is not found");
		String str3 = new String("java string pool refers to collection of strings which are stored in heap memory");
		System.out.println((str3.equals(s)?"Matches":"doen't matches"));
		System.out.println((str3.equalsIgnoreCase(s)?"Matches if case is ignored":"doen't matches"));
	}

}
