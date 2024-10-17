import java.util.Scanner;

public class Main {

    static boolean asalSayi(int n,int b){
        if(b==1){
            return true;
        }else {
            if (n%b==0){
                return false;
            }else {
                return asalSayi(n,b-1);
            }
        }


    }
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Sayı Giriniz : ");
        int n=input.nextInt();
        if(n<=0 || n==1) {
            System.out.print(n+" sayısı ASAL değildir !");

        }else {
            if (asalSayi(n, n / 2)) {
                System.out.print(n + " sayısı ASALDIR !");
            } else {
                System.out.print(n + " sayısı ASAL değildir !");

            }
        }


    }
}