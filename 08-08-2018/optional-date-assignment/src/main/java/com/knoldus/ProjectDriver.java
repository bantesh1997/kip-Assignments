package com.knoldus;
import com.knoldus.classRoom.ClassRoom;
import  com.knoldus.classRoom.ClassRoomDriver;
import com.knoldus.classRoom.Student;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProjectDriver {
    public static void main(String a[]) {
        LocalDate birth_date = LocalDate.of(1991, Month.MAY, 10);

        BirthDate.displayBirthDate(birth_date);

        LocalDate date = LocalDate.of(1900, Month.MAY, 10);

        LeapYear.leapYearCalculation(date);

        //TimeZone tz=new TimeZone();
        CurrentTimeOfTimeZone.timezone("UTC+12");

        LifeOfGandhi_InSecond.lifeCalculator();

        Student student1 = new Student("Aashrita", 290, Optional.of(Arrays.asList("Maths", "Science")));
        Student student2 = new Student("John", 291, Optional.of(Arrays.asList("English", "Hindi")));
        Student student3 = new Student("Mark", 292, Optional.ofNullable(null));

        ClassRoom classRoom1 = new ClassRoom("xyz", Optional.of(Arrays.asList(student1, student2)));
        ClassRoom classRoom2 = new ClassRoom("xyz", Optional.of(Arrays.asList(student1, student2, student3)));
        ClassRoom classRoom3 = new ClassRoom("abc", Optional.of(Arrays.asList(student3, student2)));
        ClassRoom classRoom4 = new ClassRoom("pqr", Optional.of(Arrays.asList(student3, student2, student1)));
        ClassRoom classRoom5 = new ClassRoom("sam", Optional.ofNullable(null));

        List<ClassRoom> classRoomList = Arrays.asList(classRoom1, classRoom2, classRoom3, classRoom4, classRoom5);

        System.out.println("\nStudents associated with a room that have no subjects associated : \n" +
                ClassRoomDriver.getStudentsWithNoSubjects(classRoomList));

        System.out.println("\nSubjects of students associated with a room that has roomID 'xyz': \n"  +
                ClassRoomDriver.getSubjectsOfStudentsWithRoom(classRoomList));

        System.out.println("\nClassroom with Students says: \n" +
                ClassRoomDriver.displayHelloStudent(classRoomList, "abc"));
    }
}
