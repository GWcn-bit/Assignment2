/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package record;

/**
 *
 * @author 16478
 */

/**
 * UserActivity tracks a user's name, sleep hours, and screen hours.
 */
public class UserActivity {
    //The user's name
    private String name;
    //Hours of sleep the user gets.
    private double sleepHours;
    //Hours of screen time the user uses.
    private double screenHours;

/**
 * Default constructor: sets name to empty and hours to zero.
 */
public UserActivity(){
    //start with no name and zero hours
    this.name = "";
    this.sleepHours = 0;
    this.screenHours = 0;
}
 /**
  * Create a UserActivity with given values.
  *
  * @param name   the user's name
  * @param sleep  hours of sleep
  * @param screen hours of screen use
  */
public UserActivity(String name, double sleep, double screen){
    //store provided values
    this.name = name;
    this.sleepHours = sleep;
    this.screenHours = screen;
}

/**
 * Get the user's name.
 *
 * @return the name
 */
public String getName() { 
    return name; 
}
/**
 * Get how many hours the user slept.
 *
 * @return sleepHours the hours of sleep
 */
public double getSleepHours() { 
    return sleepHours; 
}
/**
 * Get how many hours the user spent on screens.
 *
 * @return screenHours the hours of screen time
 */
public double getScreenHours() { 
    return screenHours; 
}
/**
 * Set a new name for the user.
 *
 * @param name the name to set
 */
public void setName(String name) { 
    this.name = name; 
}
/**
 * Update the hours of sleep.
 *
 * @param h the new sleep hours
 */
public void setSleepHours(double h) { 
    this.sleepHours = h; 
}
/**
 * Update the hours of screen time.
 *
 * @param h the new screen hours
 */
public void setScreenHours(double h) { 
    this.screenHours = h; 
}

 /**
  * Convert to a readable string.
  *
  * @return a string like "Name (8.0h sleep, 5.0h screen)"
  */
@Override
public String toString() {
        return name + " (" + sleepHours + "h sleep, " + screenHours + "h screen)";
    }


    /**
     * Convert to a CSV data string.
     *
     * @return a CSV line like "Name,8.0,5.0"
     */
    public String toDataString() {
        return name + "," + sleepHours + "," + screenHours;
    }
}
