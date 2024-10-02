import java.util.Scanner;
/*Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.

 */
public class Main {
    public static void main(String[] args) {
        int n,k;
        Scanner input=new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı : ");
        n=input.nextInt();
        System.out.print("Üs Olacak Sayı Sayı : ");
        k=input.nextInt();
        int total=1;

        for (int i=1 ; i<=k ; i++){
            total*=n;
        }
        System.out.print("Cevap :"+total);

    }
}