import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alınack değişkenler tanımlandı
        float matematik, fizik, kimya, turkce, tarih, muzik;

        //kullanicidan veriler almak için input değikeni tanımlandı'
        Scanner input=new Scanner(System.in);

        //kullanıcıdan değerler alınıp değişkenlere atanacak
        System.out.println("matematik notunuzu girin: ");
        matematik= input.nextFloat();

        System.out.println("fizik notunuzu girin: ");
        fizik= input.nextFloat();

        System.out.println("kimya notunuzu girin: ");
        kimya= input.nextFloat();

        System.out.println("türkçe notunuzu girin: ");
        turkce= input.nextFloat();

        System.out.println("tarih notunuzu girin: ");
        tarih= input.nextFloat();

        System.out.println("müzik notunuzu girin: ");
        muzik= input.nextFloat();

        //ortalama hesaplandi ve kullaniciya gösterildi
        double ortalama=(matematik+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("ortalamanız: "+ortalama);

        boolean gecmeDurumu=ortalama>=0;

        System.out.println("Sınıfı Geçme Durumuzu="+(gecmeDurumu==true ? "Geçtiniz":"Kaldiniz"));



    }
}