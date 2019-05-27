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

    void calculateTotal()
    {
        this.totalMarks = 0.0f;
        for (int i = 0; i<marks.length; i++)
        {
            this.totalMarks = this.totalMarks + marks[i];
        }
    }

    void calculatePercentage()
    {

    }

    void calculateResult()
    {

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
