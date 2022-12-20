package memento_undo_redo;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import memento_undo_redo.TextAreaWithMemory.TextAreaMemento;

public class Application {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton priorButton = new JButton("Prior");
		JButton nextButton = new JButton("Next");
		JButton saveButton = new JButton("Save");
		TextAreaWithMemory textArea = new TextAreaWithMemory(10, 40);
		JScrollPane scrollPane = new JScrollPane(textArea, 
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		JComboBox<String> comboBox = new JComboBox<String>();
		JPanel bottomPanel = new JPanel();
		
		comboBox.setPreferredSize(new Dimension(100, (int) saveButton.getPreferredSize().getHeight()));
		
		bottomPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0));
		bottomPanel.add(comboBox);
		bottomPanel.add(saveButton);

		frame.setTitle("Memento pattern example");
		frame.setSize(700, 300);
		frame.add(priorButton, BorderLayout.WEST);
		frame.add(scrollPane, BorderLayout.CENTER);
		frame.add(nextButton, BorderLayout.EAST);
		frame.add(bottomPanel, BorderLayout.SOUTH);

		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		Caretaker caretaker = new Caretaker();

		priorButton.addActionListener(e -> {
			if (comboBox.getSelectedIndex() > 0) {
				int nextItem = comboBox.getSelectedIndex() - 1;
				textArea.restore((TextAreaMemento) caretaker.get(nextItem));
				comboBox.setSelectedIndex(nextItem);
				textArea.requestFocusInWindow();
			}
		});

		nextButton.addActionListener(e -> {
			if (comboBox.getSelectedIndex() < comboBox.getItemCount() - 1) {
				int nextItem = comboBox.getSelectedIndex() + 1;
				textArea.restore((TextAreaMemento) caretaker.get(nextItem));
				comboBox.setSelectedIndex(nextItem);
				textArea.requestFocusInWindow();
			}
		});

		comboBox.addItemListener(e -> {
			textArea.restore((TextAreaMemento) caretaker.get(comboBox.getSelectedIndex()));
			textArea.requestFocusInWindow();
		});
		
		saveButton.addActionListener(e -> {
			caretaker.add(textArea.save());
			String item = caretaker.getHistoryList().size() + "";
			comboBox.addItem(item);
			comboBox.setSelectedItem(item);
			textArea.requestFocusInWindow();
		});
		
	}

}
