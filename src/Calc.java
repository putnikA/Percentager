import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc implements ActionListener {
	private static JFrame frame;
	private static JPanel panel;
	private static JTextField txtNum;
	private static JTextField txtPercent;
	private static JTextField txtSum;
	private static JLabel lblNum;
	private static JLabel lblPercent;
	private static JLabel lblSum;
	private static JButton button;
	
	public static void main(String[] args) {
		Calc gui = new Calc();
		gui.go();
	}
	
	public void go() {
		frame = new JFrame("Calculator");
		frame.setSize(350, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		
		lblNum = new JLabel("Enter number:");
		lblNum.setBounds(30, 10, 90, 30);
		panel.add(lblNum);
		
		txtNum = new JTextField();
		txtNum.setBounds(160, 10, 90, 30);
		panel.add(txtNum);
		
		lblPercent = new JLabel("Enter percentage:");
		lblPercent.setBounds(30, 70, 110, 30);
		panel.add(lblPercent);
		
		txtPercent = new JTextField();
		txtPercent.setBounds(160, 70, 90, 30);
		panel.add(txtPercent);
		
		lblSum = new JLabel("Percantage is:");
		lblSum.setBounds(30, 130, 90, 30);
		panel.add(lblSum);
		
		txtSum = new JTextField();
		txtSum.setBounds(160, 130, 90, 30);
		panel.add(txtSum);
		
		button = new JButton("Calculate");
		button.setBounds(110, 190, 100, 30);
		panel.add(button);
		button.addActionListener(this);
		
		frame.add(panel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		double num, percent, sum;
		
		try {
			num = Double.parseDouble(txtNum.getText());
			percent = Double.parseDouble(txtPercent.getText());
			
			sum = (num*percent)/100;
			txtSum.setText(Double.toString(sum));
			} catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Please enter a valid number");
		}
		
	}

}
