import java.util.Scanner;

public class Main {
    static int usHesabi(int tab,int us){
        if(tab==0 || us==0){
            return 1;
        }
        else {
            return tab*usHesabi(tab,us-1);
        }

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Taban Değerini Giriniz : ");
        int tab=input.nextInt();
        System.out.print("Üst Değerini giriniz : ");
        int us=input.nextInt();

        System.out.print(usHesabi(tab,us));

    }
}