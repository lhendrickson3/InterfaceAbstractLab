/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class DamagePriest extends Priest implements Damage{
    public DamagePriest(){
        setAbility1("Fear");
        setAbility2("Drain Life");
        setAbility3("Power Ward Pain");
    }
    public void rangedAttack(){
        System.out.println("I am mostly doing ranged attacking because I am a spellcaster!");
    }
    public void meleeAttack(){
        System.out.println("I can hit you with my staff but it wont hurt much!");
    }
}
