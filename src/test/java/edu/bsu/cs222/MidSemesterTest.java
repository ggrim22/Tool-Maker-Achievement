package edu.bsu.cs222;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

public class MidSemesterTest {

    @Test
    public void midSemesterReportTest(){
        simulateUserInput();
        MidSemesterReport midSemesterReport = new MidSemesterReport();
        char resultGrade = midSemesterReport.calculateMidtermReportGrade();
        char testGrade = 'A';
        Assertions.assertEquals(testGrade, resultGrade);
    }


    private void simulateUserInput() {
        System.setIn(new ByteArrayInputStream("1".getBytes()));
    }
}
