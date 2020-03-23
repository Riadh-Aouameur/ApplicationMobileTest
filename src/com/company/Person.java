package com.company;

public class Person {


    String firstName;
    String lastName;


    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

  public void  Show(){
        System.out.println("First Name : "+this.firstName);
        System.out.println("Last Name : "+this.lastName);
  }

}
