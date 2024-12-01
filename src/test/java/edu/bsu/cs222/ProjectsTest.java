package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class ProjectsTest {
    @Test
    public void firstProjectTestIteration1(){
        simulateUserInput();
        Projects projects = new Projects();
        char resultGrade = projects.calculateProject1GradeConsole();
        char testGrade = 'A';
        Assertions.assertEquals(testGrade, resultGrade);
    }
    @Test
    public void firstProjectTestIteration2(){
        simulateUserInput();
        Projects projects = new Projects();
        char resultGrade = projects.calculateProject1GradeGUI();
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
