import java.util.Scanner;

//Java ile iki sayının EBOB ve
// EKOK değerlerini "While Döngüsü" kullanarak yazınız.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz: ");
        int n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1, ekok = 1;
        int i = n1;

        while (i>=1){
              if (n1%i==0 && n2%i==0){
                ebob=i;
                System.out.print("EBOB :"+ebob);
                break;
              }
              i--;
          }
        ekok=(n1*n2)/ebob;
        System.out.print("\nEKOK : "+ekok);

    }
}