/*
3. Write a simple program that displays two JTextFields labeled as Miles and
Kilometers and correctly sets the value of any one field when the other field’s value is
changed by the user. Your program should use two JLabel component to label the two text
fields.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class DistanceConverter {

	  private JTextField milesField;
	  private JTextField kilometersField;

	  public DistanceConverter() {
	    JFrame frame = new JFrame("Distance Converter");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    // Add the labels
	    JLabel milesLabel = new JLabel("Miles");
	    JLabel kilometersLabel = new JLabel("Kilometers");

	    // Add the text fields
	    milesField = new JTextField(10);
	    kilometersField = new JTextField(10);

	    // Add the text fields to a panel
	    JPanel panel = new JPanel(new GridLayout(2, 2));
	    panel.add(milesLabel);
	    panel.add(milesField);
	    panel.add(kilometersLabel);
	    panel.add(kilometersField);

	    // Add the panel to the frame
	    frame.add(panel);

	    // Add an action listener to the miles field
	    milesField.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        // Get the value of the miles field
	        String milesString = milesField.getText();

	        // Convert the miles to kilometers
	        double miles = Double.parseDouble(milesString);
	        double kilometers = miles * 1.609344;

	        // Set the value of the kilometers field
	        kilometersField.setText(String.valueOf(kilometers));
	      }
	    });

	    // Add an action listener to the kilometers field
	    kilometersField.addActionListener(new ActionListener() {
	      public void actionPerformed(ActionEvent e) {
	        // Get the value of the kilometers field
	        String kilometersString = kilometersField.getText();

	        // Convert the kilometers to miles
	        double kilometers = Double.parseDouble(kilometersString);
	        double miles = kilometers / 1.609344;

	        // Set the value of the miles field
	        milesField.setText(String.valueOf(miles));
	      }
	    });

	    // Pack the frame
	    frame.pack();

	    // Set the frame's location
	    frame.setLocationRelativeTo(null);

	    // Make the frame visible
	    frame.setVisible(true);
	  }

	  public static void main(String[] args) {
	    new DistanceConverter();
	  }
	}