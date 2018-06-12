import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField text;
	JLabel label;
	JButton button;
	public static void main(String[] args) {
		BinaryConverter bin = new BinaryConverter();
		bin.frame();
	}
	
	void frame() {
		frame = new JFrame();
		panel = new JPanel();
		text = new JTextField(20);
		label = new JLabel();
		button = new JButton();
		frame.add(panel);
		frame.setTitle("Convert 8 bits of binary to ASCII");
		label.setText("Hello");
		panel.add(text, "Hello");
		panel.add(button);
		panel.add(label);
		button.setText("convert");
		button.addActionListener(this);
		
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		label.setText(convert(text.getText()));
	}
	
}
