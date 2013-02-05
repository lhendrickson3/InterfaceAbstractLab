
package lab3;

public class Character {
    private String ability1;
    private String ability2;
    private String ability3;
    private int autoAttack;
    private int health;
    private String name;
    private String race;
    
    public void takeDamage(int damage){
    setHealth(getHealth() - damage);
    }

    public String getAbility1() {
        return ability1;
    }

    public void setAbility1(String ability1) {
        this.ability1 = ability1;
    }

    public String getAbility2() {
        return ability2;
    }

    public void setAbility2(String ability2) {
        this.ability2 = ability2;
    }

    public String getAbility3() {
        return ability3;
    }

    public void setAbility3(String ability3) {
        this.ability3 = ability3;
    }

    public int getAutoAttack() {
        return autoAttack;
    }

    public void setAutoAttack(int autoAttack) {
        this.autoAttack = autoAttack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
    
}
