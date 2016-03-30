package tdd.interfaces;

/**
 * Created by mgkim on 2016. 3. 30..
 */
public class MyService {
	MyDao myDao;

	public void callService() {
		System.out.println(myDao.getName());
	}
}
