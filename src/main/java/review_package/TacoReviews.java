package review_package;

public class TacoReviews {
	
	private long id; //should be long
	private String name;
	private int hunger;
	private int taste;
	private String image;
	private String tacoReview;

	public String getName() { //name of the taco place
		return name;
	}

	public int getHunger() { //food amount you receive
		return hunger;
	}

	public int getTaste() { //taste level of food
		return taste;
	}
	
	public String getImage() { //get taco level
		return image;
	}
	
	public String getReview() { //get taco review
		return tacoReview;
	}

	public long getID() { //id
		return id;
	}
	
	public TacoReviews(String name, String image, int hunger, int taste, long id, String tacoReview) {
		this.name = name;
		this.hunger = hunger;
		this.image = image;
		this.id = id;
		this.tacoReview = tacoReview;
	}
	@Override
	public String toString() {
		return ("[" + name + "] " + image + hunger + taste + id + tacoReview);
}
}