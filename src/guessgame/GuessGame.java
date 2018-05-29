/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessgame;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Wixx
 */
public class GuessGame extends JFrame {

    private JButton btnGuess;
    private JLabel lblGuess;
    private JTextField txtGuess;
    
    public GuessGame(){
        super("Guess Game");
        btnGuess = new JButton("OK");
        lblGuess = new JLabel("I have a number between 1 and 10, Guess my Number, Please Enter Your First Guess? ");
        txtGuess = new JTextField(20);
        setLayout(new FlowLayout());
        add(lblGuess);
        add(txtGuess);
        add(btnGuess);
    }
    public JButton getGuess(){
        return btnGuess;
    }
    public JLabel getLabel(){
        return lblGuess;
    }
    public JTextField getTextField(){
        return txtGuess;
    }
}
