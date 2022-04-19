package org.koushik.javabrains;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.MessageSource;

public class Circle implements Shape {
	
	private Point center;
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource messagesource;

	public MessageSource getMessagesource() {
		return messagesource;
	}

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public void draw() {
		System.out.println(this.messagesource.getMessage("drawing circle", null,"default Greeting",null));
		System.out.println(this.messagesource.getMessage("drawing point", new Object[] {center.getX(),center.getY()}, "default",null));
		System.out.println("Circle: Point is : " + center.getX() + "," + center.getY());;
		DrawEvent drawEvent = new DrawEvent(this);
		 publisher.publishEvent(drawEvent);
//		System.out.println());
	
}
}
