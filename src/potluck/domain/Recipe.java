package potluck.domain;

import util.Input;

public abstract class Recipe {
	
	private int recipeID;
	private String name;
	private String directions;
	private String attribution;
	
	public Recipe(){
		recipeID = 01;
		name = "";
		directions = "";
		attribution = "";
	}
	
	public void inputAllFields() {
		name = Input.instance.getString("Name: ");
		directions = Input.instance.getString("Directions: ");
		attribution = Input.instance.getString("Attribution: ");
	}
	
	// MUTATOR METHODS
	public void setRecipeID(int recipeID) { this.recipeID = recipeID; }
	public void setName(String name) { this.name = name; }
	public void setDirections(String directions) { this.directions = directions; }
	public void setAttribution(String attribution) { this.attribution = attribution; }

	// ACCESSOR METHODS
	public int getRecipeID() { return recipeID; }
	public String getName() { return name; }
	public String getDirections() { return directions; }
	public String getAttribution() { return attribution; }

	@Override
	public String toString() {
		return String.format("Name: %s\nDirections: %s\nAttribution: %s", name, directions, attribution);
	}
}