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
        char firstProjectGrade = projects.calculateProject1Grade();
        char finalProjectGrade = projects.calculateFinalProjectGrade();

        List<Character> categoryGrades = new ArrayList<>();
        categoryGrades.add(assignmentGrade);
        categoryGrades.add(achievementGrade);
        categoryGrades.add(midSemesterReportGrade);
        categoryGrades.add(firstProjectGrade);
        categoryGrades.add(finalProjectGrade);

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
