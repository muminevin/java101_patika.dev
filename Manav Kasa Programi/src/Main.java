import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //uygulamada kullanacağımız meyve ve sebzelerin fiyatlarını ve kullanıcıdan alacağımız değişkenleri tanımladım
        double Armut =2.14, Elma= 3.67, Domates =1.11, Muz=0.95, Patlican= 5.00,a,e,d,m,p,toplam;

        //scanner sınıfı kullanarak kullanıcıdan veri aldım
        Scanner input=new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        a=input.nextInt();
        System.out.println("Elma Kaç Kilo ? :");
        e=input.nextInt();
        System.out.println("Domates Kaç Kilo ? :");
        d=input.nextInt();
        System.out.println("Muz Kaç Kilo ? :");
        m=input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ? :");
        p=input.nextInt();

        toplam=(a*Armut)+(e*Elma)+(d*Domates)+(m*Muz)+(p*Patlican);
        System.out.println("Toplam Tutar : "+toplam+"TL");


    }
}