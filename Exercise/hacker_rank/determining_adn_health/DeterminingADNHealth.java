package hacker_rank.determining_adn_health;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeterminingADNHealth {
    private int n; // Denoting the total number of genes 
    private List<String> gene; // Denoting for gene name 
    private List<Integer> health; //Denoting for health values
    private int s; // Denoting a set of DNA strand
    String[][] strand;


    private static final Scanner sc = new Scanner(System.in);

    public DeterminingADNHealth (int n, int s){
        this.s = s;
        this.n = n;
        gene = new ArrayList<String>();
        health = new ArrayList<Integer>();
        strand = new String[s][3];
        // strand[0][0] ="1";
        // strand[0][1] ="4";
        // strand[0][2] ="caaad";
        // strand[1][0] ="0";
        // strand[1][2] ="4";
        // strand[1][2] ="xyz";
        // strand[2][0] ="2";
        // strand[2][1] = "4";
        // strand[2][2] ="bcdybc";
        
    }

    public void setGene() {
        for(int i =0; i < n; i++){
            System.out.printf("Nhap gia tri gene %d: ", i);
            gene.add(sc.nextLine());
        }
    }

    public void setHealth() {
        for(int i =0; i < n; i++){
            System.out.printf("Nhap gia tri health %d: ", i);
            health.add(sc.nextInt());
        }
    }
    
    public void setStrand() {
        for(int i = 0; i < s; i++){
            for(int j = 0; j <3; j++) {
                if(j == 0){
                    System.out.println("Nhap sStrart " + i + ": ");
                    //sc.nextLine();
                    strand[i][j] = Integer.toBinaryString(sc.nextInt());
                }else if(j == 1) {
                    System.out.println("Nhap sEnd " + i + ": ");
                    //sc.nextLine();
                    strand[i][j] = Integer.toBinaryString(sc.nextInt());
                }else if(j == 2) {
                    System.out.println("Nhap d " + i + ": ");
                    sc.nextLine();
                    strand[i][j] = String.valueOf(sc.nextLine());
                }
            }
        }
    }

    public void tableHealthValues () {
        int[] table = new int[s];
        List<String> geneSplit = new ArrayList<String>(); 
        List<Integer> healthSplit = new ArrayList<Integer>();


        for(int i =0; i<s ; i++){
            // Set virtual gene value
            for(int u = Integer.parseInt(strand[i][0]);
                u <= Integer.parseInt(strand[i][1]); u++){
                    geneSplit.add(gene.get(u));
            }

            // Set virtual health value
            for(int o = Integer.parseInt(strand[i][0]);
                o <= Integer.parseInt(strand[i][1]); o++){
                    healthSplit.add(health.get(o));
            }

            //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
            for(int j=0 ; j<strand[i][2].length(); j++){
                for(int l = 0; l < geneSplit.size(); l++){
                    if(strand[i][2].startsWith(geneSplit.get(l), j)){
                        table[i] += healthSplit.get(l);
                    }
                    
                }
                
            }
            geneSplit.clear();
            healthSplit.clear();
        }

        System.out.println(table[0]);
        System.out.println(table[1]);
        System.out.println(table[2]);
    }

}