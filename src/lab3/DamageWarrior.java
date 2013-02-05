/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class DamageWarrior extends Warrior implements Damage{
    public void DamageWarrior(){
        setAbility1("Whirl Wind");
        setAbility2("Cleave");
        setAbility3("Charge");
    }
    public void rangedAttack(){
        System.out.println("I have a thrown ability but its only to get your attention!");
    }
    public void meleeAttack(){
        System.out.println("This is where I do most of my damage, in melee range!");
    }
}
