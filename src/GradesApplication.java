import java.util.HashMap;

class GradesApplication {

    public static void main(String[] args){

        HashMap<String, Student> student = new HashMap<>();
        Student s1 = new Student("Mark");
        Student s2 = new Student("Damien");
        Student s3 = new Student("Toya");
        Student s4 = new Student("Kio");
        s1.addGrade(89);
        s1.addGrade(92);
        s1.addGrade(84);
        s2.addGrade(95);
        s2.addGrade(91);
        s2.addGrade(90);
        s3.addGrade(90);
        s3.addGrade(82);
        s3.addGrade(98);
        s4.addGrade(94);
        s4.addGrade(92);
        s4.addGrade(90);

        System.out.println(s1.getName() + "'s grade is: " + s1.getGrades());
        System.out.println(s2.getName() + "'s grade is: " + s2.getGrades());
        System.out.println(s3.getName() + "'s grade is: " + s3.getGrades());
        System.out.println(s4.getName() + "'s grade is: " + s4.getGrades());

        

        student.put("Mark", s1) ;
        student.put("Damien", s2);
        student.put("Toya", s3);
        student.put("Kio", s4);

        System.out.println(student);

    }






}