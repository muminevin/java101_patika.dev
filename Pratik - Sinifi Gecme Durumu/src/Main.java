import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //kullanıcıdan alacağımız ders notları için gerekli değişkenleri tanımladım
        //scanner sınıfını kullanarak kullanıcıdan verileri aldım
        int Mat, Fizik, Turkce, Kimya, Muzik;

        Scanner input=new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        Mat=input.nextInt();
        System.out.println("Fizik Notunuz : ");
        Fizik=input.nextInt();
        System.out.println("Türkçe Notunuz : ");
        Turkce=input.nextInt();
        System.out.println("Kimya Notunuz : ");
        Kimya=input.nextInt();
        System.out.println("Müzik Notunuz : ");
        Muzik=input.nextInt();
        if((Mat>=0 && Mat<=100)&&(Fizik>=0 && Fizik<=100)&&(Turkce>=0 && Turkce<=100)&&(Kimya>=0 && Kimya<=100)&&(Muzik>=0&&Muzik<=100)){
            double avarage=(Mat+Fizik+Turkce+Kimya+Muzik)/5;

            if(avarage>=55){
                System.out.println("Tebrikler,Sınıfı Geçtiniz");

            }
            else {
                System.out.println("Sınıfta Kaldınız Seneye Tekrar Görüşmek Üzere");
            }
        }else
        {
            System.out.println("bir dersten 100'den büyük ve 0'dan küçük alamazsınız !!!! ");
        }




    }
}