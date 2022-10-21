package FastoreMenthod;
import FastoreMenthod.Produtcs.Candy;
import FastoreMenthod.Produtcs.Product;
import FastoreMenthod.Produtcs.Robot;
import FastoreMenthod.Produtcs.Technolegy;

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