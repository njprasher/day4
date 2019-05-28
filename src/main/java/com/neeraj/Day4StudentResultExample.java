package com.neeraj;

import java.util.Date;

public class Day4StudentResultExample
{
    public static void main(String[] args)
    {
        StudentMain s1 = new StudentMain();

        s1.setStudentId(1);
        s1.setFirstName("Neeraj");
        s1.setLastName("Prasher");
        s1.setGender("Male");
        s1.setBirthDate(new Date(System.currentTimeMillis()));
        float[] myMarks = { 77.0f, 88.0f, 79.0f, 94.0f, 91.0f };
        s1.setMarks(myMarks);





        s1.calculateTotal();
        s1.calculatePercentage();
        s1.calculateResult();

        s1.displayStudentInformation();
    }
}
