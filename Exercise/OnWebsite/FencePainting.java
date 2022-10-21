package OnWebsite;
import java.util.Scanner;

public class FencePainting{
    int n;  // n available is number of iron bar
    int cost[][];   // Two-Way Array contains paint cost in order red, blue, black
    private static final Scanner sc = new Scanner(System.in);
    
    private void menu () {
        System.out.println("1.Enter number of iron bar");
        System.out.println("2.Enter number of iron bar");
    }

    private void init () {
        this.n = sc.nextInt();
        this.cost = new int[n][3];
    }

    private void enterCostTable () {
        int i = 0;
        int a = (n-1)-(n-i-1);
        for(i = 0; i < n; i++){
            System.out.printf("Cost [%d][%d]: ", i, a);
            this.cost[i][a] = sc.nextInt();
        }
    }



    public static void main(String[] args) {
        
        
        

        

        
    }

}