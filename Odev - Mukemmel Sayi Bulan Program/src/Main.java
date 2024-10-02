import  java.util.Scanner;
/*Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.
” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

   Mükemmel Sayı Nedir ?
 Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya
  mükemmel sayı denir.


 */
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number=input.nextInt();
        int total=0;

        for (int i=number-1;i>=1 ;i--){
            if(number%i==0){
                total +=i;
            }
        }
        if (number==total){
            System.out.print(number+" Mükemmel sayıdır");
        }
        else {
            System.out.print(number+" Mükemmel sayı değildir.");
        }
    }
}