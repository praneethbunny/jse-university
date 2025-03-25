package university.examination;

public class Evaluator {
    private static Evaluator evaluator;
    private Evaluator(){}
    public static Evaluator getEvaluator(){
        if(null == evaluator){
            evaluator = new Evaluator();
        }
        return evaluator;
    }

    public String evaluate(Paper paper){
        return "pass";
    }
}
