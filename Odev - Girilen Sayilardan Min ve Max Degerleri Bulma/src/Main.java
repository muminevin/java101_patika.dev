import java.util.Scanner;

/*
Girilen Sayılardan Min ve Max Değerleri Bulma
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0, min = 0, number, n;

        System.out.print("Kaç sayı girececeksiniz?: ");
        n = input.nextInt();


        for (int i = 1; i <= n; i++)
        {
            System.out.print(i + ". Sayıyı giriniz: ");
            number= input.nextInt();
            if (i == 1)
            {
                max = number;
                min = number;
            }
            if (number > max)
            {
                max = number;
            }
            if (number < min)
            {
                min = number;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçün sayı: " + min);

    }
}