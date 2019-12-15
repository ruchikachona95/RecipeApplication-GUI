package potluck.domain;

import util.Input;

public class Ingredient extends Recipe{

	private int ingredientID;
	private String ingredient;
	private String measurement;

	public Ingredient(){
		super();
		ingredientID = 01;
		ingredient = "";
		measurement = "";
	}

	// MUTATOR METHODS
	public void setIngredientID(int ingredientID) { this.ingredientID = ingredientID; }
	public void setIngredientName(String ingredientName) { this.ingredient = ingredientName; }
	public void setMeasurement(String measurement) { this.measurement = measurement; }

	// ACCESSOR METHODS
	public int getIngredientID() { return ingredientID; }
	public String getIngredientName() { return ingredient; }
	public String getMeasurement() { return measurement; }

	public void inputAllFields(){
		super.inputAllFields();
		ingredient = Input.instance.getString("Ingredient: ");
//		measurement = Input.instance.getString("Measurement: ");
	}

	@Override
	public String toString(){ return String.format("%s\nIngredients:%s", super.toString(), ingredient); }	
}