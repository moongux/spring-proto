package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

import javax.sql.DataSource;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Application {
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			@Override public String getMessage() {
				return "Hello World!";
			}
		};
	}

//	@Bean
//	public DataSource dataSource() {
//		// no need shutdown, EmbeddedDatabaseFactoryBean will take care of this
//		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
//		EmbeddedDatabase db = builder
//				.setType(EmbeddedDatabaseType.HSQL) //.H2 or .DERBY
//				.addScript("db/sql/create-db.sql")
//				.addScript("db/sql/insert-data.sql")
//				.build();
//		return db;
//	}

//	@Autowired
//	DataSource dataSource;
//
//	@Bean
//	public JdbcTemplate getJdbcTemplate() {
//		return new JdbcTemplate(dataSource);
//	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		System.out.println("Start");
		MessagePrinter printer = context.getBean(MessagePrinter.class);
		printer.printMessage();
		context.registerShutdownHook();
		System.out.println("End");
;	}
}
