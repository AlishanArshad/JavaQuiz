package Quiz;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService(){
        questions[0] = new Question(1,"what comes after 2", "1", "2", "3", "4", "3");
        questions[1] = new Question(2,"what is 1+3", "1", "2", "3", "4", "4");
        questions[2] = new Question(3,"what is the largest among all", "1", "2", "3", "4", "4");
        questions[3] = new Question(4,"what is 1+1", "1", "2", "3", "4", "4");
        questions[4] = new Question(5,"what is 2+1", "1", "2", "3", "4", "4");
    }

    public void playQuiz(){
        int i = 0;
        for(Question q : questions){
            System.out.println(q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Answer : ");
            selection[i] = input.nextLine();
            i++;
        }
        System.out.println("your input is : ");
        for(String s : selection){
            System.out.println(s);

        }

        }
        public void Results(){
        int score = 0;
        for(int i = 0; i < questions.length; i++){
            Question que = questions[i];
            String answer = que.getAnswer();
            String userAnswer = selection[i];
            if(userAnswer.equals(answer)){
                score++;
            }
        }
        Question[] q = questions;
        System.out.println("your score is : "+ score + " out of " + q.length );
    }
}
