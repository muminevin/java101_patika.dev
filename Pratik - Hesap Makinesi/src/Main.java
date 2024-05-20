import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alacağımız değişkenleri ve scanner sınıfı ile kullanıcıdan bu değişkenleri alıyorum
        int num1,num2,secim;
        Scanner input=new Scanner(System.in);
        System.out.println("ilk sayıyı Giriniz : ");
        num1=input.nextInt();
        System.out.println("ikinci sayıyı Giriniz : ");
        num2=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        secim=input.nextInt();
        switch (secim)
        {
            case 1:
                System.out.println("Toplam = "+(num1+num2));
                break;
            case 2:
                System.out.println("Çıkarma = "+(num1-num2));
                break;
            case 3:
                System.out.println("Çarpma = "+(num1*num2));
                break;
            case 4:
                System.out.println("Sonuç : "+((num2!=0) ?(num1/num2):("bir sayı 0'a bölünemez!!!")));

                break;
            default:
                System.out.println("Geçersiz Seçim Yaptınız!!!!!");
                break;
        }






    }
}