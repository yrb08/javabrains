package org.koushik.javabrains;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Triangle t1=(Triangle)context.getBean("triangle");
		Circle c1=(Circle)context.getBean("Circle");
		Shape shape=(Shape)context.getBean("Circle");
		
        shape.draw();
        System.out.println(context.getMessage("greeting",null,"Default Greeting", null));
		
		

	}
 
}
