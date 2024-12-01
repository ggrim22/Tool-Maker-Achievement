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

    protected String checkFinalProjectIteration1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your level on the Final project iteration 1?");
        return scanner.next();
    }

    protected String checkFinalProjectIteration2(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your level on the Final project iteration 2?");
        return scanner.next();
    }

    protected String checkFinalProjectIteration3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What was your level on the Final project iteration 3?");
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

    protected char calculateFinalProjectIteration1() {
        String finalProjectLevel = checkFinalProjectIteration1();
        if(finalProjectLevel.equalsIgnoreCase("starter") || finalProjectLevel.equalsIgnoreCase("master") || finalProjectLevel.equalsIgnoreCase("proficient")){
            return 'A';
        }else{
            return 'B';
        }
    }
    protected char calculateFinalProjectIteration2() {
        String finalProjectLevel = checkFinalProjectIteration2();
        if(finalProjectLevel.equalsIgnoreCase("starter") || finalProjectLevel.equalsIgnoreCase("master") || finalProjectLevel.equalsIgnoreCase("proficient")){
            return 'A';
        }else{
            return 'B';
        }
    }
    protected char calculateFinalProjectIteration3() {
        String finalProjectLevel = checkFinalProjectIteration3();
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
