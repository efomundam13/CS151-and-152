import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class GUI5 extends JFrame implements ActionListener{

	private JButton addButton, subButton, zeroButton;
	private JLabel valueLabel, setLabel;
	private JTextField setField;
	private Font buttonFont;
	
	public GUI5() {
		setSize(400,100);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("0");
		
		buttonFont = new Font("Poor Richard", Font.BOLD, 24);
		addButton = new JButton("Add GUI5");
		addButton.addActionListener(this);
		addButton.setFont(buttonFont);
		subButton = new JButton("Sub GUI5");
		subButton.addActionListener(this);
		subButton.setFont(buttonFont);
		zeroButton = new JButton("Make GUI5 Zero");
		zeroButton.addActionListener(this);
		zeroButton.setFont(buttonFont);
		
		valueLabel = new JLabel("Value = 0");
		Color c = new Color(0, 0, 255);
		valueLabel.setForeground(c);
		setLabel = new JLabel("Set Value");
		
		setField = new JTextField(10);
		setField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = valueLabel.getText();
				s = s.substring(0,8);
				s += setField.getText();
				valueLabel.setText(s);
				setField.setText("0");
			}
		});
		
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		bottomPanel.setBackground(Color.CYAN);
		
		topPanel.setLayout(new GridLayout(1,5));
		topPanel.add(setLabel);
		topPanel.add(setField);
		topPanel.add(addButton);
		topPanel.add(zeroButton);
		topPanel.add(subButton);
		
		bottomPanel.setLayout(new FlowLayout());
		bottomPanel.add(valueLabel);
		setLayout(new GridLayout(2,1));
		add(topPanel);
		add(bottomPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		int increment = 1;
		if ((e.getModifiers() & ActionEvent.CTRL_MASK) != 0)
			increment = 10;
		String s = valueLabel.getText();
		int val = Integer.parseInt((s.substring(8)));
		s = s.substring(0,8);
		if(e.getActionCommand().equals("Add GUI5"))
			val += increment;
		else if(e.getActionCommand().equals("Sub GUI5"))
			val -= increment;
		else
			val = 0;
		valueLabel.setText(s + val);
	/*
		JButton clickedButton = (JButton)e.getSource();
		if(clickedButton == addButton)
			val++;
		else
			val--;
	*/
		setTitle(val+"");
	}
	
	public static void main(String[] args) {
		
		GUI5 window = new GUI5();
		window.setVisible(true);

	}

}
