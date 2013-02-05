/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class DamageDruid extends Druid implements Damage{
    public DamageDruid(){
        this.setAbility1("Hurricane");
        this.setAbility2("Swipe");
        this.setAbility3("Cyclone");
    }
    public void rangedAttack(){
        System.out.println("I do ranged attacks when I am a crit-chicken!");
    }
    public void meleeAttack(){
        System.out.println("I do melee attacks when im in cat form!");
    }
    
}
