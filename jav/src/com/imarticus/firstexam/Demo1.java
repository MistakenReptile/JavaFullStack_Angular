package com.imarticus.firstexam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    private int id;
    private String name;
    private String address;
    private int salary;

    public Employee(){}

    public Employee(int id, String name, String address, int salary) {          //Constructor
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){          //Covert hashcode to string
        return this.name;
    }
}

class EmployeeSortByName implements Comparator<Employee >  {                 // Sort by Employee Name
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}

class EmployeeSortBySalary implements Comparator < Employee > {             //Sort By Employee Salary
    public int compare(Employee emp1, Employee emp2) {
        int SalCompare = Integer.compare(emp1.getSalary(),emp2.getSalary());
        if(SalCompare==0){
            return emp1.getName().compareTo(emp2.getName());
        }else if (emp1.getSalary() > emp2.getSalary())
            return  1;
        else if (emp1.getSalary() < emp2.getSalary())
            return  -1;
        else if (emp1.getSalary() == emp2.getSalary())
            return 0;
        else{  return SalCompare;}
    }
}


public class Demo1{
        public static void main(String[] args){

            ArrayList<Employee> employees = new ArrayList<>();
            Employee e1 = new Employee(101,"Abra", "CHN",20000);
            Employee e2 = new Employee(102,"Kadabra","BLR",25000);
            Employee e3 =new Employee(103,"Raj","MUM",45000);
            Employee e4 = new Employee(104,"Rajesh","KOL",30000);
            Employee e5 = new Employee(105,"Suraj","DL",45000);
            employees.add(e1);
            employees.add(e2);
            employees.add(e3);
            employees.add(e4);
            employees.add(e5);

            System.out.println("Sorting based on Employee Salary");
            Collections.sort(employees, new EmployeeSortBySalary());
            printEmployees(employees);


            System.out.println("\nSorting Based on Employee Name");
            Collections.sort(employees, new EmployeeSortByName());
            printEmployees(employees);

        }

        public static void printEmployees(List<Employee> employees) {
            for (Employee e: employees) {
                System.out.println("Id->" + e.getId() + ", Name -> " + e.getName() + ", Salary-> " + e.getSalary() + ", Address-> " + e.getAddress());
            }
        }
    }
