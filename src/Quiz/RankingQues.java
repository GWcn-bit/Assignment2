/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */

/**
 * RankingQues is a question that expects a rank answer (0–5).
 * It extends the basic Question class and adds a rank field.
 */
class RankingQues extends Question {
    /**
     * The user's rank answer for this question.
     * It should be between 0 (not at all) and 5 (always).
     */
    private int rank;
    

    /**
     * Create a RankingQues with the given question text.
     *
     * @param t the text of the question
     */
    public RankingQues(String t) {
        // Call the parent constructor to set question text
        super(t);
    }

     /**
     * Set the rank value for this question.
     *
     * @param r the rank number (0–5)
     */
    public void setRank(int r) {
        // Store the user's rank answer
        rank = r;
    }

    /**
     * Get the rank value for this question.
     *
     * @return the rank number (0–5)
     */
    public int getRank() {
        // Return the stored rank
        return rank;
    }

    /**
     * Ask the question by printing it and the ranking instructions.
     * Overrides the ask() method from Question.
     */
    @Override
    public void ask() {
        System.out.println(getText());
        System.out.println("(0 = Not at all, 5 = Always)");
    }
}