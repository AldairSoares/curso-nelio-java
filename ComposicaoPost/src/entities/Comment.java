package entities;

public class Comment {
	
	private String text;
	
	// construtor vazio
	
	public Comment() {
		
	}

	// construtor
	public Comment(String text) {
		this.text = text;
	}
	
	
	// get() and set()
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
	
	
}
