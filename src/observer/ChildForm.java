package observer;

import java.awt.Frame;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

public class ChildForm extends JDialog {
	private static final long serialVersionUID = 1L;
	
	private JButton incButton = new JButton("Increment");
	private JButton decButton = new JButton("Decrement");
	private JPanel centerPanel = new JPanel(new GridLayout(2, 1, 0, 20));
	private List<IncrementObserver> incrementObservers = new ArrayList<>();
	
	public ChildForm(Frame owner) {
		super(owner, true);
		setSize(200, 200);
		setLayout( new GridBagLayout() );
		
		Point p = owner.getLocation();
		p.translate(owner.getWidth(), 0);
		setLocation(p);
		
		centerPanel.add(incButton);
		centerPanel.add(decButton);
		add(centerPanel);
		
		incButton.addActionListener(e -> notifyIncrementObservers(1));
		decButton.addActionListener(e -> notifyIncrementObservers(-1));
	}
	
	public void addIncrementObserver(IncrementObserver observer) {
		incrementObservers.add(observer);
	}
	
	public void removeIncrementObserver(IncrementObserver observer) {
		incrementObservers.remove(observer);
	}
		
	private void notifyIncrementObservers(int incValue) {
		for (IncrementObserver observer : incrementObservers) {
			observer.increment(new IncrementEvent(this, incValue));
		}
	}
}
