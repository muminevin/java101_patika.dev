import java.util.Scanner;
public class Main {

    static int design(int n, boolean control, int flag)
    {
        if (control)
        {
            if (n > 0)
            {
                System.out.print(n + " ");
                flag++;
                return design(n - 5, true, flag);
            }
            else
            {
                return design(n, false, flag);
            }
        }
        else
        {
            System.out.print(n + " ");
            if (flag > 1)
            {
                flag--;

                return design(n + 5, false, flag);
            }
            else
            {
                return n+5;
            }
        }
    }
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n=input.nextInt();
        System.out.print(design(n,true,0));


    }
}