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
         System.out.println("I am a damage druid and 3 of my abilities are " 
                 + myDamageDruid.getAbility1() + ", " 
                 + myDamageDruid.getAbility2() + ", " 
                 + myDamageDruid.getAbility3() +".");
         myDamageDruid.rangedAttack();
         myDamageDruid.meleeAttack();
         
         DamagePriest myDamagePriest = new DamagePriest();
         System.out.println("I am a damage priest and 3 of my abilities are " 
                 + myDamagePriest.getAbility1() + ", " 
                 + myDamagePriest.getAbility2() + ", " 
                 + myDamagePriest.getAbility3() +".");
         myDamagePriest.rangedAttack();
         myDamagePriest.meleeAttack();
         
         DamageWarrior myDamageWarrior = new DamageWarrior();
         System.out.println("I am a damage warrior and 3 of my abilities are " 
                 + myDamageWarrior.getAbility1() + ", " 
                 + myDamageWarrior.getAbility2() + ", " 
                 + myDamageWarrior.getAbility3() +".");
         myDamageWarrior.rangedAttack();
         myDamageWarrior.meleeAttack();
         
         HealerDruid myHealerDruid = new HealerDruid();
         System.out.println("I am a healer druid and 3 of my abilities are " 
                 + myHealerDruid.getAbility1() + ", " 
                 + myHealerDruid.getAbility2() + ", " 
                 + myHealerDruid.getAbility3() +".");
         myHealerDruid.castingHeal();
         myHealerDruid.resurrection();
         
         HealerPriest myHealerPriest = new HealerPriest();
         System.out.println("I am a healer priest and 3 of my abilities are " 
                 + myHealerPriest.getAbility1() + ", " 
                 + myHealerPriest.getAbility2() + ", " 
                 + myHealerPriest.getAbility3() +".");
         myHealerPriest.castingHeal();
         myHealerPriest.resurrection();
         
         TankDruid myTankDruid = new TankDruid();
         System.out.println("I am a tank druid and 3 of my abilities are " 
                 + myTankDruid.getAbility1() + ", " 
                 + myTankDruid.getAbility2() + ", " 
                 + myTankDruid.getAbility3() +".");
         myTankDruid.taunt();
         myTankDruid.areaOfEffect();
         
         TankWarrior myTankWarrior = new TankWarrior();
         System.out.println("I am a tank warrior and 3 of my abilities are " 
                 + myTankWarrior.getAbility1() + ", " 
                 + myTankWarrior.getAbility2() + ", " 
                 + myTankWarrior.getAbility3() +".");
         myTankWarrior.taunt();
         myTankWarrior.areaOfEffect();
     }
    
}
