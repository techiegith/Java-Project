import java.util.Scanner;

public class QuestionService {

    // one question class -which will hold the all value and then create the array
    // of the question// int id[];// String question[];// String opt1[];
    Question[] questions = new Question[5];
    String selection[] = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "Size of int", "2", "6", "4", "8", "4");

        questions[1] = new Question(2, "Size of double", "2", "6", "4", "8", "8");

        questions[2] = new Question(3, "Size of char", "2", "6", "4", "8", "2");

        questions[3] = new Question(4, "Size of long", "2", "6", "4", "8", "8");

        questions[4] = new Question(5, "Size of boolean", "1", "2", "4", "8", "1");
    }

    public void playQuiz() {
        int i = 0;
        for (Question q : questions) {
            // System.out.println(questions[0].getQuestion());
            System.out.println("Question no : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            // user input - scaaner is help to get the value for user
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }

        for (String s : selection) {
            System.out.println(s);
        }
    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            // when we compare the twi string then we eqauls
            if (actualAnswer.equals(userAnswer)) {
                score++;
            }
        }
        System.out.println("Your score  is :" + score);
    }
}
// #Complete my first project on java.