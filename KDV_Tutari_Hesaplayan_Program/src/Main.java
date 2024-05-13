import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınacak değişkenler ve KDV oranını tutan değişkenlerin belirlenmesi
        float para,kdv1=0.18F,kdv2=0.08F,kdv;
        Scanner input=new  Scanner(System.in);
        //kullanıcıdan ana para değeri alındı
        System.out.println("Paranizin miktarini giriniz: ");
        para=input.nextFloat();

        System.out.println("KDV'siz Fiyat = "+para);
        boolean uygulanacakKdv=para>=0 && para<=1000;

        kdv=uygulanacakKdv ?kdv1:kdv2;

        System.out.println("KDV'li Fiyat = "+(para+(para*kdv)));
        System.out.println("KDV tutarı = "+(para*kdv));







    }
}