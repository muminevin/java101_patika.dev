import java.util.Scanner;

/*Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam
bölünen sayıların ortalamasını hesaplayan program.

 */
public class Main {
    public static void main(String[] args) {
        int k,toplam=0,sayac=0;
        Scanner input=new Scanner(System.in);

        System.out.print("bir sayı giriniz : ");
        k=input.nextInt();

        for(int i=1;i<=k;i++){
            if(i%4==0 && i%3==0){
                toplam=toplam+i;
                sayac++;
            }
        }
        System.out.print("3 ve 4' bölünen sayıların ortalaması = "+(toplam/sayac));

    }
}