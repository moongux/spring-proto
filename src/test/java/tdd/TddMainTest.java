package tdd;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.mockito.internal.exceptions.ExceptionIncludingMockitoWarnings;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.*;

@Slf4j
public class TddMainTest {
	@Test
	public void verify_Strings() throws Exception {
		String name = "John Jr Dale";
		assertThat(name, startsWith("John"));
		log.info("Testing");
	}
}