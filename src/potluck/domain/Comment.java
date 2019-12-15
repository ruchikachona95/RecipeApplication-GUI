package potluck.domain;

import java.util.Date;

import util.Input;

public class Comment extends Recipe {

	private String comment;
	private int rating;
	private Date date;
	
	public Comment() {
		comment = "";
		rating = 0;
		date = null;
	}

	@Override
	public void inputAllFields() {
		comment = Input.instance.getString("Comment: ");
		while (rating < 1 || rating > 5) {
			rating = Input.instance.getInt("Rating (1-5): "); 
		}
		date = new Date();
	}

	// MUTATOR METHODS
	public void setComment(String comment) { this.comment = comment; }
	public void setRating(int rating) { 
		if (rating < 0){ rating = 1; this.rating = rating; }
		else if (rating > 5) { rating = 5; this.rating = rating; }
		else {this.rating = rating; }
	}
	public void setDate(Date date) { this.date = date; }

	// ACCESSOR METHODS 
	public int getRating() { return rating; }
	public String getComment() { return comment; }

	@Override
	public String toString() {
		return String.format("\nComment: %s\nRating: %d\nDate: (%s)", comment, rating, date);
	}
}