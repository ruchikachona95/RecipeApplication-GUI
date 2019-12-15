package potluck.domain;

import util.Input;

public class Category extends Recipe{
	
	private String category;

	public Category() {
		category = "";
	}

	// MUTATOR METHODS
	public void setCategory(String category) { this.category = category; }

	// ACCESSOR METHODS
	public String getCategory() { return category; }
	
	public void inputAllFields() {
		category = Input.instance.getString("Category: ");	
	}
	
	@Override
	public String toString() {
		return String.format("\nCategory: %s", category);
	}
}