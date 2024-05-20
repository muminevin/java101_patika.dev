import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //sıcaklık durumuna göre etkinlik öneren bir uygulamadır kullanıcının gireceği sıcaklık derecesine göre
        //kullanıcıya etkinlik önerir
        //kullanıcıdan alacağım sıcaklık değeri için bir değişken tanımladım ve scanner sınıfını kullanarak kullanıcıdan sıcaklık durumunu aldım

        int heat;

        Scanner input=new Scanner(System.in);

        System.out.println("Sıcaklık Giriniz : ");
        heat=input.nextInt();

        //if blokları ile sıcalık değerine göre etkinlik öneririz


        if (heat<5){
            System.out.println("Kayak Yapabilirsiniz");
        } else if (heat>=5 || heat<=15) {
            System.out.println("Sinemaya Gidebilisiniz");
        } else if (heat>=16 || heat<=25) {
            System.out.println("Pikniğe  Gidebilisiniz");
        } else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }


    }
}