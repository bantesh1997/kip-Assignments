//package com.knoldus.classRoom;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//import java.util.function.Function;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//
//public class ClassRoomDriver {
//
//    private static void studentWithNoSubject(List<ClassRoom> classroom)
//    {
//        System.out.println(classroom.stream().map(ClassRoom::getStudentList).map(j->j.ifPresent(j.filter(k->k.get())).collect(Collectors.toList()));
//    }
//
//
//    public static void main(String arg[])
//    {
//        Student ob1=new Student("Rahul",14103031, Optional.of( Arrays.asList("physics","ML")));
//        Student ob2=new Student("sachin",1412315, Optional.of( Arrays.asList("DBMS","ML")));
//        Student ob3=new Student("divyanshu",14112365, Optional.empty());
//        Student ob4=new Student("rudar",14111332, Optional.of( Arrays.asList("HTML","CSS")));
//        Student ob5=new Student("bantesh",14103077, Optional.of( Arrays.asList("DataStructure","Algorithms")));
//        Student ob6=new Student("abhishek",142562, Optional.of( Arrays.asList("history","Math")));
//       ClassRoom csObject1=new ClassRoom(1,Optional.empty());
//       ClassRoom csObject2=new ClassRoom(2,Optional.of(Arrays.asList(ob1,ob2)));
//       ClassRoom csObject3=new ClassRoom(3,Optional.of(Arrays.asList(ob4,ob6)));
//       ClassRoom csObject4=new ClassRoom(4,Optional.of(Arrays.asList(ob1,ob2,ob3)));
//       ClassRoom csObject5=new ClassRoom(5,Optional.of(Arrays.asList(ob6,ob3,ob1,ob2,ob4)));
//       List<ClassRoom>list=Arrays.asList(csObject1,csObject2,csObject3,csObject4,csObject5);
//    }
//}
