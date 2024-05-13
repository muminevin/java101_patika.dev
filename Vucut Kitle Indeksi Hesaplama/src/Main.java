import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınacak boy ve kilo değişkenlerini Tanımladım
        float boy,kilo;

        Scanner input=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy=input.nextFloat();
        System.out.println("Lütfen kilonuzu giriniz :  ");
        kilo=input.nextFloat();

        double vucutKitleIndeksi=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : "+vucutKitleIndeksi);
    }
}