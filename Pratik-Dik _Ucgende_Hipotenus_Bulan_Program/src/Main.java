import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
      /*kullanıcıdan Alacağımız Değişkenleri Tanımlıyoruz
        int a,b;
        double hypotenuse;
        Scanner input=new Scanner(System.in);
        //kullanıcıdan verileri Alalim
        Scanner input=new Scanner(System.in);

        System.out.print("1.kenari Giriniz = ");
        a=input.nextInt();
        System.out.print("2.kenari Giriniz = ");
        b=input.nextInt();
        hypotenuse=Math.sqrt((a*a)+(b*b));
        System.out.print("Girilen Dik Üçgenin Hipotenüs Uzunluğu = "+hypotenuse);
         */
        //Ödev kullanıcıdan Kenarları Alınan bir üçgenin Alanını Hesaplama

        int a,b,c,u,cevre;
        double alan;

        Scanner input=new Scanner(System.in);
        System.out.print("1.kenari Giriniz = ");
        a=input.nextInt();
        System.out.print("2.kenari Giriniz = ");
        b=input.nextInt();
        System.out.print("3.kenari Giriniz = ");
        c=input.nextInt();
        cevre=a+b+c;
        u=cevre/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Üçgenin Alanı = " +alan);













    }
}