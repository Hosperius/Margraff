import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Scanner;
import java.awt.event.ActionListener;

public class Gui extends JFrame implements ActionListener{

    private JLabel nazwa;
    private JButton przyciskA, przyciskB, przyciskC;
    private JTextField pole;
    private JProgressBar pasekPostempu;

    Scanner scanner = new Scanner(System.in);

    public Gui() {

        setLayout(new GridLayout(3,3,10,10));

        nazwa = new JLabel("Margraff !\n");
        add(nazwa);

        pole = new JTextField(10);
        pole.addActionListener(this);
        add(pole);

        przyciskA = new JButton("A!");
        przyciskB = new JButton("B!");
        przyciskC = new JButton("C!");
        add(przyciskA);
        add(przyciskB);
        add(przyciskC);
        przyciskA.setOpaque(true);
        przyciskB.setOpaque(true);
        przyciskC.setOpaque(true);
        przyciskA.addActionListener(this);
        przyciskB.addActionListener(this);
        przyciskC.addActionListener(this);

//        pasekPostempu = new JProgressBar();
//        pasekPostempu.setBorderPainted(true);
//        add(pasekPostempu);

    }

    void wyswietl(String arg) {

        nazwa.setText(arg);
        repaint();

    }
    String pobierz(){
       return pole.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(przyciskA.getBackground() == Color.BLUE||przyciskB.getBackground() == Color.BLUE||przyciskC.getBackground() == Color.BLUE) {
            przyciskA.setBackground(Color.GREEN);
            przyciskB.setBackground(Color.GREEN);
            przyciskC.setBackground(Color.GREEN);
        }else if(przyciskA.getBackground() == Color.GREEN||przyciskB.getBackground() == Color.GREEN||przyciskC.getBackground() == Color.GREEN) {
            przyciskA.setBackground(Color.RED);
            przyciskB.setBackground(Color.RED);
            przyciskC.setBackground(Color.RED);
        }else {
            przyciskA.setBackground(Color.BLUE);
            przyciskB.setBackground(Color.BLUE);
            przyciskC.setBackground(Color.BLUE);
        }

            Object src = e.getSource();
            if(src == przyciskA||src == przyciskB||src == przyciskC)
                nazwa.setText(pole.getText());
            pole.setText("");

        repaint();
    }
}