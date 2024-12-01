package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class ProjectsTest {
    @Test
    public void firstProjectTest(){
        simulateUserInput();
        Projects projects = new Projects();
        char resultGrade = projects.calculateProject1Grade();
        char testGrade = 'A';
        Assertions.assertEquals(testGrade, resultGrade);
    }
    @Test
    public void finalProjectTest(){
        simulateUserInput();
        Projects projects = new Projects();
        char resultGrade = projects.calculateFinalProjectGrade();
        char testGrade = 'C';
        Assertions.assertEquals(testGrade, resultGrade);
    }


    private void simulateUserInput() {
        System.setIn(new ByteArrayInputStream("Starter".getBytes()));
    }
}
