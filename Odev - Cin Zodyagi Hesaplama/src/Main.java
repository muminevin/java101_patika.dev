import java.util.Scanner;
/*Çin Zodyağı nedir?

        4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve sembollerle tanımlar. Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve yıldızlarla pek bir ilgisi yoktur.

        Çin Zodyağı nasıl hesaplanır?

        Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

 */
public class Main {
    public static void main(String[] args) {
        int dogumYili;

        Scanner input=new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz :");
        dogumYili=input.nextInt();
        dogumYili=dogumYili%12;

        switch (dogumYili){
            case 0:
                System.out.print("Çin Zodyağı Burcunuz : Maymun");
                break;
            case 1:
                System.out.print("Çin Zodyağı Burcunuz : Horoz");
                break;
            case 2:
                System.out.print("Çin Zodyağı Burcunuz : Köpek");
                break;
            case 3:
                System.out.print("Çin Zodyağı Burcunuz : Domuz");
                break;
            case 4:
                System.out.print("Çin Zodyağı Burcunuz : Fare");
                break;
            case 5:
                System.out.print("Çin Zodyağı Burcunuz : Öküz");
                break;
            case 6:
                System.out.print("Çin Zodyağı Burcunuz :  Kaplan");
                break;
            case 7:
                System.out.print("Çin Zodyağı Burcunuz : Tavşan");
                break;
            case 8:
                System.out.print("Çin Zodyağı Burcunuz : Ejderha");
                break;
            case 9:
                System.out.print("Çin Zodyağı Burcunuz : Yılan");
                break;
            case 10:
                System.out.print("Çin Zodyağı Burcunuz : At");
                break;
            case 11:
                System.out.print("Çin Zodyağı Burcunuz : Koyun");
                break;
            default:
                System.out.print("yaniş Değer girdiniz");
                break;
        }




    }
}