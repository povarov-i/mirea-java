import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm extends JFrame{

    private JPanel panel;
    private JButton team1Button;
    private JButton team2Button;
    private JLabel team1Label;
    private JLabel team2Label;
    private JButton resultsButton;
    private JLabel scoreLabel;


    public MyForm(Team team1, Team team2) throws HeadlessException {
        setVisible(true);
        setSize(600, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        add(panel);

        scoreLabel.setText("0 X 0");

        team1Label.setText(team1.getName());
        team2Label.setText(team2.getName());

        team1Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                team1.increaseScore();
                String name = team1.getScore() + " X " + team2.getScore();
                scoreLabel.setText(name);
            }
        });
        team2Button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                team2.increaseScore();
                String name = team1.getScore() + " X " + team2.getScore();
                scoreLabel.setText(name);
            }
        });


        resultsButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (team1.getScore() > team2.getScore()) {
                    JOptionPane.showMessageDialog(MyForm.this, "Winner is: " + team1.getName());
                } else if (team1.getScore() < team2.getScore()) {
                    JOptionPane.showMessageDialog(MyForm.this, "Winner is:  " + team2.getName());
                }
                else {
                    JOptionPane.showMessageDialog(MyForm.this, "Tie!");
                }
                team1.setScore(0);
                team2.setScore(0);
                scoreLabel.setText("0 X 0");
            }
        });
    }





}
