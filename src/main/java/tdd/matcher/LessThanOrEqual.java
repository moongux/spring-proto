package tdd.matcher;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

import java.util.Comparator;

/**
 * Created by mgkim on 2016. 3. 22..
 */
public class LessThanOrEqual <T extends Comparable<T>> extends BaseMatcher<Comparable<T>> {
	private final Comparable<T> expectedValue;

	public LessThanOrEqual(T expectedValue) {
		this.expectedValue = expectedValue;
	}

	@Factory
	public static<T extends Comparable<T>> Matcher<T> lessThanOrEqual(T t) {
		return new LessThanOrEqual(t);
	}

	@Override
	public boolean matches(Object item) {
		int compareTo = expectedValue.compareTo((T)item);
		return compareTo > -1;
	}

	@Override
	public void describeTo(Description description) {
		description.appendText(" less than or equal(<=)" + expectedValue);
	}
}
