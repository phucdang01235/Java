package hacker_rank.minimum_loss;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MinimumLoss {
    int numberOf;
    private List<Integer> price;
    private static final Scanner sc = new Scanner (System.in);

    public MinimumLoss (int numberOf) {
        price = new LinkedList<Integer>();
        this.numberOf = numberOf;

    }

    public int lessLoss () {
        int n = 0;
        int space = 0;
        for(int i = 0; i < numberOf - 1; i++){
            n = price.get(i);
            for(int j = i + 1; j< numberOf; j++){
                if( (n - price.get(j)) > 0 && space == 0){
                    space = n - price.get(j);
                }else if((n - price.get(j)) > 0 && (n - price.get(j)) < space){
                    space = n - price.get(j);
                }
            }
        }
        return space;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(sc.nextLine());
        MinimumLoss test = new MinimumLoss(a);
        for(int i =0 ; i< a; i++){
            test.price.add(Integer.parseInt(sc.nextLine()));
        }
        
        int s = test.lessLoss();
        System.out.println(s);
    } 
}