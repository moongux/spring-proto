package hello;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class MessagePrinter2 implements ApplicationContextAware, BeanNameAware, InitializingBean,
	BeanFactoryAware, BeanPostProcessor, DisposableBean {
	final private MessageService service;

	@Autowired
	public MessagePrinter2(MessageService service) {
		this.service = service;
	}

	public void printMessage() {
		System.out.println(this.service.getMessage());
	}

	@PostConstruct
	public void init() {
		System.out.println("#2 init-method #");
	}

	@PreDestroy
	public void clean() {
		System.out.println("#2 destroy-method #");
	}

	// ApplicationContextAware
	@Override public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("#2 ApplicationContextAware.setApplicationContext : Start");
		System.out.println(applicationContext);
		System.out.println("#2 ApplicationContextAware.setApplicationContext : End");
	}

	@Override public void setBeanName(String name) {
		System.out.println("#2 BeanNameAware.setBeanName : Start");
		System.out.println(name);
		System.out.println("#2 BeanNameAware.setBeanName : End");
	}

	@Override public void afterPropertiesSet() throws Exception {
		System.out.println("#2 InitializingBean.afterPropertiesSet : Start");
		System.out.println("#2 InitializingBean.afterPropertiesSet : End");
	}

	@Override public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("#2 BeanFactoryAware.setBeanFactory : Start");
		System.out.println(beanFactory);
		System.out.println("#2 BeanFactoryAware.setBeanFactory : End");
	}

	@Override public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("#2 BeanPostProcessor.postProcessBeforeInitialization : Start");
		System.out.println(bean);
		System.out.println(beanName);
		System.out.println("#2 BeanPostProcessor.postProcessBeforeInitialization : End");
		return bean;
	}

	@Override public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("#2 BeanPostProcessor.postProcessAfterInitialization : Start");
		System.out.println(bean);
		System.out.println(beanName);
		System.out.println("#2 BeanPostProcessor.postProcessAfterInitialization : End");
		return bean;
	}

	@Override public void destroy() throws Exception {
		System.out.println("#2 DisposableBean.destroy : Start");
		System.out.println("#2 DisposableBean.destroy : End");
	}
}
