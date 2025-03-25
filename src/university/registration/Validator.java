package university.registration;

import university.Student;

public class Validator {
    private static Validator validator;
    private Validator(){}
    public static Validator getValidator(){
        if(null == validator){
            validator = new Validator();
        }
        return validator;
    }
    public boolean validateStudentDetails(Student student) {
        return true;
    }
}
