package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class CalculateGradeTest {

    @Test
    public void calculateGradeTest(){
        CalculateGrade gradeCalculator;
        gradeCalculator = new CalculateGrade() {
            @Override
            public List<Character> calculateCategoryGrade() {
                List<Character> grades = new ArrayList<>();
                grades.add('A');
                grades.add('B');
                grades.add('C');
                grades.add('D');
                grades.add('A');
                return grades;
            }
        };

        String finalGrade = gradeCalculator.calculateGrade();
        Assertions.assertEquals("D", finalGrade);
    }



}
