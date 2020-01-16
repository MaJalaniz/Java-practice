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

        System.out.println(s1.getName() + ", " + s2.getName() + ", " + s3.getName() + ", " + s4.getName());

    }






}