package tdd;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import tdd.interfaces.MyDao;
import tdd.interfaces.MyService;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@Slf4j
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {
	@Mock
	MyDao myDao;

	@InjectMocks
	MyService myService;

	@Test
	public void testMyDao() {
		MyDao realDao = new MyDao();
		log.info("realDao.getName() : {}", realDao.getName());

		log.info("myDao.TITLE : {}" , myDao.TITLE);
		when(myDao.getName()).thenReturn("Mock Name");
//		log.info("myDao.getName() : {}", myDao.getName());

		myService.callService();
		verify(myDao).getName();
	}
}
