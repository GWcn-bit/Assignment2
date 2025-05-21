/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author 16478
 */
public class QuizManager extends Question {
    Question[] questions = new Question[20];
    Score score = new Score("Your Score");
    Tips tips;

    public QuizManager(String t) {
        super(t);
    }

    public void loadQuestions(String fileName) {
        try {
            try (Scanner sc = new Scanner(new File(fileName))) {
                int i = 0;
                while (sc.hasNextLine() && i < 20) {
                    questions[i] = new RankingQues(sc.nextLine());
                    i++;
                }
            }
        } catch (FileNotFoundException e) {
        }
    }

    public void runQuiz() {
        try (Scanner input = new Scanner(System.in)) {
            for (Question question : questions) {
                if (question == null) {
                    continue;
                }
                question.ask();
                System.out.print("Your score (0–5): ");
                int ans = input.nextInt();
                ((RankingQues) question).setRank(ans);
                score.addPoints(ans);
            }
        }

        int total = score.getPoints();
        String level = score.getRiskLevel();
        System.out.println("Total: " + total);
        System.out.println("Level: " + level);
        
        if(level.equals("Low")){
            tips = new LowTips();
        } else if (level.equals("Medium")){
            tips = new MediumTips();
        } else{
            tips = new HighTips();
        }
    }
}
