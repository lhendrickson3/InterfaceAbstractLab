/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author User
 */
public class Runner {
     public static void main(String[] args) {
         
         DamageDruid myDamageDruid = new DamageDruid();
         System.out.println("3 of my abilities are " 
                 + myDamageDruid.getAbility1() + ", " 
                 + myDamageDruid.getAbility2() + ", " 
                 + myDamageDruid.getAbility3() +".");
         myDamageDruid.rangedAttack();
         myDamageDruid.meleeAttack();
     }
    
}
