package collections.java;

import java.util.Map;
import java.util.TreeMap;

public class Contact_1 {
	private long phoneNumber;
	private String name;
	private String email;
	private Gender gender;
	
	public enum Gender{
		MALE, FEMALE, OTHER
	}

	public Contact_1(long phoneNumber, String name, String email, Gender gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
}

class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap with keys as phone numbers and values as Contact objects
        TreeMap<Long, Contact_1> contactMap = new TreeMap<>(Map.of(
                9876543210L, new Contact_1(9876543210L, "John Doe", "john@example.com", Contact_1.Gender.MALE),
                8765432109L, new Contact_1(8765432109L, "Jane Smith", "jane@example.com", Contact_1.Gender.FEMALE),
                7654321098L, new Contact_1(7654321098L, "Bob Johnson", "bob@example.com", Contact_1.Gender.MALE)
                // Add more contacts as needed
        ));

        System.out.println("All Keys:");
        for( Long phoneNumber: contactMap.descendingKeySet()) {
            System.out.println(phoneNumber);
        }

        for( Contact_1 contact : contactMap.values()) {
        	System.out.println(contact);
        }

        for(Map.Entry<Long, Contact_1> entry: contactMap.entrySet()) {
        	System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
