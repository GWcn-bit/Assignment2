/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
public class Tips {
    public void showTips() {
        System.out.println("Try to use screens in a balanced way.");       
    }   
}

class LowTips extends Tips{
    @Override
    public void showTips() {
        System.out.println("You're doing great! Keep healthy habits!");
    }
}

class MediumTips extends Tips {
    @Override
    public void showTips() {
        System.out.println("Try taking 10-minute breaks every hour.");
    }   
}

class HighTips extends Tips{
    @Override
    public void showTips() {
        System.out.println("Please talk to someone or reduce screen time ASAP!");
    }
}
