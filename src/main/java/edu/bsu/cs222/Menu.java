package edu.bsu.cs222;

public class Menu {
    public static void main(String[] args) {
        CalculateGrade grade = new CalculateGrade();
        String finalGrade = grade.calculateGrade();

        System.out.printf("Your Final Grade is %s\n", finalGrade);
    }
}
