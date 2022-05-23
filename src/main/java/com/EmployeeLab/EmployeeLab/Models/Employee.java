package com.EmployeeLab.EmployeeLab.Models;

import javax.persistence. *;

@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    @Column(name = "id")
    private Long id;
    @Column(name = "first_name")
    private String FirstName;
    @Column(name = "last_name")
    private String LastName;
    @Column(name = "age")
    private int age;


    @Column(name = "employeeNumber")
    private int EmployeeNumber;
    @Column(name = "email")
    private String  Email;

    public Employee(String FirstName, String LastName, int age, int EmployeeNumber, String Email) {
       this.FirstName = FirstName;
       this.LastName = LastName;
        this.age = age;
        this.EmployeeNumber = EmployeeNumber;
        this.Email = Email;
    }
    public Employee(){

    }
    public String getFirstName() {
        return  FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getEmail(){
        return Email;
    }
    public int getAge(){
        return age;
    }

    public int getEmployeeNumber() {
        return EmployeeNumber;
    }
}

