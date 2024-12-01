package edu.bsu.cs222;

import java.util.Scanner;

public class MidSemesterReport {
    protected int checkMidSemesterReport() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many did you complete the Mid Semester Report, Type 1 for yes or 0 for no");
        return scanner.nextInt();
    }


    protected char calculateMidtermReportGrade(){
        int midSemesterReport = checkMidSemesterReport();
        if(midSemesterReport == 1){
            return 'A';
        }else{
            return 'D';
        }
    }
}
