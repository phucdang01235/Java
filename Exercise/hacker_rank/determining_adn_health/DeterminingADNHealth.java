package hacker_rank.determining_adn_health;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeterminingADNHealth {
    private int n; // Denoting the total number of genes 
    private List<String> gene;  // Denoting for gene name 
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
    }

    public List<String> getGene() {
        return gene;
    }

    public void setGene() {
        
        for(int i =0; i < n; i++){
            System.out.printf("Nhap gia tri gene %d: ", i);
            gene.add(sc.nextLine());
        }
    }

    public List<Integer> getHealth() {
        return health;
    }

    public void setHealth(List<Integer> health) {
        this.health = health;
    }
    
    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }


}