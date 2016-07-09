

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class FutureValuePanel extends JPanel
                                implements ActionListener
{
    private JButton calculateButton;
    private JButton exitButton;
    private JButton interestButton;

    private JButton amountButton;
    private JButton yearsButton;
    
    
    public FutureValuePanel()
            {
                this.setLayout(new FlowLayout(FlowLayout.CENTER));
                calculateButton = new JButton("Calculate");
                calculateButton.addActionListener(this);
                                                    //add an action listener
                this.add(calculateButton);
                
                exitButton = new JButton("Exit");
                exitButton.addActionListener(this);
                                                    //add an action listener
                this.add(exitButton);
                
                interestButton = new JButton("Interest Rate");
                interestButton.addActionListener(this);
                                                    //add an action listener
                this.add(interestButton);
                
                amountButton = new JButton("Loan Amount");
                amountButton.addActionListener(this);
                                                    //add an action listener
                this.add(amountButton);
                
                yearsButton = new JButton("Number of years");
                yearsButton.addActionListener(this);
                                                    //add an action listener
                this.add(yearsButton);
                
                
                
            }
    public void actionPerformed(ActionEvent e)
    {
        Object source = e.getSource();
        if(source == exitButton)
            System.exit(0);
        else if (source == calculateButton)
            calculateButton.setText("Clicked!");
    }



    
}
