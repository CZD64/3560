import java.util.ArrayList;
import java.util.List;

public class Dog 
{
	private String breed;
	private String name;
	private List<Paw> listPaw;
	
	public Dog()
	{
		listPaw = new ArrayList<Paw>();
		listPaw.add(new Paw(1));
		listPaw.add(new Paw(2));
		listPaw.add(new Paw(3));
		listPaw.add(new Paw(4));
	}
	
}
