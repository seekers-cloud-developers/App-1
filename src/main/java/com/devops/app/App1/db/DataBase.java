package com.devops.app.App1.db;

import com.devops.app.App1.model.Student;

import java.util.ArrayList;

public class DataBase {

   public static ArrayList<Student> studentsDatable = new ArrayList();

   static{
       studentsDatable.add(new Student("S-001","Nimal","Panadura"));
       studentsDatable.add(new Student("S-002","Jayantha","Colombo"));
       studentsDatable.add(new Student("S-003","Bandara","Jayanthipura"));
   }
}
