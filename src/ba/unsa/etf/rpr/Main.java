package ba.unsa.etf.rpr;
import java.util.Scanner;

public class Main {
    static int sumaCifara(int broj) {
        int suma=0;
        while(broj!=0) {
            suma+=broj%10;
            broj=broj/10;
        }
        return suma;
    }
    public static void main(String[] args) {
        int n;
        Scanner ulaz=new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n=ulaz.nextInt();
        System.out.println("Brojevi izmedju 1 i " + n + " koji su djeljivi sa sumom svojih cifara su:");
        for(int i=1; i<=n; i++) {
            int x=sumaCifara(i);
            if(i%x==0) System.out.println(i + " ");
        }
        // write your code here
    }
}
