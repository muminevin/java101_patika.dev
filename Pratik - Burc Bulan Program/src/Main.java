import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Kullanicidan doğum ayını ve gününü alıp burcunu bulan uygulama
        //kullanıcıdan alacağımız ay ve gün için değişkenlerini tanımladım ve scanner sınıfı ile kullanıcıdan aldım
        int month,day;
        String burc="";
        Scanner input=new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month= input.nextInt();
        System.out.print("Doğduğunuz gün : ");
        day= input.nextInt();

        //if blokları ile kullanıcının girdiği ay ve güne göre burcunu belirledim

        if(month==3 && day>=21 || month==4 && day<=20)
        {
            System.out.println("Koç burcu");
        }
        else if (month == 4 && day >= 21 || month == 5 && day <= 21)
        {
            System.out.println("Boğa burcu");
        }
        else if (month == 5 && day >= 22 || month == 6 && day <= 22)
        {
            System.out.println("İkizler burcu");
        }
        else if (month == 6 && day >= 23 || month == 7 && day <= 22)
        {
            System.out.println("Yengeç burcu");
        }
        else if (month == 7 && day >= 23 || month == 8 && day <= 22)
        {
            System.out.println("Aslan burcu");
        }
        else if (month == 8 && day >= 23 || month == 9 && day <= 22)
        {
            System.out.println("Başak burcu");
        }
        else if (month == 9 && day >= 23 || month == 10 && day <= 22)
        {
            System.out.println("Terazi burcu");
        }
        else if (month == 10 && day >= 23 || month == 11 && day <= 22)
        {
            System.out.println("Akrep burcu");
        }
        else if (month == 11 && day >= 23 || month == 12 && day <= 21)
        {
            System.out.println("Yay burcu");
        }
        else if (month == 12 && day >= 22 || month == 1 && day <= 21)
        {
            System.out.println("Oğlak burcu");
        }
        else if (month == 1 && day >= 22 || month == 2 && day <= 19)s
        {
            System.out.println("Kova burcu");
        }
        else if (month == 2 && day >= 20 || month == 3 && day <= 20)
        {
            System.out.println("Balık burcu");
        }
        else {
            if(day>=32){
                System.out.print("yanlış gün değerini Girdinz!!!!!");
            }else {
                System.out.print("Yanlış ay değerini girdiniz!!!!");
            }
        }
    }
}