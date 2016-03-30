package tdd;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;
import static tdd.matcher.LessThanOrEqual.lessThanOrEqual;

@Slf4j
public class TddMainTest {
	@Test
	public void verify_Strings() throws Exception {
		String name = "John Jr Dale";
		assertThat(name, startsWith("John"));
		log.info("Testing");
	}

	@Test
	public void lessThanOrEquals_custom_matcher() throws Exception {
		int actualGoalScored = 2;
		assertThat(actualGoalScored, lessThanOrEqual(4));
		assertThat(actualGoalScored, lessThanOrEqual(2));

		double originalPI = 3.14;
		assertThat(originalPI, lessThanOrEqual(9.00));

		String authorName = "Sujoy";
		assertThat(authorName, lessThanOrEqual("Zachary"));
	}
}