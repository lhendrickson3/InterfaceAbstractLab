/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class TankWarrior extends Warrior implements Tank{
    public void tankWarrior(){
        setAbility1("Charge");
        setAbility2("Thunder Clap");
        setAbility3("Shockwave");
    }
    
    public void taunt(){
        System.out.println("I can Taunt!");
    }
    public void areaOfEffect(){
        System.out.println("My Thunderclap is my area of effect damage!");
    }
    
}
