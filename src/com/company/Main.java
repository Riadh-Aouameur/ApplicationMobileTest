package com.company;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;

public class Main {
    interface ShowData{
        void show();
    }

    public static void main(String[] args) {
        Person person = new Person("Aouameur","Riadh");
        Professor professor =new Professor("Samir","benhami",01,555555);
        Student student = new Student("bekkoassa","Mouhmed",15);
        System.out.println("...-------------------------------------------------------------------...\nPerson :");
        person.Show();
        System.out.println("...-------------------------------------------------------------------...\nProfessor :");
        professor.Show();
        System.out.println("...-------------------------------------------------------------------...\nStudent :");
          ShowData showData = (() -> {
              System.out.println("ID : "+student.id);
              System.out.println("First Name : "+student.firstName);
              System.out.println("Last Name :"+student.lastName);
          });
          showData.show();
        System.out.println("...-------------------------------------------------------------------...");
    }



}
