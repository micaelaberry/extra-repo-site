package review_package;

public class TacoReview {
	
	private long id; //should be long
	private String title;
	private String taste;
	private String image;
	public String description;

	public long getId() { //id
		return id;
	}
	
	public String getTitle() { //name of the taco place
		return title;
	}
	
	public String getImage() { //get taco level
		return image;
	}


	public String getTaste() { //taste level of food
		return taste;
	}
	
	
	public String getDescription() { //get taco review
		return description;
	}
	
	
	public TacoReview(long id, String title, String image, String taste, String description) {
		this.id = id;
		this.title = title;
		this.image = image;
		this.taste = taste;
		this.description= description;

	}
	
}