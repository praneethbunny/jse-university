package university.examination;

public class Exam {
    private Paper paper;
    public Exam(Paper paper){
        this.paper = paper;
    }
    public Paper getPaper(){
        return this.paper;
    }
}
