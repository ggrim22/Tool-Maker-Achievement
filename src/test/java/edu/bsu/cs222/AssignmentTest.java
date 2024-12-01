package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class AssignmentTest {
    @Test
    public void assignmentGradeTest(){
        simulateUserInput();
        Achievements achievements = new Achievements();
        char resultGrade = achievements.calculateAchievementGrade();
        char testGrade = 'C';
        Assertions.assertEquals(testGrade, resultGrade);
    }


    private void simulateUserInput() {
        System.setIn(new ByteArrayInputStream("4".getBytes()));
    }
}
