package potluck.domain;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class AdminMenu extends JFrame{

	UserLogin userLogin;
	RecipeController RecipeController;
	Font buttons = new Font("SansSerif", Font.BOLD, 15);
	private JPanel titlePanel  = new JPanel();
	private JPanel buttonPanel = new JPanel();
	private JLabel title = new JLabel("Please select an option below.");

	public AdminMenu(){
		super("Admin Recipe Menu");
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		RecipeController = new RecipeController();

		// ADD RECIPE
		JButton addRecipeButton = new JButton("Add Recipe");
		addRecipeButton.setFont(buttons);
		addRecipeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RecipeController.addRecipe();
			}
		});

		// REMOVE RECIPE
		JButton removeRecipeButton = new JButton("Remove Recipe");
		removeRecipeButton.setFont(buttons);
		removeRecipeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RecipeController.removeRecipe();
			}
		});

		// VIEW RECIPES
		JButton viewRecipeButton = new JButton("View Recipes");
		viewRecipeButton.setFont(buttons);
		viewRecipeButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RecipeController.viewRecipe();
			}
		});

		// SEARCH CATEGORY
		JButton searchCategoryButton = new JButton("Search Category");
		searchCategoryButton.setFont(buttons);
		searchCategoryButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RecipeController.searchCategory();
			}
		});

		// SEARCH TAG
		JButton searchTagButton = new JButton("Search Tag");
		searchTagButton.setFont(buttons);
		searchTagButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//TODO search tag
			}
		});

		// LOGOUT
		JButton logoutButton = new JButton("Logout");
		logoutButton.setFont(buttons);
		logoutButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});

		// EXIT
		JButton exitProgramButton = new JButton("Exit");
		exitProgramButton.setFont(buttons);
		exitProgramButton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				RecipeController.exit();
			}
		});

		buttonPanel.setLayout(new GridLayout(4, 2));
		buttonPanel.add(addRecipeButton);
		buttonPanel.add(removeRecipeButton);
		buttonPanel.add(viewRecipeButton);
		buttonPanel.add(searchCategoryButton);
		buttonPanel.add(searchTagButton);
		buttonPanel.add(logoutButton);
		buttonPanel.add(exitProgramButton);

		titlePanel.add(title);
		title.setFont(new Font("SansSerif", Font.PLAIN, 20));

		this.getContentPane().add(titlePanel, BorderLayout.NORTH);
		this.getContentPane().add(buttonPanel, BorderLayout.CENTER);
		this.setResizable(true);
		this.pack();
	}
}