package org.example.site.edabit.java.veryEasy;

public class Convert_Hours_into_Seconds {
    public static int howManySeconds(int hours) {
        final int SECONDS =60, MINUTES = 60;
        hours = SECONDS * MINUTES * hours;
        return howManySeconds(hours);
    }
}
