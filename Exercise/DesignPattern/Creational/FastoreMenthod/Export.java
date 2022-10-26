package DesignPattern.Creational.FastoreMenthod;
import DesignPattern.Creational.FastoreMenthod.Produtcs.Candy;
import DesignPattern.Creational.FastoreMenthod.Produtcs.Product;
import DesignPattern.Creational.FastoreMenthod.Produtcs.Robot;
import DesignPattern.Creational.FastoreMenthod.Produtcs.Technolegy;

public class Export{
	
	public static Factory getInformation (Product information) {
			if(information == Product.CANDY)
				return new Candy();
			else if(information == Product.ROBOT)
				return new Robot();
			else if(information == Product.TECHNOLEGY)
				return new Technolegy();
			
			return null;
	}
	
	
}