package edu.bsu.cs222;

import java.util.Scanner;

public class Achievements {
    protected int checkAchievements(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many achievements did you complete?");
        return scanner.nextInt();
    }

    protected char calculateAchievementGrade(){
        int numberOfAssignments = checkAchievements();
        if(numberOfAssignments == 6){
            return 'A';
        } else if (numberOfAssignments == 5) {
            return 'B';
        } else if (numberOfAssignments == 4) {
            return 'C';
        } else if (numberOfAssignments == 3) {
            return 'D';
        }else{
            return 'F';
        }
    }
}
