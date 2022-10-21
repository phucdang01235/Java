package OnWebsite;
import java.util.Scanner;

public class FencePainting{
    int n;  // n available is number of iron bar
    int cost[][];   // Two-Way Array contains paint cost in order red, blue, black
    private static final Scanner sc = new Scanner(System.in);
    
    private static void menu () {
        System.out.println("1.Enter number of iron bar");
        System.out.println("2.Enter cost table");
        System.out.println("3.Two-way matrix");
    }

    private void init () {
        this.n = sc.nextInt();
        this.cost = new int[n][3];
    }

    private void enterCostTable () {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++ ) {
                System.out.printf("Cost [%d][%d]: ", i, j);
                this.cost[i][j] = sc.nextInt();  
            }
        }
        System.out.println();
    }

    private int calculateTheMinimumValue () {
        int minimum;    // Minimum value
        int sum = 0;    // Cost sum
        int avoidDuplication = -1;

        for(int i = 0; i < n; i++) {

            minimum = this.cost[i][0];

            for(int j = 0; j < 3; j++ ) {
                if( avoidDuplication == j){
                   continue; 
                }
                else if(minimum < this.cost[i][j]){
                    minimum = this.cost[i][j];
                    avoidDuplication = j;
                }
                else
                    avoidDuplication = 0;

                sum += minimum;
            }
        }
        return sum;
    }

    private void twoWayMatrix () {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++ ) {
                System.out.printf("%d ", this.cost[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int option;
        FencePainting x = new FencePainting();
        do{
            FencePainting.menu();
            System.out.print("Enter option: ");
            option = sc.nextInt();

            switch(option){
                case 0:
                    break;
                case 1:
                    x.init();
                    break;
                case 2:
                    x.enterCostTable();
                    break;
                case 3:
                    x.twoWayMatrix();
                    break;
                default:
                    option = 0;
                    break;
            }

        }while( option != 0);        

        
        // System.out.println("1.Enter number of iron bar");
        // System.out.println("2.Enter cost table");
        // System.out.println("3.Two-way matrix");
        
    }

}