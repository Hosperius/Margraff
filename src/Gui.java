import javax.swing.*;
import java.awt.*;

public class Gui extends JFrame {

    private JLabel nazwa;
    private JButton przycisk;
    private JTextField pole;

    public void Gui() {

        setLayout(new FlowLayout());

        nazwa = new JLabel("Cześć, jestem etykietą.");
        add(nazwa);

        pole = new JTextField(5);
        add(pole);

        przycisk = new JButton("Wciśnij mnie !");
        add(przycisk);

    }

}