package university;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateStudentData {
    public static List<Student> getStudentsList(){
        Student student = new Student("John", "Single", 40, "Male", "19/05/2006", "Hyderabad", "john.elka@out.com", "john143@email.com", "9876542310", "SSC", "UAE", "", "", null);
        Student student1 = new Student("Johan", "Single", 25, "Male", "19/05/2006", "Hyderabad", "john.elka@out.com", "john143@email.com", "9876542312", "SSC", "UAE", "", "", null);
        Student student2 = new Student("Jasmine", "Single", 24, "Female", "19/05/2006", "Hyderabad", "john.elka@out.com", "john143@email.com", "9876542311", "SSC", "UAE", "", "", null);
        Student student3 = new Student("Alice", "Single", 26, "Female", "15/03/2001", "Bangalore", "alice@example.com", "alice123@email.com", "9876542301", "SSC", "India", "", "", null);
        Student student4 = new Student("Bob", "Single", 27, "Male", "22/04/2000", "Chennai", "bob@example.com", "bob123@email.com", "9876542302", "SSC", "India", "", "", null);
        Student student5 = new Student("Charlie", "Single", 29, "Male", "10/06/2001", "Mumbai", "charlie@example.com", "charlie123@email.com", "9876542303", "SSC", "India", "", "", null);
        Student student6 = new Student("Daisy", "Single", 25, "Female", "05/07/2002", "Delhi", "daisy@example.com", "daisy123@email.com", "9876542304", "SSC", "India", "", "", null);
        Student student7 = new Student("Ethan", "Single", 24, "Male", "30/08/1999", "Ahmedabad", "ethan@example.com", "ethan123@email.com", "9876542305", "SSC", "India", "", "", null);
        Student student8 = new Student("Fiona", "Single", 27, "Female", "12/09/2004", "Kolkata", "fiona@example.com", "fiona123@email.com", "9876542306", "SSC", "India", "", "", null);
        Student student9 = new Student("George", "Single", 26, "Male", "25/10/1997", "Pune", "george@example.com", "george123@email.com", "9876542307", "SSC", "India", "", "", null);
        Student student10 = new Student("Hannah", "Single", 25, "Female", "17/11/2000", "Hyderabad", "hannah@example.com","hannah123@email.com","9876542308","SSC","India","","",null);
        Student student11 = new Student("Ian","Single" , 24,"Male","29/12/1999","Bangalore","ian@example.com","ian123@email.com","9876542309","SSC","India","","",null);
        Student student12 = new Student("Julia","Single" , 28,"Female","14/01/2002","Chennai","julia@example.com","julia123@email.com","9876542310","SSC","India","","",null);
        Student student13 = new Student("Kevin","Single" , 24,"Male","22/02/1998","Mumbai","kevin@example.com","kevin123@email.com","9876542311","SSC","India","","",null);
        Student student14 = new Student("Laura","Single" , 28,"Female","03/03/2006","Delhi","laura@example.com","laura123@email.com","9876542312","SSC","India","","",null);
        Student student15 = new Student("Michael" ,"Single" , 25,"Male" ,"16/04/1998" ,"Ahmedabad" ,"michael@example.com" ,"michael123@email.com" ,"9876542313" ,"SSC" ,"India" ,"","",null);
        Student student16 = new Student("Nina" ,"Single" , 20,"Female" ,"08/05/2005" ,"Kolkata" ,"nina@example.com" ,"nina123@email.com" ,"9876542314" ,"SSC" ,"India" ,"","",null);
        Student student17 = new Student("Oscar" ,"Single" , 26,"Male" ,"01/06/1997" ,"Pune" ,"oscar@example.com" ,"oscar123@email.com" ,"9876542315" ,"SSC" ,"India" ,"","",null);
        Student student18 = new Student("Paula" ,"Single" , 25,"Female" ,"19/07/2000" ,"Hyderabad" ,"paula@example.com" ,"paula123@email.com" ,"9876542316" ,"SSC" ,"India" ,"","",null);
        Student student19 = new Student("Quentin" ,"Single" ,25,"Male" ,"27/08/1999" ,"Bangalore" ,"quentin@example.com" ,"quentin123@email.com" ,"9876542317" ,"SSC" ,"India" ,"","",null);
        Student student20 = new Student("Rachel","Single",25,"Female", "15/09/2001", "Chennai", "rachel@example.com", "rachel123@email.com", "9876542318", "SSC", "India", "", "", null); Student student21 = new Student("Sam","Single",24,"Male", "02/10/1998", "Mumbai", "sam@example.com", "sam123@email.com", "9876542319", "SSC", "India", "", "", null);
        Student student22 = new Student("Tina","Single",19,"Female", "13/11/2005", "Delhi", "tina@example.com", "tina123@email.com", "9876542320", "SSC", "India", "", "", null);
        Student student23 = new Student("Ursula","Single",25,"Female", "30/12/1997", "Ahmedabad", "ursula@example.com", "ursula123@email.com", "9876542321", "SSC", "India", "", "", null);
        Student student24 = new Student("Victor","Single",25,"Male","21/01/2004","Kolkata","victor@example.com","victor123@email.com","9876542322","SSC","India","","",null);
        Student student25 = new Student("Wendy","Single",25,"Female","05/02/2001","Pune","wendy@example.com","wendy123@email.com","9876542323","SSC","India","","",null);
        Student student26 = new Student("Xander","Single",24,"Male","17/03/1998","Hyderabad","xander@example.com","xander123@email.com","9876542324","SSC","India","","",null);
        Student student27 = new Student("Yara","Single",24,"Female","29/04/1997","Bangalore","yara@example.com","yara123@email.com","9876542325","SSC","India","","",null);
        Student student28 = new Student("Zachary", "Single", 25, "Male", "11/05/2002", "Chennai", "zachary@example.com", "zachary123@email.com", "9876542326", "SSC", "India", "", "", null);
        Student student29 = new Student("Abigail", "Single", 19, "Female", "23/06/2006", "Mumbai", "abigail@example.com", "abigail123@email.com", "9876542327", "SSC", "India", "", "", null);
        Student student30 = new Student("Benjamin", "Single", 26, "Male", "05/07/1997", "Delhi", "benjamin@example.com", "benjamin123@email.com", "9876542328", "SSC", "India", "", "", null);
        Student student31 = new Student("Catherine","Single",24,"Female","17/08/1999","Ahmedabad","catherine@example.com","catherine123@email.com","9876542329","SSC","India","","",null);
        Student student32 = new Student("Daniel","Single",25,"Male","29/09/2004","Kolkata","daniel@example.com","daniel123@email.com","9876542330","SSC","India","","",null);
        Student student33 = new Student("Ella","Single",24,"Female","10/10/2001","Pune","ella@example.com","ella123@email.com","9876542331","SSC","India","","",null);
        Student student34 = new Student("Felix","Single",25,"Male","21/11/1998","Hyderabad","felix@example.com","felix123@email.com","9876542332","SSC","India","","",null);
        Student student35 = new Student("Gina","Single",19,"Female","04/12/2005","Bangalore","gina@example.com","gina123@email.co,m" ,"9876542333" ," SSC" ," India" ," " ," " ,null);
        Student student36= new Student("Henry" ," Single" ,25," Male" ,"16/01/1998" ," Chennai" ,"henry@ example .com" ,"henry@ email .com" ," 98765 42334" ," SSC" ," India" ," " ," " ,null);
        Student student37= new Student("Isabella" ," Single" ,24," Female" ,"28/02/2005" ," Mumbai" ,"isabella@ example .com" ,"isabella@ email .com" ," 98765 42335" ," SSC" ," India" ," " ," " ,null);
        Student student38= new Student("Jack" ," Single" ,24," Male" ,"10/03/1999" ," Delhi" ,"jack@ example .com" ,"jack@ email .com" ," 98765 42336" ," SSC" ," India" ," " ," " ,null);
        Student student39= new Student("Katherine" ," Single",28," Female", "22/04/2000", " Ahmedabad", "katherine@ example .com", "katherine@ email .com", " 98765 42337", " SSC", " India", "", "", null);
        Student student40= new Student("Liam", " Single",25," Male", "05/05/2005", " Kolkata", "liam@ example .com", "liam@ email .com", " 98765 42338", " SSC", " India", "", "", null);
        Student student41 = new Student("John", "Single", 40, "Male", "19/05/2006", "Hyderabad", "john.elka@out.com", "john143@email.com", "9876542310", "SSC", "UAE", "", "", null);
        Student student42 = new Student("Johan", "Single", 25, "Male", "19/05/2006", "Hyderabad", "johan.elka@out.com", "johan143@email.com", "9876542312", "SSC", "UAE", "", "", null);
        Student student43 = new Student("Jasmine", "Single", 24, "Female", "19/05/2006", "Hyderabad", "jasmine.elka@out.com", "jasmine143@email.com", "9876542311", "SSC", "UAE", "", "", null);
        Student student44 = new Student("Michael", "Married", 30, "Male", "12/08/2005", "Bangalore", "michael.elka@out.com", "michael143@email.com", "9876542313", "SSC", "USA", "", "", null);
        Student student45 = new Student("Sophia", "Single", 27, "Female", "25/10/2007", "Mumbai", "sophia.elka@out.com", "sophia143@email.com", "9876542314", "SSC", "Canada", "", "", null);
        Student student46 = new Student("William", "Married", 35, "Male", "03/03/2004", "Delhi", "william.elka@out.com", "william143@email.com", "9876542315", "SSC", "UK", "", "", null);
        Student student47 = new Student("Emma", "Single", 28, "Female", "15/06/2005", "Chennai", "emma.elka@out.com", "emma143@email.com", "9876542316", "SSC", "Australia", "", "", null);
        Student student48 = new Student("Liam", "Single", 29, "Male", "22/09/2005", "Kolkata", "liam.elka@out.com", "liam143@email.com", "9876542317", "SSC", "Germany", "", "", null);
        Student student49 = new Student("Olivia", "Married", 26, "Female", "10/12/2006", "Pune", "olivia.elka@out.com", "olivia143@email.com", "9876542318", "SSC", "France", "", "", null);
        Student student50 = new Student("Noah", "Single", 23, "Male", "05/07/2007", "Hyderabad", "noah.elka@out.com", "noah143@email.com", "9876542319", "SSC", "Italy", "", "", null);
        Student student51 = new Student("Ava", "Married", 32, "Female", "14/04/2005", "Bangalore", "ava.elka@out.com", "ava143@email.com", "9876542320", "SSC", "Spain", "", "", null);
        List<Student> list = new ArrayList<>(Arrays.asList(student, student1, student2, student3, student4, student5, student6, student7, student8, student9, student10, student11, student12, student13, student14, student15, student16, student17, student18, student19, student20, student21, student22, student23, student24, student25, student26, student27, student28, student29, student30, student31, student32, student33, student34, student35, student36, student37, student38, student39, student40, student41, student42, student43, student44, student45, student46, student47, student48, student49, student50, student51));
        return list;
    }
}
