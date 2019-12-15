package potluck.domain;

import util.Input;

public class Tag extends Recipe{
	
	private String tag;

	public Tag() {
		tag = "";
	}
	
	// MUTATOR METHODS
	public void setTag(String tag) { this.tag = tag; }

	// ACCESSOR METHODS
	public String getTag() { return tag; }
	
	public void inputAllFields() {
		tag = Input.instance.getString("Tag: ");
	}
	
	@Override
	public String toString() { return String.format("\nTag: %s", tag);
	}
}