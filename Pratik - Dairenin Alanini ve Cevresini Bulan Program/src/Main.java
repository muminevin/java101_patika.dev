import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan yarı çapı alınan dairenin alanını ve çevreisni hesaplayan program
       /* int r;
        double pi=3.14;
        Scanner input=new Scanner(System.in);

        System.out.println("Dairenin Yarı Çapını Giriniz = ");
        r= input.nextInt();
        double alan=pi*r*r;
        double cevre=2*pi*r;
        System.out.println("Dairenin alanı = "+alan);
        System.out.println("Dairenin Çevresi = "+cevre);

        */

        //Kullanıcıdan yarı çapı ve merkez açısının ölçüsü alınan daire diliminin alnını bulan program

        int r,a;

        double pi=3.14;
        Scanner input=new Scanner(System.in);

        System.out.println("Daire Diliminin Yarı Çapını Giriniz = ");
        r= input.nextInt();
        System.out.println("Daire Diliminin Merkez Açısını  Giriniz = ");
        a= input.nextInt();

        double alan=(pi*r*r*a)/360;
        System.out.println("Daire Diliminin Alanı = "+alan);



    }
}