/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class HealerDruid extends Druid implements Healer{
    public HealerDruid(){
        setAbility1("Rejuvinate");
        setAbility2("Tree Form");
        setAbility3("Heal");
    }
    public void castingHeal(){
        System.out.println("Rejuvintate is a casting heal but it also puts a heal over time on my target!");
    }
    public void resurrection(){
        System.out.println("I can bring you back to life! Sometimes during battle!");
    }
    
}
