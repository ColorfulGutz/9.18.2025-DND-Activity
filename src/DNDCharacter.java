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
    private int charisma;
    private int wisdom;
    private int constitution;

    public DNDCharacter() {
        name = "Unknown";
        race = "Human";
        characterClass = "Fighter";
        level = 1;
        hitpoints = 100;
        strength = 14;
        dexterity = 12;
        intelligence = 10;
        charisma = 13;
        wisdom = 11;
        constitution = 13;
    }

    public DNDCharacter(String name, String race, String characterClass, int level,
                        int hitpoints, int strength, int dexterity, int intelligence, int charisma, int wisdom, int constitution){
        this.name=name;
        this.race=race;
        this.characterClass=characterClass;
        this.level=level;
        this.hitpoints=hitpoints;
        this.strength=strength;
        this.dexterity=dexterity;
        this.intelligence=intelligence;
        this.charisma=charisma;
        this.wisdom=wisdom;
        this.constitution=constitution;
    }

    public int getHitpoints(){
        return hitpoints;
    }

    public void displayCharacterInfo(){
        System.out.println("Name: " + name);
        System.out.println("Race: " + race);
        System.out.println("Characters class: " + characterClass);
        System.out.println("Level: " + level);
        System.out.println("Hitpoints: " + hitpoints);
        System.out.println("Strength: " + strength);
        System.out.println("Dexterity: " + dexterity);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Charisma: " + charisma);
        System.out.println("Wisdowm: " + wisdom);
        System.out.println("Constitution: " + constitution);
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
