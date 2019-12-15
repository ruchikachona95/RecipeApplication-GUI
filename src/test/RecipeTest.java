package test;

import potluck.domain.Ingredient;
import potluck.domain.Category;
import potluck.domain.Tag;
import potluck.domain.Comment;


public class RecipeTest {
	public static void main (String args[]) {
		Ingredient ing = new Ingredient();
		Category cat = new Category();
		Tag tag = new Tag();
		Comment com = new Comment();

		ing.inputAllFields();
		cat.inputAllFields();
		tag.inputAllFields();
		com.inputAllFields();
		
		System.out.print("\n"+ing.toString());
		System.out.print(cat.toString());
		System.out.print(tag.toString());
		System.out.print(com.toString());
	}
}
