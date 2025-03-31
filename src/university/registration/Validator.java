package university.registration;

import university.Student;
import university.exception.UniversityException;

public class Validator {
    private static Validator validator;
    private Validator(){}
    public static Validator getValidator(){
        if(null == validator){
            validator = new Validator();
        }
        return validator;
    }
    public boolean validateStudentDetails(Student student) throws UniversityException {
        if(student.getAge()>35||student.getAge()<23){
            throw new UniversityException("Students only over 23 and under 35 are eligible to be selected");
        }
        return true;
    }
}
