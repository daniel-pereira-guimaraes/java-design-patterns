package memento_undo_redo;

import javax.swing.JTextArea;

public class TextAreaWithMemory extends JTextArea {
	private static final long serialVersionUID = 1L;

	public TextAreaWithMemory(int rows, int cols) {
		super(rows, cols);
	}
	
	public TextAreaMemento save() {
		return new TextAreaMemento(getText());
	}
	
	public void restore(TextAreaMemento memento) {
		setText(memento.getState());
	}
	
	public static class TextAreaMemento implements Memento {
		
		private String text;
		
		public TextAreaMemento(String text) {
			this.text = text;
		}
		
		private String getState() {
			return text;
		}
	}
	
}
