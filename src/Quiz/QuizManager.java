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
/**
 * QuizManager loads and runs a list of ranking questions,
 * tracks the score, and provides advice tips.
 */
public class QuizManager extends Question {
    
    /**
     * Array to hold up to 20 questions.
     */
    Question[] questions = new Question[20];
    
    /**
     * Score object to track total points.
     */
    Score score = new Score();

    /**
     * Holds the advice tips based on risk level.
     */
    Tips tips;

    /**
     * Create a QuizManager. (No question text is needed here.)
     */
    public QuizManager(String t) {
        super(t);
    }

    /**
     * Load up to 20 ranking questions from a text file.
     * Each line becomes one RankingQues object.
     *
     * @param fileName the name of the file with questions
     */
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

    /**
     * Run the quiz in the console.
     * It asks each question, reads a 0–5 answer,
     * updates score, then shows total and tips.
     */
    public void runQuiz() {
        // Use Scanner to read user input from console
        try (Scanner input = new Scanner(System.in)) {
            for (Question question : questions) {
                // Skip empty slots
                if (question == null) {
                    continue;
                }
                
                // Show the question text
                question.ask();
                System.out.print("Your score (0–5): ");
                // Read the user's number answer
                int ans = input.nextInt();
                // Store the rank in the question object
                ((RankingQues) question).setRank(ans);
                // Add the points to total score
                score.addPoints(ans);
            }
        }

        // After all questions, get total points and risk level
        int total = score.getPoints();
        String level = score.getRiskLevel();
        // Print summary to console
        System.out.println("Total: " + total);
        System.out.println("Level: " + level);
        
        // Choose tips based on level
        if(level.equals("Low")){
            tips = new LowTips();
        } else if (level.equals("Medium")){
            tips = new MediumTips();
        } else{
            tips = new HighTips();
        }
    }
}
