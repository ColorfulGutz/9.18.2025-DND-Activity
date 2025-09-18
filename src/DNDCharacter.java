import java.sql.SQLOutput;

public class DNDCharacter {
    public String getHitpoints;
    private String name;
    private String race;
    private String characterClass;
    private int level;
    private int hitpoints;
    private int strength;
    private int dexterity;
    private int intelligence;

    public DNDCharacter() {
        this.name = "Unknown";
        this.race = "Human";
        this.characterClass = "Fighter";
        this.level = 1;
        this.hitpoints = 100;
        this.strength = 10;
        this.dexterity = 5;
        this.intelligence = 3;
    }

    public DNDCharacter(String name, String race, String characterClass, int level,
                        int hitpoints, int strength, int dexterity, int intelligence){
        this.name=name;
        this.race=race;
        this.characterClass=characterClass;
        this.level=level;
        this.hitpoints=hitpoints;
        this.strength=strength;
        this.dexterity=dexterity;
        this.intelligence=intelligence;
    }

    public int getHitpoints(){
        return hitpoints;
    }

    public void displayCharacterInfo(){
        System.out.println("Name: " + this.name);
        System.out.println("Race: " + this.race);
        System.out.println("Characters class: " + this.characterClass);
        System.out.println("Level: " + this.level);
        System.out.println("Hitpoints: " + this.hitpoints);
        System.out.println("Strength: " + this.strength);
        System.out.println("Dexterity: " + this.dexterity);
        System.out.println("Intelligence: " + this.intelligence);
        System.out.println();
    }

    public void takeDamage(int damage){
        hitpoints -= damage;
        if (hitpoints < 0){
            hitpoints = 0;
        }
    }

    public void heal(int healing){
        hitpoints += healing;
        if (hitpoints > 100){
            hitpoints = 100;
        }
    }

    public boolean isAlive(){
        return hitpoints != 0;
    }
}
