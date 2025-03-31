import university.GenerateStudentData;
import university.Student;
import university.exception.RegistrarException;
import university.exception.UniversityException;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws UniversityException {
        try {
            ForkJoinPool customPool = new ForkJoinPool(5);
            List<Student> list = GenerateStudentData.getStudentsList();
            customPool.submit(() -> {
                list.parallelStream().forEach(s->{
                    try {
                        s.registerStudent();
                        s.registerForExam();
                        s.appearForExam();
                        System.out.println("Student registered for university then for exam and passed!");
                    } catch (UniversityException e) {
                        System.out.println(e.getMessage());
                    } catch (RegistrarException e){
                        throw new RuntimeException(e.getMessage());
                    }
                });
            }).join();
            customPool.shutdown();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}