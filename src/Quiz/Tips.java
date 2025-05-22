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
 * Tips is a base class for giving advice messages.
 * It holds a title and can show a default tip.
 */
public class Tips extends Question {
    /**
     * Create a Tips object with a given title.
     *
     * @param t the title or label for these tips
     */
    public Tips(String t) {
        // Call parent constructor to store title text
        super(t);
    }

    /**
     * Show a general tip to the console.
     * Subclasses may override this or provide specific messages.
     */
    public void showTips() {
        // Print a default tip message
        System.out.println("Try to use screens in a balanced way.");
    }
}

/**
 * LowTips gives a positive tip for low risk level.
 */
class LowTips extends Tips {
    /**
     * Create LowTips with a title of "Low Tip".
     */
    public LowTips() {
        super("Low Tip");
    }

    /**
     * Get the specific message for low risk level.
     *
     * @return encouragement message for low risk
     */
    public String getTipMessage() {
        // Return a friendly encouragement
        return "You're doing great! Keep healthy habits!";
    }
}

/**
 * MediumTips gives a practical tip for medium risk level.
 */
class MediumTips extends Tips {
    /**
     * Create MediumTips with a title of "Medium Tip".
     */
    public MediumTips() {
        super("Medium Tip");
    }

    /**
     * Get the specific message for medium risk level.
     *
     * @return advice to take regular breaks
     */
    public String getTipMessage() {
        // Suggest taking short breaks
        return "Try taking 10-minute breaks every hour.";
    }
}

/**
 * HighTips gives an urgent tip for high risk level.
 */
class HighTips extends Tips {
    /**
     * Create HighTips with a title of "High Tip".
     */
    public HighTips() {
        super("High Tip");
    }

    /**
     * Get the specific message for high risk level.
     *
     * @return urgent advice for high risk
     */
    public String getTipMessage() {
        // Encourage seeking help or reducing screen time
        return "Please talk to someone or reduce screen time!";
    }
}