package com.neeraj;

import java.util.Arrays;
import java.util.Date;

public class StudentMain
{
    private int studentId;
    private String firstName;
    private String lastName;
    private String gender;
    private Date birthDate;
    private float marks[];
    private float totalMarks;
    private float percentage;
    private String result;

    public StudentMain()
    {
    }

    public StudentMain(int studentId, String firstName, String lastName, String gender, Date birthDate, float[] marks) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullname() {
        return this.firstName + " " + this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public float[] getMarks() {
        return marks;
    }

    public void setMarks(float[] marks) {
        this.marks = marks;
    }

    public float getTotalMarks() {
        return totalMarks;
    }

    public float getPercentage() {
        return percentage;
    }

    public String getResult() {
        return result;
    }

    public void calculateTotal()
    {
        this.totalMarks = 0.0f;
        for (int i = 0; i<this.marks.length; i++)
        {
            this.totalMarks = this.totalMarks + marks[i];
        }
    }

    public void calculatePercentage()
    {
        this.percentage = 0.0f;
        this.percentage=this.totalMarks/this.marks.length;
    }

    public void calculateResult()
    {
        int passedSubjects = 0;
        for(int i = 0; i < marks.length; i++)
        {
            if (this.percentage>50.0f)
            {
                passedSubjects++;
            }
        }

        if (passedSubjects<=2) this.result = "Fail";

        else{

            if (this.percentage>=94.0f)
            {
                this.result = "A+";
            }
            else if (this.percentage>=87.0f)
            {
                this.result = "A";
            }
            else if (this.percentage>=80.0f)
            {
                this.result = "A-";
            }
            else if (this.percentage>=77.0f)
            {
                this.result = "B+";
            }
            else if (this.percentage>=73.0f)
            {
                this.result = "B";
            }
            else if (this.percentage>=70.0f)
            {
                this.result = "B-";
            }
            else if (this.percentage>=67.0f)
            {
                this.result = "C+";
            }
            else if (this.percentage>=63.0f)
            {
                this.result = "C";
            }
            else if (this.percentage>=60.0f)
            {
                this.result = "C-";
            }
            else if (this.percentage>=50.0f)
            {
                this.result = "D";
            }
            else this.result = "F";
        }
    }

    public void displayStudentInformation()
    {



        this.setStudentId(1);
        //s1.setBirthDate(date.toString());
        this.setFirstName("Neeraj");
        this.setLastName("Prasher");
        this.setGender("Male");


        float[] marksToShow = this.getMarks();

        System.out.println(
                        "---------------------------------- \n" +
                        "      ------STUDENT INFO------      \n" +
                        "---------------------------------- \n" +
                        "Student ID : " + this.getStudentId() + "\n" +
                        "Full Name : " + this.getFullname() + "\n" +
                        "Gender : " + this.getGender() + "\n" +
                        "Birth Date : " + this.getBirthDate() + "\n" );

        for(int i = 0; i < this.marks.length; i++)
        {
            System.out.println("Subject [1" + i +"] : " + marksToShow[i] + "");
        }

        System.out.println(
                    "Total Marks : " + this.totalMarks + "\n" +
                    "Percentage : " + this.percentage + "\n" +
                    "Result : " + this.result + "\n"
        );

    }

    @Override
    public String toString() {
        return "StudentMain{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", marks=" + Arrays.toString(marks) +
                ", totalMarks=" + totalMarks +
                ", percentage=" + percentage +
                ", result='" + result + '\'' +
                '}';
    }
}
