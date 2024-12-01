package edu.bsu.cs222;

import java.util.Scanner;

public class Projects {
    protected String checkFirstProjectConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your level on the First project iteration one?(If you didn't reach starter type n/a");
        return scanner.next();
    }

    protected String checkFirstProjectGUI(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your level on the First project iteration 2? (If you didn't reach starter type n/a");
        return scanner.next();
    }

    protected String checkFinalProject(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your level on the Final project?");
        return scanner.next();
    }

    protected char calculateProject1GradeConsole(){
        String firstProjectLevel = checkFirstProjectConsole();
        if(firstProjectLevel.equalsIgnoreCase("starter") || firstProjectLevel.equalsIgnoreCase("master") || firstProjectLevel.equalsIgnoreCase("proficient")){
            return 'A';
        }else{
            return 'B';
        }
    }

    protected char calculateProject1GradeGUI(){
        String firstProjectLevel = checkFirstProjectGUI();
        if(firstProjectLevel.equalsIgnoreCase("starter") || firstProjectLevel.equalsIgnoreCase("master") || firstProjectLevel.equalsIgnoreCase("proficient")){
            return 'A';
        }else{
            return 'B';
        }
    }

    protected char calculateFinalProjectGrade() {
        String finalProjectLevel = checkFinalProject();
        if(finalProjectLevel.equalsIgnoreCase("master")){
            return 'A';
        }else if(finalProjectLevel.equalsIgnoreCase("proficient")){
            return 'B';
        } else if (finalProjectLevel.equalsIgnoreCase("starter")) {
            return 'C';
        }
        return 'F';
    }
}
