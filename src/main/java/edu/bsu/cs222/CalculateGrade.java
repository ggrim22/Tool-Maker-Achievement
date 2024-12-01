package edu.bsu.cs222;

import java.util.ArrayList;
import java.util.List;

public class CalculateGrade {
    protected List<Character> calculateCategoryGrade() {
        Assignments assignments = new Assignments();
        Achievements achievements = new Achievements();
        MidSemesterReport midSemesterReport = new MidSemesterReport();
        Projects projects = new Projects();

        char assignmentGrade = assignments.calculateAssignmentGrade();
        char achievementGrade = achievements.calculateAchievementGrade();
        char midSemesterReportGrade = midSemesterReport.calculateMidtermReportGrade();
        char firstProjectGradeIteration1 = projects.calculateProject1GradeConsole();
        char firstProjectGradeIteration2 = projects.calculateProject1GradeGUI();
        char finalProjectGradeIteration1 = projects.calculateFinalProjectIteration1();
        char finalProjectGradeIteration2 = projects.calculateFinalProjectIteration2();
        char finalProjectGradeIteration3 = projects.calculateFinalProjectIteration3();


        List<Character> categoryGrades = new ArrayList<>();
        categoryGrades.add(assignmentGrade);
        categoryGrades.add(achievementGrade);
        categoryGrades.add(midSemesterReportGrade);
        categoryGrades.add(firstProjectGradeIteration1);
        categoryGrades.add(firstProjectGradeIteration2);
        categoryGrades.add(finalProjectGradeIteration1);
        categoryGrades.add(finalProjectGradeIteration2);
        categoryGrades.add(finalProjectGradeIteration3);

        return categoryGrades;
    }


    public String calculateGrade(){

        List<Character> categoryGrades = calculateCategoryGrade();

        char finalGrade = 'A';

        for (char grade : categoryGrades) {
            if (grade == 'F') {
                return "F";
            } else if (grade > finalGrade) {
                finalGrade = grade;
            }
        }

        return String.valueOf(finalGrade);
    }

}
