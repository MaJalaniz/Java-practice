import java.util.ArrayList;
import java.util.*;

class Student {

    public static void main(String[] args){
     Student marc = new Student("marc");
        marc.addGrade(98);
        marc.addGrade(89);
        marc.addGrade(96);
        marc.addGrade(90);
        marc.addGrade(88);

        System.out.println(marc.getName() + ", " + marc.getGrades());
        System.out.println(marc);
        // System.out.println(marc.grade);
        // System.out.println(marc.grade);
    }

    private ArrayList<Integer> grade;
    private String name;

   // Student(String name){
    //    this(name, new ArrayList<Integer>());
    //}

    Student(String name){
        this.name = name;
        this.grade = new ArrayList<Integer>();
    }

    public String getName(){
        return this.name;
    }


    public void addGrade(int grade){
        if(grade >= 0 && grade <= 100){
            this.grade.add(grade);
        }else{
            System.out.println("Invalid Grade");
        }
    }

    public ArrayList<Integer> getGrades(){
        return grade;
    }

   // public double getGradeAverage();









}