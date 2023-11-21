package collections.java;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.LinkedList;

public class LinkedList_4 {

    public static void main(String[] args) {

        LinkedList<LocalDate> dobList = new LinkedList<>();
        dobList.add(LocalDate.of(2000, 12, 23));
        dobList.add(LocalDate.of(2001, 12, 23));

        for (int i = dobList.size() - 1; i >= 0; i--) {
            LocalDate dob = dobList.get(i);
            printLeapYearInfo(dob);
        }
    }

    private static void printLeapYearInfo(LocalDate dob) {
        try {

            System.out.print("Your date of birth is " + dob.toString());

            if (dob.isLeapYear()) {
                System.out.println(" and it was a leap year");
            } else {
                System.out.println(" and it was not a leap year");
            }
        } catch (DateTimeException e) {
            System.out.println("Invalid date");
        }
    }
}
