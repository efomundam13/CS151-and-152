/*
4. Write a Swing program that displays the calculator layout shown below. The only
functionality that this app should have is to display the phrase "X button was pressed" in
the upper box of the display, where X is the button title. An example of this is shown on
the right after the 8 button is been pressed. Note that you will need to make use of both
BorderLayout and GridLayout for this app.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {

	  private JButton[] buttons = new JButton[10];
	  private JLabel display = new JLabel("");

	  public Calculator() {
	    super("Calculator");
	    setLayout(new BorderLayout());

	    // Add the buttons to a panel
	    JPanel buttonPanel = new JPanel(new GridLayout(4, 3));
	    for (int i = 0; i < buttons.length; i++) {
	      buttons[i] = new JButton(String.valueOf(i));
	      buttons[i].addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	          display.setText(display.getText() + e.getActionCommand());
	        }
	      });
	      buttonPanel.add(buttons[i]);
	    }

	    // Add the display to the frame
	    add(buttonPanel, BorderLayout.CENTER);
	    add(display, BorderLayout.NORTH);

	    pack();
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  }

	  public static void main(String[] args) {
	    new Calculator().setVisible(true);
	  }
	}