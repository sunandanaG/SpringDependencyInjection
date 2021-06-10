package com.vm.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.vm.entity.Restuarant;

public class RestuarantClient 
{
	public static void main(String[] args) {
		
	
	Resource resource=new ClassPathResource("Object.xml");
	BeanFactory factory=new XmlBeanFactory(resource);
	
Restuarant restraunt=(Restuarant) factory.getBean("r");
  restraunt.displayRestraunt();

	}
}
