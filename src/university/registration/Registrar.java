package university.registration;

import university.Student;
import university.exception.RegistrarException;
import university.exception.UniversityException;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Registrar {

    private static Registrar registrar;
    private static Set<Student> sharedSet;
    private Registrar(){

    }
    public static Registrar getRegistrar(){
        if(null == registrar){
            registrar = new Registrar();
            sharedSet = Collections.synchronizedSet(new HashSet<>());
        }
        return registrar;
    }

    public void registerStudent(Student student) throws UniversityException, RegistrarException {
        Validator validator = Validator.getValidator();
        if(!validator.validateStudentDetails(student)){
            throw new UniversityException("Student validation is failed");
        }if(sharedSet.size()<30) {
            student.setAdmissionId(student.getName().charAt(0) + student.getPhoneNumber().substring(7, 10));
            sharedSet.add(student);
        }else{
            throw new RegistrarException("30 seats are filled");
        }
    }
}
