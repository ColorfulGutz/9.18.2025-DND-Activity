public class Main {
    public static void main(String[] args) {
        DNDCharacter Mark = new DNDCharacter();
        DNDCharacter Mike = new DNDCharacter("Mark", "Draconian", "Bard", 1, 75, 7,
                7, 7);
        Mark.displayCharacterInfo();
        Mike.displayCharacterInfo();
        Mark.takeDamage(15);
        System.out.println("Mark takes a damage of 15, his new hitpoints are " + Mark.getHitpoints() + " and whether or not they are alive is " + Mark.isAlive());
        Mike.heal(10);
        System.out.println("Mike self heals for 10 hitpoints resulting in a health of " + Mike.getHitpoints() + " and whether or not they are alive is " + Mike.isAlive());
    }
}