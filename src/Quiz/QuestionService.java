package Quiz;

public class QuestionService {
    Question[] questions = new Question[3];

    public QuestionService(){
        questions[0] = new Question(1,"what comes after 2", "1", "2", "3", "4", "3");
        questions[1] = new Question(1,"what is 1+3", "1", "2", "3", "4", "4");
        questions[2] = new Question(1,"what is the largest among all", "1", "2", "3", "4", "4");
    }

    public void displayQuestions(){
        for(Question q : questions){
            System.out.println(q);
        }

    }
}
