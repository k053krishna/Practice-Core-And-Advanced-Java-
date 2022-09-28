package com.velocity;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

     public static void main(String[] args) {
		Resource resource=new ClassPathResource("spring.xml");
		@SuppressWarnings("deprecation")
		BeanFactory beanFactory=new XmlBeanFactory(resource);
		Categories categoriess=(Categories) beanFactory.getBean("categories");
	    categoriess.show();
     }
}