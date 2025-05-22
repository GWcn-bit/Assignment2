/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
public class Score extends Question {
    public Score() {
        super(""); 
    }
    
    /**
     * The accumulated total points from all answered questions.
     */
    private int totalPoints = 0; // Each user's score
    private static int totalAllScores = 0; // All users' total score

    public void addPoints(int points) {
        totalPoints += points;
        totalAllScores += points;
    }

    public int getPoints() {
        return totalPoints;
    }

    public String getRiskLevel() {
        if (totalPoints < 20) return "Low";
        else if (totalPoints < 35) return "Medium";
        else return "High";
    }

    /**
     * Static method to return  score total.
     * Called in MainQuiz.java
     */
    public static int getTotalAllScores() {
        return totalAllScores;
    }
} 
