import java.util.Scanner;
/*
Uçak Bileti Fiyatı Hesaplama
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın.
İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın.

 */
public class Main {
    public static void main(String[] args) {
        int km,yas,yolculuk;
        double tutar, topTutar, indirimliTutari, indirimYasi, indirimGidisDonus;
        Scanner input=new Scanner(System.in);

        System.out.println("Uçak Bileti Fiyatı Hesaplama");
        System.out.print("Mesafe km olarak giriniz: ");
        km = input.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipi seç\n(1-Tek Yön, 2-Gidiş Dönüş): ");
        yolculuk = input.nextInt();
        tutar=km*0.10;
        if(km>9 && yas >0 && (yolculuk==1 || yolculuk==2) ){
            //kişi 12 yaşından küçük ise bilet fiyatında %50 indirim uygulanacak
            if(yas<12){
                indirimYasi=tutar*0.5;
                indirimliTutari=tutar-indirimYasi;
                if (yolculuk==2){
                    indirimGidisDonus=indirimliTutari*0.20;
                    topTutar=(indirimliTutari-indirimGidisDonus)*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }
                else {
                    topTutar=indirimliTutari*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }


            }
            //kişi 12-24 yaşları arasında ise  fiyatında %10 indirim uygulanacak
            else if (yas>=12 && yas<=24){
                indirimYasi=tutar*0.1;
                indirimliTutari=tutar-indirimYasi;
                if (yolculuk==2){
                    indirimGidisDonus=indirimliTutari*0.20;
                    topTutar=(indirimliTutari-indirimGidisDonus)*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }
                else {
                    topTutar=indirimliTutari*2;
                    System.out.print("Toplam tutar: " + topTutar);
                }
            }
            //kişi 24-65 yaşları arasında ise  fiyatında  indirim uygulanmayacak

            else if (yas>24 && yas<=65){
                indirimliTutari=tutar;
                if (yolculuk==2){
                    indirimGidisDonus=indirimliTutari*0.20;
                    topTutar=(indirimliTutari-indirimGidisDonus)*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }
                else {
                    topTutar=indirimliTutari*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }
            }
            //kişi 65 yaşından büyük ise %30 indirim uygulanacaktır
            else if (yas>65){
                indirimYasi=tutar*0.3;
                indirimliTutari=tutar-indirimYasi;
                if (yolculuk==2){
                    indirimGidisDonus=indirimliTutari*0.20;
                    topTutar=(indirimliTutari-indirimGidisDonus)*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }
                else {
                    topTutar=indirimliTutari*yolculuk;
                    System.out.print("Toplam tutar: " + topTutar);
                }
            }
        }else {
            System.out.print("Hatalı Veri Girdinizz");
        }





    }
}