package tdd.interfaces;

/**
 * Created by mgkim on 2016. 3. 30..
 */
public class MyDao {
	public static String TITLE = "Original Title";

	public String getName() {
		called();
		return "Original Name";
	}

	private void called() {
		System.out.println("Called");
	}
}
