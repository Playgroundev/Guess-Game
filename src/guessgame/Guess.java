/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Wixx
 */
public class Guess {
    static GuessHandler guessHandler= new GuessHandler();
    static GuessGame guess = new GuessGame();
    static class GuessHandler implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
         int userGuess;     
        
        userGuess = Integer.parseInt(guess.getTextField().getText());
        if(userGuess==getRandomNumber(0,10)){
            JOptionPane.showMessageDialog(null, "Answer is Correct");
            guess.getGuess().setBackground(Color.BLUE);
        }else{
            guess.getGuess().setBackground(Color.RED);
            JOptionPane.showMessageDialog(null, "Answer is Wrong");
        }
        }
        
    }
    public static void main(String [] args){
       
        guess.setSize(550,150);
        guess.setLocationRelativeTo(null);
        guess.setVisible(true);
        guess.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guess.getGuess().addActionListener(guessHandler);    
    }    
    public static int getRandomNumber(int min,int max){
        if(min>=max){
            System.out.println("Operation Not Supported");
        }
        Random random = new Random();
        return random.nextInt((max-min)+1) +min;
    }
}