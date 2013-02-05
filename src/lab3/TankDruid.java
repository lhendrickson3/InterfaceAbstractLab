/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class TankDruid extends Druid implements Tank{
    public TankDruid(){
        setAbility1("Charge");
        setAbility2("Swipe");
        setAbility3("Demoralizing Roar");
    }
    public void taunt(){
        System.out.println("I can taunt a target to get their attention!");
    }
    public void areaOfEffect(){
        System.out.println("Demoralizing roar is an area of effect debuff to all mobs around me!");
    }
    
}
