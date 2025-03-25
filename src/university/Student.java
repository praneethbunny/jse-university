package university;

import university.examination.Evaluator;
import university.examination.Exam;
import university.examination.ExamRegistrar;
import university.registration.Registrar;

import java.util.Date;

public class Student {
    private String name;
    private String maritalStatus;
    private int age;
    private String sex;
    private String dateOfBirth;
    private String address;
    private String primaryEmailId;
    private String secondaryEmailId;
    private String phoneNumber;
    private String highestEducationQualification;
    private String nationality;
    private String admissionId ;

    private String result;
    private Exam exam;

    public Student(String name, String maritalStatus, int age, String sex, String dateOfBirth, String address, String primaryEmailId, String secondaryEmailId, String phoneNumber, String highestEducationQualification, String nationality, String admissionId, String result, Exam exam) {
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.age = age;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.primaryEmailId = primaryEmailId;
        this.secondaryEmailId = secondaryEmailId;
        this.phoneNumber = phoneNumber;
        this.highestEducationQualification = highestEducationQualification;
        this.nationality = nationality;
        this.admissionId = admissionId;
        this.result = result;
        this.exam = exam;
    }

    public void registerStudent(){
        Registrar registrar = Registrar.getRegistrar();
        this.admissionId = registrar.registerStudent(this);
        System.out.println("Student registered with id: " + this.admissionId);
    }
    public void registerForExam(){
        ExamRegistrar examRegistrar = ExamRegistrar.getExamRegistrar();
        exam = examRegistrar.registeringStudentForExamination(this);
        System.out.println("Student registered for exam");
    }

    public void appearForExam(){
        Evaluator evaluator = Evaluator.getEvaluator();
        result = evaluator.evaluate(exam.getPaper());
        System.out.println("Result of the following exam attended by Student: "+ this.name +" is " + this.result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrimaryEmailId() {
        return primaryEmailId;
    }

    public void setPrimaryEmailId(String primaryEmailId) {
        this.primaryEmailId = primaryEmailId;
    }

    public String getSecondaryEmailId() {
        return secondaryEmailId;
    }

    public void setSecondaryEmailId(String secondaryEmailId) {
        this.secondaryEmailId = secondaryEmailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHighestEducationQualification() {
        return highestEducationQualification;
    }

    public void setHighestEducationQualification(String highestEducationQualification) {
        this.highestEducationQualification = highestEducationQualification;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }
}
