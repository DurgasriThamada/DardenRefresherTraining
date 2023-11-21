package oops.java;

import java.util.Scanner;

//Abstract base class
abstract class Persistence {
 // Abstract method to be implemented by subclasses
 public abstract void persist();
}

//FilePersistence subclass
class FilePersistence extends Persistence {
 @Override
 public void persist() {
     System.out.println("Data saved in File");
     // Additional logic for file persistence
 }
}

//DatabasePersistence subclass
class DatabasePersistence extends Persistence {
 @Override
 public void persist() {
     System.out.println("Data saved in Database");
     // Additional logic for database persistence
 }
}

//Client class
class PersistenceClient {
 public static void main(String[] args) {
     // Get the persistence object at runtime (can be either File or Database)
     Persistence persistence;

     Scanner sc= new Scanner(System.in);
     System.out.println("Type 1 for Data to be saved in file or Type 2 for Data to be saved in Database");
     boolean useFilePersistence = (sc.nextInt() ==1 ?true:false);

     if (useFilePersistence) {
         persistence = new FilePersistence();
     } else {
         persistence = new DatabasePersistence();
     }

     // Invoke the persist() method on the persistence object without knowing the implementation
     persistence.persist();
 }
}
