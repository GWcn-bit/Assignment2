/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
class Tips extends Question {
    public Tips(String t) {
        super(t);
    }
    public void showTips() {
        System.out.println("Try to use screens in a balanced way.");       
    } 
}
class LowTips extends Tips {
    public LowTips() {
        super("Low Tip"); 
    }           
    public String getTipMessage() {
        return "You're doing great! Keep healthy habits!";
    }
}

class MediumTips extends Tips {
    public MediumTips() {
        super("Medium Tip");
    }

    public String getTipMessage() {
        return "Try taking 10-minute breaks every hour.";
    }
}

class HighTips extends Tips {
    public HighTips() {
        super("High Tip");
    }
    public String getTipMessage() {
        return "Please talk to someone or reduce screen time!";
    }
}



