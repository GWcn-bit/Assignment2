/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package record;

/**
 *
 * @author 16478
 */
public class UserActivity {
    private String name;
    private double sleepHours;
    private double screenHours;

public UserActivity(){
    this.name = "";
    this.sleepHours = 0;
    this.screenHours = 0;
}

public UserActivity(String name, double sleep, double screen){
    this.name = name;
    this.sleepHours = sleep;
    this.screenHours = screen;
}
public String getName() { 
    return name; 
}

public double getSleepHours() { 
    return sleepHours; 
}

public double getScreenHours() { 
    return screenHours; 
}
public void setName(String name) { 
    this.name = name; 
}
public void setSleepHours(double h) { 
    this.sleepHours = h; 
}
public void setScreenHours(double h) { 
    this.screenHours = h; 
}

@Override
public String toString() {
        return name + " (" + sleepHours + "h sleep, " + screenHours + "h screen)";
    }

    public String toDataString() {
        return name + "," + sleepHours + "," + screenHours;
    }
}
