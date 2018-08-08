package com.knoldus.classRoom;

import com.knoldus.classRoom.ClassRoom;
import com.knoldus.classRoom.Student;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

public class ClassRoomDriver{

    public static Set<Student> getStudentsWithNoSubjects(List<ClassRoom> classRoomlist){

        List<ClassRoom> classRoomWithStudents = classRoomlist.stream()
                .filter(room -> room.getStudentList().isPresent())
                .collect(Collectors.toList());

        List<List<Student>> studentslist = classRoomWithStudents.stream()
                .map(list -> list.getStudentList().get())
                .collect(Collectors.toList());

        return studentslist.stream().flatMap(Collection::stream)
                .filter(student -> !student.getSubject().isPresent())
                .collect(toSet());
    }

    public static  Set<String> getSubjectsOfStudentsWithRoom(List<ClassRoom> classRoomlist){

        List<ClassRoom> classRoomWithStudents = classRoomlist.stream()
                .filter(room -> room.getStudentList().isPresent() && "xyz".equals(room.getRoomId()))
                .collect(Collectors.toList());

        List<List<Student>> studentslist = classRoomWithStudents.stream()
                .map(list -> list.getStudentList().get())
                .collect(Collectors.toList());

        List<Student> studentsWithSubjects = studentslist.stream().flatMap(Collection::stream)
                .filter(student -> student.getSubject().isPresent())
                .collect(toList());

        List<List<String>> subjectsOfRequiredStudents = studentsWithSubjects.stream()
                .map(student -> student.getSubject().get())
                .collect(Collectors.toList());

        return subjectsOfRequiredStudents.stream().flatMap(Collection::stream)
                .collect(Collectors.toSet());
    }



    public  static  String displayHelloStudent(List<ClassRoom> classRooms, String roomId){

        List<ClassRoom> classRoomWithStudents =  classRooms.stream()
                .filter(classRoom -> classRoom.getStudentList().isPresent())
                .collect(Collectors.toList());
        if(classRoomWithStudents.stream().anyMatch(room -> roomId.equals(room.getRoomId())))
            return "Hello Students";
        else
            return "No students";
    }
}