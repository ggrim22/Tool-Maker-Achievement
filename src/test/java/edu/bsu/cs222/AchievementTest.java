package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class AchievementTest {
    @Test
    public void AchievementGradeTest(){
        simulateUserInput();
        Achievements achievements = new Achievements();
        char resultGrade = achievements.calculateAchievementGrade();
        char testGrade = 'A';
        Assertions.assertEquals(testGrade, resultGrade);
    }


    private void simulateUserInput() {
        System.setIn(new ByteArrayInputStream("6".getBytes()));
    }
}
