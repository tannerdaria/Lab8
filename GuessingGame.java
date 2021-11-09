import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GuessingGame implements ActionListener {
  JTextField userGuess;
  JButton pressGuess;
  JButton pressPlayAgain;
  JLabel enterGuess;
  JLabel tooHighLow;
  JLabel lastGuess;


  GuessingGame(){
    Random r = new Random();
    int randomNum = r.nextInt(100)+1;

    JFrame frame = new JFrame("Guessing Game");
    frame.setLayout(new FlowLayout());
    frame.setSize(240,120);
  }
}