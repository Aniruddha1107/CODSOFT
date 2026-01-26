import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
public class NumberGame extends JFrame{
    private JTextField guessField;
    private JLabel feedbacklabel;
    private JLabel scoreLabel;
    private JLabel attemptsLabel;
    private JButton guessButton;
    private JButton playAgainButton;
    private JButton endButton;

    private int randomNumber;
    private int attempts=0;
    private int maxAttempts=5;
    private int score=0;

    public NumberGame(){
        setTitle("Number Guess Challenge");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);

        JLabel promptLabel=new JLabel("I Have a number from 1 to 100. Can you guess it?");
        guessField=new JTextField(10);
        guessButton=new JButton("Guess");
        feedbacklabel=new JLabel("Enter a number and click Guess!");
        attemptsLabel=new JLabel("Attempts : 0");
        scoreLabel=new JLabel("Score : 0");
        playAgainButton=new JButton("Play Again");
        playAgainButton.setEnabled(false);
        endButton=new JButton("End Game!");

        guessButton.setBackground(Color.BLUE);
        guessButton.setForeground(Color.WHITE);
        feedbacklabel.setForeground(Color.MAGENTA);

        add(promptLabel);
        add(guessField);
        add(guessButton);
        add(feedbacklabel);
        add(attemptsLabel);
        add(playAgainButton);
        add(endButton);
        add(scoreLabel);

        startNewRound();

        guessButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                checkGuess();
            }
        });

        playAgainButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                startNewRound();
            }
        });
        
        endButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Thanks for Playing!\n Your Final Score :"+score,"Game Over!", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
    }

    private void startNewRound(){
        Random rd=new Random();
        randomNumber=rd.nextInt(101);
        attempts=0;
        guessField.setText("");
        guessField.setEditable(true);
        guessButton.setEnabled(true);
        playAgainButton.setEnabled(false);
        feedbacklabel.setText("New Round started! Guess away.");
        attemptsLabel.setText("Attempts Remaining: "+maxAttempts);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    }

    private void checkGuess(){
        try{
            String text=guessField.getText();
            int userGuess=Integer.parseInt(text);
            attempts++;
            int attemptsLeft=maxAttempts-attempts;
            if(userGuess==randomNumber){
                feedbacklabel.setText("Correct! You won!");
                getContentPane().setBackground(Color.GREEN);
                score+=(attemptsLeft+1)*10;
                scoreLabel.setText("Score: "+score);
                endRound();
            }else if(attempts>=maxAttempts){
                feedbacklabel.setText("Game Over! The number was "+ randomNumber);
                getContentPane().setBackground(Color.RED);
                endRound();
            }else if(userGuess < randomNumber){
                feedbacklabel.setText("Too Low! Try High.");
            }else{
                feedbacklabel.setText("Too High! Try Low.");
            }
            attemptsLabel.setText("Attempts Remaining: "+attemptsLeft);
        }catch(NumberFormatException e){
            feedbacklabel.setText("Please enter a valid number!");
        }
    }

    private void endRound(){
        guessField.setEditable(false);
        guessButton.setEnabled(false);
        playAgainButton.setEnabled(true);
    }
    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new NumberGame().setVisible(true);
            }
        });
    }
}