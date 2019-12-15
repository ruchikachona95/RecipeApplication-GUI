package potluck.domain;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class RecipeController {

	ArrayList<Recipe> recipeArray;
	ArrayList<Recipe> ingredientArray;
	ArrayList<Recipe> categoryArray;
	ArrayList<Recipe> tagArray;
	ArrayList<Recipe> commentArray;
	Ingredient ingredient;
	Category category;
	Tag tag;
	Comment comment;

	public RecipeController(){
		recipeArray = new ArrayList<>();
		ingredientArray = new ArrayList<>();
		categoryArray = new ArrayList<>();
		tagArray = new ArrayList<>();
		commentArray = new ArrayList<>();
	}

	public void addRecipe(){
		ingredient = new Ingredient();
		category = new Category();
		tag = new Tag();
		comment = new Comment();

		JFrame frame = new JFrame();

		JLabel nameLabel = new JLabel();
		JLabel directionsLabel = new JLabel();
		JLabel attributionLabel = new JLabel();
		JLabel ingredientsLabel = new JLabel();
		JLabel categoryLabel = new JLabel();
		JLabel tagLabel = new JLabel();
		JLabel commentLabel = new JLabel();
		JLabel ratingLabel = new JLabel();

		JTextField nameTextField = new JTextField();
		JTextField directionsTextField = new JTextField();
		JTextField attributionTextField = new JTextField();
		JTextField ingredientsTextField = new JTextField();
		JTextField categoryTextField = new JTextField();
		JTextField tagTextField = new JTextField();
		JTextField commentTextField = new JTextField();
		JTextField ratingTextField = new JTextField();

		JPanel mainViewPanel  = new JPanel();

		frame.setTitle("Add Recipe");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		nameLabel.setText("Name:");
		directionsLabel.setText("Directions:");
		attributionLabel.setText("Attribution:");
		ingredientsLabel.setText("Ingredients:");
		categoryLabel.setText("Category:");
		tagLabel.setText("Tag:");
		commentLabel.setText("Comment:");
		ratingLabel.setText("Rating(0-5):");

		mainViewPanel.setLayout(new GridLayout(9, 2));
		mainViewPanel.add(nameLabel);
		mainViewPanel.add(nameTextField);
		mainViewPanel.add(directionsLabel);
		mainViewPanel.add(directionsTextField);
		mainViewPanel.add(attributionLabel);
		mainViewPanel.add(attributionTextField);
		mainViewPanel.add(ingredientsLabel);
		mainViewPanel.add(ingredientsTextField);
		mainViewPanel.add(categoryLabel);
		mainViewPanel.add(categoryTextField);
		mainViewPanel.add(tagLabel);
		mainViewPanel.add(tagTextField);
		mainViewPanel.add(commentLabel);
		mainViewPanel.add(commentTextField);
		mainViewPanel.add(ratingLabel);
		mainViewPanel.add(ratingTextField);

		// Buttons for user interaction
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});

		// Buttons for user interaction
		JButton addRecipeButton = new JButton("Add Recipe");
		addRecipeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ingredient.setName(nameTextField.getText());
				ingredient.setDirections(directionsTextField.getText());
				ingredient.setAttribution(attributionTextField.getText());
				ingredient.setIngredientName(ingredientsTextField.getText());
				ingredient.setMeasurement(ingredientsTextField.getText());
				category.setCategory(categoryTextField.getText());
				tag.setTag(tagTextField.getText());
				comment.setComment(commentTextField.getText());
				try {
					comment.setRating(Integer.parseInt(ratingTextField.getText()));
				} catch (NumberFormatException nfex) {
					comment.setRating(0);
				}
				comment.setDate(new Date());

				ingredientArray.add(ingredient);
				categoryArray.add(category);
				tagArray.add(tag);
				commentArray.add(comment);

				frame.dispose();
			}
		});

		mainViewPanel.add(exitButton);
		mainViewPanel.add(addRecipeButton);

		frame.getContentPane().add(mainViewPanel, BorderLayout.CENTER);
		frame.setResizable(true);
		frame.pack();
		frame.setVisible(true);
	}

	public void removeRecipe(){	
		if (!ingredientArray.isEmpty()) {
		JFrame frame = new JFrame();

		JLabel idLabel = new JLabel();
		JTextField idTextField = new JTextField();
		JPanel mainViewPanel  = new JPanel();
		JPanel buttonPanel = new JPanel();
		
		frame.setTitle("Remove Recipe");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		idLabel.setText("Recipe ID:");

		mainViewPanel.setLayout(new GridLayout(2, 2));
		mainViewPanel.add(idLabel);
		mainViewPanel.add(idTextField);

		// Buttons for user interaction
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});

		// Buttons for user interaction
		JButton removeRecipeButton = new JButton("Remove Recipe");
		removeRecipeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (!ingredientArray.isEmpty()) {
					ingredientArray.remove(0);
					categoryArray.remove(0);
					tagArray.remove(0);
					commentArray.remove(0);
				}
			}
		});

		buttonPanel.setLayout(new GridLayout(1, 2));

		mainViewPanel.add(exitButton);
		mainViewPanel.add(removeRecipeButton);

		frame.getContentPane().add(mainViewPanel, BorderLayout.CENTER);
		frame.setResizable(true);
		frame.pack();
		frame.setVisible(true);
		}
	}

	public void viewRecipe(){ 
		if (!ingredientArray.isEmpty()) {
			String recipe = "";

			for (int i = 0; i < ingredientArray.size(); i++) {
				recipe += ingredientArray.get(i);
				recipe += categoryArray.get(i);
				recipe += tagArray.get(i);
				recipe += commentArray.get(i) + "\n\n";
			}

			JFrame frame = new JFrame();

			JTextArea recipeTextArea = new JTextArea();
			JPanel mainViewPanel  = new JPanel();
			JPanel buttonPanel = new JPanel();

			frame.setTitle("Recipe");
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			recipeTextArea.setEditable(false);
			recipeTextArea.setText(recipe);

			mainViewPanel.setLayout(new GridLayout(2, 1));
			mainViewPanel.add(recipeTextArea);

			// Buttons for user interaction
			JButton exitButton = new JButton("Exit");
			exitButton.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					frame.dispose();
				}
			});

			buttonPanel.setLayout(new GridLayout(1, 1));

			buttonPanel.add(exitButton);
			mainViewPanel.add(buttonPanel);

			frame.getContentPane().add(mainViewPanel, BorderLayout.CENTER);
			frame.setResizable(true);
			frame.pack();
			frame.setVisible(true);
		}
	}

	public void searchCategory(){ }

	public void searchTag(){ }

	public void exit() { System.exit(0); }
}