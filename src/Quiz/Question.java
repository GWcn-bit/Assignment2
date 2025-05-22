/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
public class Question {
    
    /**
     * The text of the question shown to the user.
     */
    private String questionText;
    
    /**
     * Create a new Question with the given text.
     *
     * @param text the content of the question
     */
    public Question(String text) {
        //// Store the provided question text
        questionText = text;
    }
    
    /**
     * Get the text of this question.
     *
     * @return the question text
     */
    public String getText() {
        // Return the stored question text
        return questionText;
    }
    
    /**
     * Ask the question by printing it to the console.
     */
    public void ask() {
        //// Print the question to system output
        System.out.println(questionText);
    }
}
