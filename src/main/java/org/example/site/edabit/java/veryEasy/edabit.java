package org.example.site.edabit.java.veryEasy;

import java.util.Scanner;

public class edabit {
    Scanner scanner = new Scanner(System.in);
    private void handleEdabit() {
        System.out.println("Please choose a category: " +
                "1. Very Easy " +
                "2. Easy " +
                "3. Medium " +
                "4. Hard");
        int edabitCategoryChoice = Integer.parseInt(scanner.nextLine());

    }
}
