package com.imarticus.firstexam;

import java.util.*;


class Employee1{
    private int id;
    private String name;
    private String address;
    private int salary;

    public Employee1(){}

    public Employee1(int id, String name, String address, int salary) {
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

    public String toString(){
        return ("ID: "+this.getId()+", Name: "+this.getName()+", Address: "+this.getAddress()+", Salary: "+this.getSalary());
    }

    public boolean equals(Object o){
        if(( o instanceof Employee1) && (((Employee1)o).getAddress()==this.getAddress())){
            return  true;
        }else{
            return false;
        }
    }
    public int hashCode(){
        return this.getAddress().toString().hashCode();
    }
}

public class Demo3 {
    public static void main(String[] args) {
        ArrayList<Employee1> employeesList = new ArrayList<>();
        Employee1 e1 = new Employee1(101,"Abra", "CHN",20000);
        Employee1 e2 = new Employee1(102,"Kadabra","BLR",25000);
        Employee1 e3 =new Employee1(103,"Raj","KOL",45000);
        Employee1 e4 = new Employee1(104,"Rajesh","KOL",30000);
        Employee1 e5 = new Employee1(105,"Suraj","DL",45000);
        employeesList.add(e1);
        employeesList.add(e2);
        employeesList.add(e3);
        employeesList.add(e4);
        employeesList.add(e5);

        LinkedHashSet<Employee1> employeesSet = new LinkedHashSet(employeesList);
        System.out.println("\nEmployee List ");
        for(Employee1 e : employeesSet){
            System.out.println(e);
        }
    }
}
