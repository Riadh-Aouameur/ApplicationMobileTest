package com.company;

public class Student extends Person {

      int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(String firstName, String lastName, int id) {
        super(firstName, lastName);
        this.id = id;
    }


}
