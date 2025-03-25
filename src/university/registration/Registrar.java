package university.registration;

import university.Student;

public class Registrar {

    private static Registrar registrar;
    private Registrar(){

    }
    public static Registrar getRegistrar(){
        if(null == registrar){
            registrar = new Registrar();
        }
        return registrar;
    }

    public String registerStudent(Student student) {
        return student.getName().substring(0,1) + student.getPhoneNumber().substring(7,10);
    }
}
