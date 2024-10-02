import java.util.Scanner;

/*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
        çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

 */
public class Main {
    public static void main(String[] args) {
        int n;
        int total=0;
        Scanner input=new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n= input.nextInt();
            if(n%2==0){
                total +=n;
            }

        }while (n%2==0);

        System.out.print("Toplam = "+total);

    }
}