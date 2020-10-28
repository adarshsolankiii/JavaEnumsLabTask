/*   Created by IntelliJ IDEA.
 *   Author: Adarsh Solanki (adarshsolankiii)
 *   Date: 28-10-2020
 *   Time: 13:09
 *   File: Main.java
 */

package main;
// Create program to demonstrate the working of Enums in JAVA.

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

enum Months {
    JANUARY(31), FEBRUARY(29), MARCH(31), APRIL(30),
    MAY(31), JUNE(30), JULY(31), AUGUST(31),
    SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);


    private final int numOfDays;

    Months(int numOfDays) {
        this.numOfDays = numOfDays;
    }
}

public class Main {
    public static void main(String[] args) {
        int currentDate = new GregorianCalendar().get(Calendar.DATE);
        String currentMonth = new GregorianCalendar().getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);
        int totalNumOfDays = new GregorianCalendar().getActualMaximum(Calendar.DAY_OF_MONTH);
        int noOfDaysLeft = totalNumOfDays - currentDate;
        System.out.println(noOfDaysLeft + " days left in " + currentMonth + "!");


    }
}
