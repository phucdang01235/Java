package FastoreMenthod;

import FastoreMenthod.Produtcs.Product;

public class Main{
	
	public static void main(String[] args) {
		Factory x = Export.getInformation(Product.ROBOT);
		
		System.out.print(x.getProduct() ); 
	}
}