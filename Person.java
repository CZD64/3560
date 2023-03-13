import java.util.List;

public class Person {
	private String name;
	private List<Watch> listWatch;
	
	
	public Person(String name) {
		super();
		this.name = name;
	}
	
	public void giveRating(Movie movie, int rating)
	{
		listWatch.add(new Watch(rating, this, movie));
	}
	

}
