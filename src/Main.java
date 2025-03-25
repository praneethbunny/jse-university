import university.Student;
import university.examination.Exam;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", "Single",19,"Male","19-05-2006","Hyderabad","john.elka@out.com","john143@email.com","9876542310","SSC","UAE","","", null);
        student.registerStudent();
        student.registerForExam();
        student.appearForExam();
        System.out.println("Hello world!");
    }
}