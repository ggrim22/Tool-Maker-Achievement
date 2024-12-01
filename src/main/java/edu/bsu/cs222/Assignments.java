package edu.bsu.cs222;

import java.util.Scanner;

public class Assignments {
    protected int checkAssignment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many assignments did you complete?");
        return scanner.nextInt();
    }

    protected char calculateAssignmentGrade(){
        int numberOfAssignments = checkAssignment();
        if(numberOfAssignments == 7){
            return 'A';
        } else if (numberOfAssignments == 6) {
            return 'B';
        } else if (numberOfAssignments == 5) {
            return 'C';
        } else if (numberOfAssignments == 4) {
            return 'D';
        }else{
            return 'F';
        }
    }
}
