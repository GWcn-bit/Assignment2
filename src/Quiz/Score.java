/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quiz;

/**
 *
 * @author 16478
 */
public class Score {
    private int points = 0;
    
    public Score(int startPoints){
       points = startPoints; 
    }
    
    public void addPoints(int p){
      points += p;  
    }
    public int getPoints() {
        return points;
    }
    
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
