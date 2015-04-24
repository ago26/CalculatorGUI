
/**
 * 
 * @author aaronortiz
 *
 */
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculatorGui implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JLabel output;
	private JTextField textField1;
	private JTextField textField2;
	private JButton button;
	
	public CalculatorGui() {
		frame = new JFrame ("Calculator");
		frame.setVisible(true);
		frame.setSize(350, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		
		label = new JLabel();
		label.setText("Enter Number");
		output = new JLabel();
		output.setText("--------");
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Find product");
		button.addActionListener(this);
		
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
		
	}
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double product = num1 + num2;
		output.setText(String.valueOf(product));
	}
}

