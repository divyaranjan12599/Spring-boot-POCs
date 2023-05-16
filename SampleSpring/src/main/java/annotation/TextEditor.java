package annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	@Autowired
	private SpellChecker spellChecker;
	
	public TextEditor() {
		System.out.println("Inside TextEditor constructor." );
	}
	
	//@Autowired
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor Para Constructor." );
		this.spellChecker = spellChecker;
	}
	
	//@Autowired
	public void setSpellChecker( SpellChecker spellChecker ){
		this.spellChecker = spellChecker;
		System.out.println("Setter method");
	}
	public SpellChecker getSpellChecker( ) {
		return spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
