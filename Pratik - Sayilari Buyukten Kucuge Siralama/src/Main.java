import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan alınan 3 sayıyı küçükten büyüğe sıralayan bir uygulama
        //kullanıcıdan alınacak sayılar için değişken tanımladım ve scanner sınıfı ile kullanıcıdan aldım
        int a,b,c;
        Scanner input=new Scanner(System.in);

        System.out.println("1.Sayıyı Girniz : ");
        a=input.nextInt();
        System.out.println("2.Sayıyı Girniz : ");
        b=input.nextInt();
        System.out.println("3.Sayıyı Girniz : ");
        c=input.nextInt();

        //if blokları ile kullanıcıdan alınan sayıları sıraladım

        if(a>b && a>c){
            if(b>c){
                System.out.println(a+">"+b+">"+c);
            } else if (b==c) {
                System.out.println(a+">"+c+"="+b);
            } else
            {
                System.out.println(a+">"+c+">"+b);
            }
        } else if (b>a && b>c) {
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            } else if (a==c) {
                System.out.println(b+">"+c+"="+a);

            } else
            {
                System.out.println(b+">"+c+">"+a);
            }

        } else if (a==b && a>c) {
            System.out.println(a+"="+b+">"+c);

        } else if (a==c && a>b) {
            System.out.println(a+"="+c+">"+b);
        } else if (b==c && b>a) {
            System.out.println(b+"="+c+">"+a);
        } else {
            if(b>a){
                System.out.println(c+">"+b+">"+a);
            } else if (a==b) {
                System.out.println(c+">"+b+"="+a);
            } else
            {
                System.out.println(c+">"+a+">"+b);
            }

        }


    }
}