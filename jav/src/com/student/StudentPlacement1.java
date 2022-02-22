package com.student;

import java.util.ArrayList;
/*
interface HiringCriteria{
    Student SuitableForCompany(Student student,String grade);
}
class Facebook implements HiringCriteria{
    @Override
    public Student SuitableForCompany(Student student, String grade) {
        if (grade=="B" && student.getMmarks()>50){
            return student;
        }
        return null;
    }
}

class Google implements HiringCriteria{
    @Override
    public Student SuitableForCompany(Student student, String grade) {
        if ((grade=="A" || grade=="B") && student.getMmarks()>70){
            return student;
        }
        return null;
    }
}

class Amazon implements HiringCriteria{
    @Override
    public Student SuitableForCompany(Student student, String grade) {
        if ((grade=="A" || grade=="B") && student.getMmarks()>80){
            return student;
        }
        return null;
    }
}

class Student {
    private int id,cmarks,pmarks,mmarks;
    private String name;

    public Student(int id, String name, int cmarks, int pmarks, int mmarks) {
        this.id = id;
        this.name = name;
        this.cmarks = cmarks;
        this.pmarks = pmarks;
        this.mmarks = mmarks;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCmarks() {
        return cmarks;
    }

    public void setCmarks(int cmarks) {
        this.cmarks = cmarks;
    }

    public int getPmarks() {
        return pmarks;
    }

    public void setPmarks(int pmarks) {
        this.pmarks = pmarks;
    }

    public int getMmarks() {
        return mmarks;
    }

    public void setMmarks(int mmarks) {
        this.mmarks = mmarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int AvgScore(){
        return (this.cmarks+this.pmarks+this.mmarks)/3;
    }

    @Override
    public String toString(){
        return "Student{"+"id"+id+"Cmarks"+cmarks+"Pmarks"+pmarks+"Mmarks"+mmarks+"Name"+name+"\'"+"}";
    }
}

class StudentGradeCalculator{
    public String gradeCalculator(int totalmarks){
        if(totalmarks>=90 && totalmarks<=100){
            return "A";
        }
        else if(totalmarks>=80 && totalmarks<90){
            return "B";
        }
        else if(totalmarks>=70 && totalmarks<80){
            return "A";
        }
        else{
            return "Avg";
        }
    }
}
public class StudentPlacement1 {
    public static void main(String[] args){
        Student student1=new Student(101,"raju",100,78,80);
        Student student2=new Student(102,"rrajesh",100,78,80);
        Student student3=new Student(103,"Suraj",100,78,80);

        ArrayList<Student>studentArrayList=new ArrayList<Student>();
        ArrayList<Student>amazonSelects=new ArrayList<Student>();
        ArrayList<Student>facebookSelects=new ArrayList<Student>();
        ArrayList<Student>googleSelects=new ArrayList<Student>();

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        StudentGradeCalculator calculator=new StudentGradeCalculator();

        FacebookHR facebookHR=new FacebookHR();
        AmazonHR amazonHR=new AmazonHR();
        GoogleHR googleHR=new GoogleHR();
        /*
        for (Student student:studentArrayList){
            amazonSelects.add(amazonHR.SuitableForCompany(student,calculator.gradeCalculator(student.AvgScore())));
            facebookSelects.add(facebookHR.SuitableForCompany(student,calculator.gradeCalculator(student.AvgScore())));
            googleSelects.add(googleHR.SuitableForCompany(student,calculator.gradeCalculator(student.AvgScore())));

            amazonSelects.remove(null);
            facebookSelects.remove(null);
            googleSelects.remove(null);
        }


        System.out.println("Amazon Selects:"+amazonSelects+"\nFacebook Selects:"+facebookSelects+"\nGoogle  Selects:"+googleSelects);
    }
}

 */
