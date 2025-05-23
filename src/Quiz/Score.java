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

    
 /**
 * Adds the given number of points to the current total,
 * and also updates the cumulative total of all scores.
 *
 * @param points the number of points to add
 */
    public void addPoints(int points) {
        // Increment this instance’s total points
        totalPoints += points;
        // Increment the overall cumulative score
        totalAllScores += points;
    }
    
    /**
    * Returns the current total points for this instance.
    *
    * @return the accumulated total points
    */
    public int getPoints() {
        return totalPoints;
    }

    /**
    * Determines the risk level based on the current total points.
    *
    * Risk level thresholds:
    *   - totalPoints < 20 : "Low"
    *   - 20 <= totalPoints < 35 : "Medium"
    *   - totalPoints >= 35 : "High"
    *
    * @return a String representing the risk level ("Low", "Medium", or "High")
    */
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
