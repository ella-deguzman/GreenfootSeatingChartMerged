import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TogglePeriodBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TogglePeriodBtn extends Actor
{
    /**
     * Act - do whatever the TogglePeriodBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int currentPeriod = 3;
    //public int getCurrentPeriod(){
    //    return this.currentPeriod;
    //}
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){ //checks if button is clicked
            if (currentPeriod == 3) { //checks if it is period 3
                currentPeriod = 2; //if it is, changes to period 2
                setImage("number2.png"); //changes image to period 2
            }
            else 
            {
                currentPeriod = 3; //changes period to period 3
                setImage("number3.png"); //changes image to period 3
            }
        } 
    }
}
