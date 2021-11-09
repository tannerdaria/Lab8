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
  Random r = new Random();
  int randomNum;


  GuessingGame(){
    randomNum = r.nextInt(100) + 1;

    JFrame frame = new JFrame("Guessing Game");
    frame.setLayout(new FlowLayout());
    frame.setSize(240,120);

    userGuess = new JTextField(10);
    userGuess.setActionCommand("myTF");

    pressGuess = new JButton("Guess");
    pressPlayAgain = new JButton("Play Again");

    userGuess.addActionListener(this);
    pressGuess.addActionListener(this);
    pressPlayAgain.addActionListener(this);

    enterGuess = new JLabel("Enter Your Guess");
    tooHighLow = new JLabel(" ");
    lastGuess = new JLabel(" ");

    frame.add(enterGuess);
    frame.add(userGuess);
    frame.add(pressGuess);
    frame.add(tooHighLow);
    frame.add(lastGuess);
    frame.add(pressPlayAgain);

    frame.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    int guess = Integer.parseInt(userGuess.getText());

    if (e.getActionCommand().equals("Guess")){
      tooHighLow.setText(" ");
      if (guess < randomNum){
        tooHighLow.setText("Too Low!");
      }
      else if (guess > randomNum){
        tooHighLow.setText("Too High!");
      }
      else{
        tooHighLow.setText("You got it!");
      }
      lastGuess.setText("Last guess was " + userGuess.getText());
    }

    else if (e.getActionCommand().equals("Play Again")) {
      randomNum = r.nextInt(100) + 1;
      enterGuess.setText("Enter your guess");
      tooHighLow.setText(" ");
      lastGuess.setText(" ");
      userGuess.setText(" ");
    }

    else {
      tooHighLow.setText("You pressed Enter. Please press the Guess button.");
    }
  }
}