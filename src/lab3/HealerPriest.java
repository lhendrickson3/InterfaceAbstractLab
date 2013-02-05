/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class HealerPriest extends Priest implements Healer{
    public HealerPriest(){
        setAbility1("Bubble");
        setAbility2("Greater Heal");
        setAbility3("Rapid Heal");
    }
    public void castingHeal(){
        System.out.println("Most of my heals are casted heals, but some of them are instant!");
    }
    public void resurrection(){
        System.out.println("I can bring you back to life but never during combat!");
    }
    
}
