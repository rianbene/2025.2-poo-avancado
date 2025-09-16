package main;

import bridge.DrawingAPI1;
import bridge.Shape;
import bridge.Circle;
import bridge.DrawingAPI;
import bridge.Square;
import composite.File;
import composite.Folder;
import decorator.EmailNotifier;
import decorator.SMSNotifier;

public class Principal {

	public static void main(String[] args) {
		// Bridge 
		/*
		DrawingAPI d = new DrawingAPI1();
		Shape c = new Circle(1, 2, 3, d);
		Shape s = new Square(10, 11, d);
		c.draw();
		s.draw();
		*/
		
		/*
		// Composite
		Folder f = new Folder();
		f.add(new File("teste.txt"));
		f.add(new File("prova.doc"));
		f.add(new File("resultado.doc"));
		f.showDetails();
		*/
		
		// Decorator
		EmailNotifier en = new EmailNotifier();
		SMSNotifier sms = new SMSNotifier(en);
		sms.send("Email ao público");
	}

}
