package observer;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainForm extends JFrame implements IncrementObserver {
	private static final long serialVersionUID = 1L;

	private JPanel centerPanel = new JPanel();
	private JButton showChildFormButton = new JButton("Show list form");
	private JLabel counterLabel = new JLabel("0");
	
	public MainForm() {
		super();

		counterLabel.setBorder(BorderFactory.createLineBorder(Color.RED));
		counterLabel.setBackground(Color.YELLOW);
		counterLabel.setForeground(Color.RED);
		counterLabel.setHorizontalAlignment(JLabel.CENTER);
		
		centerPanel.add(showChildFormButton);
		centerPanel.add(counterLabel);
		centerPanel.setLayout(new GridLayout(2, 1, 0, 20));
		
		setTitle("Observer pattern :: Main form");
		setSize(400, 300);
		setLocation(30, 30);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridBagLayout() );
		add(centerPanel, new GridBagConstraints());
		
		showChildFormButton.addActionListener(e -> {
			ChildForm childForm = new ChildForm(this);
			childForm.addIncrementObserver(this);
			childForm.setVisible(true);
		});
	}

	@Override
	public void increment(IncrementEvent event) {
		int value = Integer.parseInt(counterLabel.getText());
		value += event.getIncValue();
		counterLabel.setText(value + "");
		
	}

}
