package university.examination;

import university.Student;

public class ExamRegistrar {
    private static ExamRegistrar examRegistrar;

    private ExamRegistrar() { }
    public static ExamRegistrar getExamRegistrar(){
        if(null == examRegistrar){
            examRegistrar = new ExamRegistrar();
        }
        return examRegistrar;
    }
    public Exam registeringStudentForExamination (Student student){
        Paper paper = new Paper();
        Exam exam = new Exam(paper);
        return exam;
    }
}
