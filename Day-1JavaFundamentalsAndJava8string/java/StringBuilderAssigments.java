package string.java;

public class StringBuilderAssigments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder str = new StringBuilder("StringBuilder");
        
        str.append(" is a peer class of String");
        str.append(" that provides much of ");
        str.append("the functionality of strings");

        // Print the result
        System.out.println(str.toString());
    
        StringBuilder str1 = new StringBuilder("It is used to _ at the specified index position");

        // String to be inserted
        String insertText = "insert text";

        // Index where the text should be inserted
        int startIndex = str1.indexOf("_");
        int endIndex = startIndex + ("_").length();

        // Insert the text
        str1.replace(startIndex,endIndex, insertText);

        // Print the result
        System.out.println(str1.toString());
    
        String originalString = "This method returns the reversed object on which it was called";

        // Create a StringBuilder and reverse the string
        StringBuilder reversedStringBuilder = new StringBuilder(originalString);
        reversedStringBuilder.reverse();

        // Print the reversed string
        System.out.println(reversedStringBuilder.toString());
    }
}
