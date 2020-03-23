package com.company;

public class Professor extends Person{
    int id;
    float salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }



    public Professor(String firstName, String lastName, int id, float salary) {
        super(firstName, lastName);
        this.id = id;
        this.salary = salary;
    }

   @Override
   public void Show(){
       System.out.println("ID : "+this.id);
       System.out.println("First Name : "+this.firstName);
       System.out.println("Last Name : "+this.lastName);
       System.out.println("Salary : "+this.salary);
   }
}
