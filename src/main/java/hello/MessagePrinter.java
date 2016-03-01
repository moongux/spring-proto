package hello;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Slf4J
public class MessagePrinter
//	implements ApplicationContextAware, BeanNameAware, InitializingBean,
//	BeanFactoryAware, DisposableBean
{  //BeanPostProcessor
//	@Autowired
	private MessageService service;

	@Autowired

	public MessagePrinter(MessageService service) {
		this.service = service;
	}

//	@Required
	public void setMessageService(MessageService service) {
		this.service = service;
	}

	public void printMessage() {
		System.out.println("MessagePrinter.printMessage");
		System.out.println(this.service.getMessage());
		log.warn();
	}

	@PostConstruct
	public void init() {
		System.out.println("# init-method #");
	}

	@PreDestroy
	public void clean() {
		System.out.println("# destroy-method #");
	}

//	// ApplicationContextAware
//	@Override public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//		System.out.println("# ApplicationContextAware.setApplicationContext : Start");
//		System.out.println(applicationContext);
//		System.out.println("# ApplicationContextAware.setApplicationContext : End");
//	}
//
//	@Override public void setBeanName(String name) {
//		System.out.println("# BeanNameAware.setBeanName : Start");
//		System.out.println(name);
//		System.out.println("# BeanNameAware.setBeanName : End");
//	}
//
//	@Override public void afterPropertiesSet() throws Exception {
//		System.out.println("# InitializingBean.afterPropertiesSet : Start");
//		System.out.println("# InitializingBean.afterPropertiesSet : End");
//	}
//
//	@Override public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
//		System.out.println("# BeanFactoryAware.setBeanFactory : Start");
//		System.out.println(beanFactory);
//		System.out.println("# BeanFactoryAware.setBeanFactory : End");
//	}

//	@Override public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("# BeanPostProcessor.postProcessBeforeInitialization : Start");
//		System.out.println(bean);
//		System.out.println(beanName);
//		System.out.println("# BeanPostProcessor.postProcessBeforeInitialization : End");
//		return bean;
//	}

//	@Override public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("# BeanPostProcessor.postProcessAfterInitialization : Start");
//		System.out.println(bean);
//		System.out.println(beanName);
//		System.out.println("# BeanPostProcessor.postProcessAfterInitialization : End");
//		return bean;
//	}

//	@Override public void destroy() throws Exception {
//		System.out.println("# DisposableBean.destroy : Start");
//		System.out.println("# DisposableBean.destroy : End");
//	}
}
