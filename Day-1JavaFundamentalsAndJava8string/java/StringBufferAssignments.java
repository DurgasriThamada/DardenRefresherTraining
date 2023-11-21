package string.java;

public class StringBufferAssignments {

    public static void main(String[] args) {
        // Append strings using StringBuffer
        StringBuffer str = new StringBuffer("StringBuffer");
        
        str.append(" is a peer class of String");
        str.append(" that provides much of ");
        str.append("the functionality of strings");

        // Print the result
        System.out.println(str.toString());
    
        StringBuffer str1 = new StringBuffer("It is used to _ at the specified index position");

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

        // Create a StringBuffer and reverse the string
        StringBuffer reversedStringBuffer = new StringBuffer(originalString);
        reversedStringBuffer.reverse();

        // Print the reversed string
        System.out.println(reversedStringBuffer.toString());
    }
}
