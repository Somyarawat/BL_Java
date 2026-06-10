package org.lcwd.test.reading;

import com.google.gson.Gson;

import java.io.FileReader;

class Student{
    int id;
    String name;
    int age;
    String course;
}

public class ReadJson {
    public static void main(String[] args) throws Exception {
        Gson gson = new Gson();
        Student student = gson.fromJson(new FileReader("student.json"),Student.class);
        System.out.println(student.id);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.course);
    }
}
