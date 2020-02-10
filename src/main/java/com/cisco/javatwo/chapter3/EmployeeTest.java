package com.cisco.javatwo.chapter3;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Sandya","Sivakumar",60000.0);
        Employee employee2 = new Employee("Abhishek","Prasad",80000.0);

        System.out.println("Employee1's salary: "+ employee1.getSalary());
        System.out.println("Employee2's salary: "+employee2.getSalary());

        employee1.setSalary(1.1*60000);
        employee2.setSalary(1.1*80000);

        System.out.println("After increment:");
        System.out.println("Employee1's salary: "+ employee1.getSalary());
        System.out.println("Employee2's salary: "+employee2.getSalary());
    }
}
