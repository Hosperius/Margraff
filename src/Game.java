import javax.swing.*;

public class Game {

    public static void main(String[] args) {

        Gui gui = new Gui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(900, 700);
        gui.setVisible(true);
        gui.setTitle("Margraff Game!");

        Player player = new Player();

//        player.getNick();
//        player.makeNick();
//
//        player.ChooseRace();
//        player.ChooseClas();
//
//        player.printHealth();
//        player.damageHP(20);
//        player.printHealth();
//        player.damageHP(300);

    }

}
