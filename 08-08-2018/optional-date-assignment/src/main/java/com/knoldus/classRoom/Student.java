package com.knoldus.classRoom;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Student {

    private String name;
    private long rollNo;
    private Optional<List<String>>subject;
    public Student()
    {
        this.name="bantesh";
        this.rollNo=1;

    }
    public Student(String name,long rollNo,Optional<List<String>>subject)
    {
        this.name=name;
        this.rollNo=rollNo;
        this.subject=subject;
    }
   public String getName(){
        return name;
    }
    long getRollNo(){
        return rollNo;
    }
   public Optional<List<String>> getSubject()
    {
        return subject;
    }
    @Override
    public String toString() {
        return "(Name: "+ name + ", Roll no: " + rollNo + ")";
    }
}
