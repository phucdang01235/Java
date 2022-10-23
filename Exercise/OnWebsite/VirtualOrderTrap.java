package OnWebsite;

import java.util.LinkedList;
import java.util.List;

public class VirtualOrderTrap {
    int n; // number of order need solve
    List<Integer> valuesOfOrder;

    private VirtualOrderTrap (int n) {
        this.n = n;
        valuesOfOrder = new LinkedList<Integer>();
        valuesOfOrder.add(Integer.parseInt("100"));
        valuesOfOrder.add(Integer.parseInt("200"));
        valuesOfOrder.add(Integer.parseInt("300"));
        valuesOfOrder.add(Integer.parseInt("400"));
        valuesOfOrder.add(Integer.parseInt("100"));
        //valuesOfOrder.add(Integer.parseInt("2000"));
     
    }

    

    private double result () {
        // h is profit
        double k = 0;
        double h = 0;
        for(int i = 1; i <= this.n; i++){
            k -= valuesOfOrder.get(i-1);

            if(i % 5 == 0){
                h =  Math.abs(k) * 0.1;
                k = 0;
            }
            
        }

        return (k + h);
    }

    public static void main(String[] args) {
    
        VirtualOrderTrap a = new VirtualOrderTrap(5);

        double b = a.result();
        
        System.out.println(b);
    }
}