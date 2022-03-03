package com.example.labfive;
public class DataSource {
    public String StudentNum;
    public Float Assignment;
    public Float Midterm;
    public Float Final;
    public Float Marks;
    public String LetterGrade;

    public DataSource(){
        this.StudentNum = "";
        this.Assignment = 0.0f;
        this.Midterm = 0.0f;
        this.Final = 0.0f;
        this.Marks = 0.0f;
    }

    public DataSource(String StudentNum, Float Assignment, Float Midterm, Float Final){
        this.StudentNum = StudentNum;
        this.Assignment = Assignment;
        this.Midterm = Midterm;
        this.Final = Final;
        Marks = (Assignment + Midterm + Final) / 3;

        if (Marks >= 80){
            LetterGrade = "A";
        }
        else if (Marks >= 70 && Marks <= 79){
            LetterGrade = "B";
        }
        else if (Marks >= 60 && Marks <= 69){
            LetterGrade = "C";
        }
        else if (Marks >= 50 && Marks <= 59){
            LetterGrade = "D";
        }
        else if (Marks >= 0 && Marks <= 49){
            LetterGrade = "F";
        }
    }

    public String getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(String StudentNum){
        this.StudentNum = StudentNum;
    }

    public float getAssignment() {
        return Assignment;
    }

    public void setAssignment(Float Assignment){
        this.Assignment = Assignment;
    }

    public float getMidterm() {
        return Midterm;
    }

    public void setMidterm(Float Midterm){
        this.Midterm = Midterm;
    }

    public float getFinal() {
        return Final;
    }

    public void setFinal(Float Final){
        this.Final = Final;
    }

    public float getMarks() {
        return Marks;
    }

    public void setMarks(Float Marks){
        this.Marks = Marks;
    }

    public String getLetterGrade() {
        return LetterGrade;
    }

    public void setLetterGrade(String LetterGrade){
        this.LetterGrade = LetterGrade;
    }

}
