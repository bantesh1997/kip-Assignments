package com.knoldus.classRoom;

import java.util.List;
import java.util.Optional;

public class ClassRoom {

     private int roomId;
    private Optional<List<Student>> studentList;

    public ClassRoom(int roomId,Optional<List<Student>>studentList)
    {
        this.roomId=roomId;
        this.studentList=studentList;
    }
    int getRoomId()
    {
        return roomId;
    }
    Optional<List<Student>> getStudentList()
    {
        return studentList;
    }
}
