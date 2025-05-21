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
    private String questionText;

    public Question(String text) {
        questionText = text;
    }

    public String getText() {
        return questionText;
    }

    public void ask() {
        System.out.println(questionText);
    }
}
