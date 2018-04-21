package com.wsg.dto;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

/**
 * Created by shanguang.wang on 18/3/28.
 * 创建对象的5种方式
 */
public class CreateObject {

    public static void main(String[] args) throws Exception{
        Student student1 = new Student();
        student1.setName("new");
        System.out.println("name:"+student1.getName());

        Student student2 = (Student) Class.forName("com.wsg.dto.Student").newInstance();
        student2.setName("Class new Instance");
        System.out.println("name:"+student2.getName());

        Constructor<Student> constructor = Student.class.getConstructor();
        Student student3 = constructor.newInstance();
        student3.setName("constructor");
        System.out.println("name:"+student3.getName());

        Student student4 = (Student)student3.clone();
        student4.setName("clone");
        System.out.println("name:"+student4.getName());

        //Serialization
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/Users/a1/data.class"));
        student4.setAge(11);
        outputStream.writeObject(student4);
        outputStream.close();
        //Deserialization
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/a1/data.class"));
        Student student5 = (Student)objectInputStream.readObject();
        objectInputStream.close();
        System.out.println("deserilization age:"+student5.getAge());
        student5.setName("serialization");
        System.out.println("name:"+student5.getName());
    }

}
