package OnWebsite;

import java.util.LinkedList;
import java.util.List;

public class VirtualOrderTrap {
    int n; // number of order need solve
    

    private VirtualOrderTrap (int n, List<Integer> valuesOfOrder) {
        this.n = n;
        valuesOfOrder = new LinkedList<Integer>();
        valuesOfOrder.add(Integer.parseInt("100"));
        valuesOfOrder.add(Integer.parseInt("200"));
        valuesOfOrder.add(Integer.parseInt("300"));
        valuesOfOrder.add(Integer.parseInt("400"));
        valuesOfOrder.add(Integer.parseInt("400"));
        valuesOfOrder.add(Integer.parseInt("2000"));
     
    }

    

    private double result (double k, List<Integer> valuesOfOrder) {
        // h is profit
        double h = 0;
        for(int i = 1; i <= this.n; i++){
            if(i % 5 == 0){
                h =  Math.abs(k) * 0.1;
                k = 0;
            }
            k -= valuesOfOrder.get(i - 1);
        }

        return (k + h);
    }

    public static void main(String[] args) {
        List<Integer> valuesOfOrder = null;
        VirtualOrderTrap a = new VirtualOrderTrap(6, valuesOfOrder);
        
        
    }
}