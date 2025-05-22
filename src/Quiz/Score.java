/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
class Score extends Question {
    
    /**
     * The accumulated total points from all answered questions.
     */
    private int points;

    /**
     * Create a Score object with a title and start points at zero.
     *
     * @param t the title or label for this score tracker
     */
    public Score(String t) {
        // Call parent constructor to store the title text
        super(t);
         // Initialize points to zero
        points = 0;
    }

    /**
     * Add more points to the total.
     *
     * @param p the number of points to add
     */
    public void addPoints(int p) {
        // Increase points by the given value
        points += p;
    }
    
    /**
     * Get the current total of points.
     *
     * @return the total points so far
     */
    public int getPoints() {
        // Return the stored points
        return points;
    }
    
    /**
     * Determine the risk level based on the total points.
     *
     * @return "Low", "Medium", or "High" risk level
     */
    public String getRiskLevel(){
        if(points<=40){
            return"Low";
        }else if(points <= 69){
            return "Medium";            
        }else{
            return "High";
        }        
    }    
}
