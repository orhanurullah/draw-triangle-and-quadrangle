import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Yıldızlarla Şekiller Yapma Programı");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");
        int n = scanner.nextInt();

        Main main = new Main();
        /**
         * Star Çizen Program
         */
        main.drawStar(n);
        /**
         * Elmas Çizen Program
         */
        main.drawDiomand(n);

    }
    public void drawDiomand(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2*i+1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(" ");
            }
            for(int z = 1; z <= (2*(n-i) -1); z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void drawStar(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n-i); j++){
                System.out.print(" ");
            }
            for(int z = 1; z <= (2 * i +1); z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
