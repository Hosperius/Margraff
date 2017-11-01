import java.util.Scanner;

public class Player {

    Gui gui = new Gui();

    private int maxHealth = 200;
    private int health = 200;

    private int strength = 5;
    private int agility = 5;
    private int elderKnowledge = 5;

    private String nick = "No-name";
    private boolean alive = true;

    private String playerRace;
    private String playerClas;

    Scanner scanner = new Scanner(System.in);

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strenght) {
        this.strength = strenght;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getElderKnowledge() {
        return elderKnowledge;
    }

    public void setElderKnowledge(int elderKnowledge) {
        this.elderKnowledge = elderKnowledge;
    }

    String printHealth () {
        if (health < (maxHealth/2)) {
            return "Watchout " + nick + " only " + health + " HP left!!!\n";
        } else if (health == maxHealth){
            return "You have a full health: " + health + " HP.\n";
        } else{
            return "You have " +health+ " HP.\n";
        }
    }

    void makeNick() {
        gui.wyswietl("What is yore name ?");
        nick = gui.pobierz();
        gui.wyswietl("Let it be. You're name is: " + nick);
    }

    String damageHP (int damage) {
        if((health - damage)>0) {
            health -= damage;
            return  "You took " + damage + " damage! \nYoure HP is " + health ;
        }
        else {
            health = 0;
            alive = false;
            return "You took " + damage + " damage! \nYoure HP is " + health + ". You are DEAD!" ;
        }
    }

    void ChooseRace () {

        for(int i = 0; i < 1; ) {
            System.out.println("What will be your Race ?");
            System.out.println("You can choose one of following races: " +
                    "\nHuman (Have more Strength but less Elder Knowledge)" +
                    "\nElf (More Agility and Elder Knowledge but less Strength and start HP)" +
                    "\nDwarf (Much more Strength and start HP but less Agility)");

            String choosenRace = scanner.nextLine();

            if (choosenRace.equals("Human") || choosenRace.equals("human")) {
                System.out.println("You choose Human.");
                strength += 5;
                elderKnowledge -= 2;
                playerRace = choosenRace;
                i++;
            } else if (choosenRace.equals("Elf") || choosenRace.equals("elf")) {
                System.out.println("You choose Elf.");
                elderKnowledge += 3;
                agility += 3;
                strength -= 2;
                maxHealth -= 75;
                health = maxHealth;
                playerRace = choosenRace;
                i++;
            } else if (choosenRace.equals("Dwarf") || choosenRace.equals("dwarf")) {
                System.out.println("You choose Dwarf.");
                playerRace = choosenRace;
                strength += 7;
                agility -= 3;
                maxHealth += 100;
                health = maxHealth;
                i++;
            } else {
                System.out.println("It's not a race! Spell it corectly!");
            }
        }
    }

    void ChooseClas (){

        for(int i = 0; i < 1; ) {
            System.out.println("What is your class ?");
            System.out.println("You can choose one of following races: " +
                    "\nWarior (Have more Strength and HP but less Elder Knowledge) " +
                    "\nAssasin (More Strength and Agility for a cost of HP and Elder Knowledge)" +
                    "\nMage (More Elder Knowledge and agility for a cost of Strength and HP)" +
                    "\nPirate (Pirate have more Strength and Agility but less Elder Knowledge)" +
                    "\nGuardian (Guardian obtains more Strength and Elder Knowledge whit huge boost to HP for a cost of Agility)");

            String choosenClas = scanner.nextLine();

            if (choosenClas.equals("Warior") || choosenClas.equals("warior")) {
                System.out.println("You choose Warior.");
                playerClas = choosenClas;
                strength += 2;
                elderKnowledge -= 3;
                maxHealth += 50;
                health = maxHealth;
                i++;
            } else if (choosenClas.equals("Assasin") || choosenClas.equals("assasin")) {
                System.out.println("You choose Assasin.");
                playerClas = choosenClas;
                strength += 1;
                agility += 3;
                elderKnowledge -= 2;
                maxHealth -= 75;
                health = maxHealth;
                i++;
            } else if (choosenClas.equals("Mage") || choosenClas.equals("mage")) {
                System.out.println("You choose Mage.");
                playerClas = choosenClas;
                elderKnowledge += 5;
                strength -= 3;
                agility += 1;
                maxHealth -= 50;
                health = maxHealth;
                i++;
            } else if (choosenClas.equals("Pirate") || choosenClas.equals("pirate")) {
                System.out.println("You choose Pirate.");
                playerClas = choosenClas;
                strength += 2;
                agility += 2;
                elderKnowledge -= 2;
                i++;
            } else if (choosenClas.equals("Guardian") || choosenClas.equals("guardian")) {
                System.out.println("You choose Guardian.");
                playerClas = choosenClas;
                strength += 1;
                agility -= 3;
                elderKnowledge += 2;
                maxHealth += 100;
                health = maxHealth;
                i++;
            } else {
                System.out.println("It's not a race!");
            }
        }
    }


}
