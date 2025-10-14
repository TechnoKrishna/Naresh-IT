package com.example.blc;

public class Student {

    private int studentId;
    private String studentName;
    private int studentMarks;
    private char studentGrade;

    public void setStudentData(int studentId, String studentName, int studentMarks)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentMarks = studentMarks;
        calculateGrade(studentMarks);
    }

    public void calculateGrade(int studentMarks)
    {
        if(studentMarks > 90)
        {
            this.studentGrade = 'A';
        } else if (studentMarks > 80) {
            this.studentGrade = 'B';
        } else if (studentMarks > 70) {
            this.studentGrade = 'C';
        } else if (studentMarks > 60) {
            this.studentGrade = 'D';
        } else {
            this.studentGrade = 'E';
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentMarks=" + studentMarks +
                ", studentGrade=" + studentGrade +
                '}';
    }
}
