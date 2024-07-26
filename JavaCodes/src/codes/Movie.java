/*
 * Write a Java program to create a class called "Movie" with attributes for title, director, actors, and reviews, and methods for adding and retrieving reviews.
 */
package codes;

import java.util.*;

class mov {
	private String title;
	private String director;
	private ArrayList<String> actors;
	private ArrayList<Review> review;

	public mov(String title, String director, ArrayList<String> actor) {
		this.title = title;
		this.director = director;
		this.actors = actor;
		this.review = new ArrayList<Review>();

	}

	public void addReview(Review review) {
		this.review.add(review);
	}

	public ArrayList<Review> getReview() {
		return this.review;
	}

	public void addActors(String actor) {
		this.actors.add(actor);
	}

	public ArrayList<String> getActor() {
		return this.actors;
	}

	public String getTitle() {
		return this.title;
	}

	public String getDirector() {
		return this.director;
	}
}

class Review {
	String reviewTxt;
	String reviewerName;
	double ratings;

	public Review(String reviewTxt, String reviewerName, double ratings) {
		this.ratings = ratings;
		this.reviewerName = reviewerName;
		this.reviewTxt = reviewTxt;
	}

	public String getReviewTxt() {
		return this.reviewTxt;
	}

	public String getReviewerName() {
		return this.reviewerName;
	}

	public double getRatings() {
		return this.ratings;
	}

}

public class Movie {
	public static void main(String[] args) {

		mov movie1 = new mov("Leo", "Loki", new ArrayList(Arrays.asList("Vijay", "Arjun","Trisha")));
	    mov movie2= new mov("Veeram","Siva",new ArrayList(Arrays.asList("Ajithkumar","Tamana")));
	   
		Review review1=new Review("Good Entertainment - "," By Martin - ",8.5);
		Review review2=new Review("Time Killing - "," By Alen - ",10);
		Review review3=new Review("Not Bad - "," By Suriyesh - ",5.6);
		
System.out.println("Review for Movie - "+movie1.getTitle());	
		
	movie1.addReview(review1);	
	movie1.addReview(review2);	
	movie1.addReview(review3);	
		for (Review review: movie1.getReview()) {
			System.out.println(review.reviewTxt+review.reviewerName+review.ratings);
			
		}
	
		
		System.out.println("\nReviews for Movie - "+movie2.getTitle());
		Review rev1=new Review("Mind Blowing"," By Martin - ",10);
		Review rev2=new Review("Fantastic Movie"," By Alen suriyesh - ",9.5);
		movie2.addReview(rev1);
		movie2.addReview(rev2);
		for (Review rev:movie2.getReview()) {
			System.out.println(rev.reviewTxt+rev.reviewerName+rev.ratings);
		}
		
		
		
		
		
		
		
	}

}
