import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
      /*  Scanner input=new Scanner(System.in);
        System.out.print("Faktöryel Sayısı : ");
        int n= input.nextInt();
        int total=1;

        for (int i=1;i<=n;i++){
            total=total*i;
        }
        System.out.print(n+".Faktöryel :"+total);


     */

   /* N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

    Java ile kombinasyon hesaplayan program yazınız.

    */
        int n,r;
        Scanner input=new Scanner(System.in);

        System.out.print("Kümenin eleman sayısını giriniz : ");
        n=input.nextInt();
         System.out.print("Kombinasyon  sayısını giriniz : ");
         r=input.nextInt();
         int total,nTotal=1,rTotal=1,cTotal=1;

         for (int i=1 ; i<=n ; i++){
             nTotal=nTotal*i;
         }
         for (int i=1 ; i<=r ; i++){
             rTotal=rTotal*i;
         }
         for (int i=1 ; i<=(n-r) ; i++){
             cTotal=cTotal*i;
         }

         total=nTotal/(rTotal*cTotal);
         System.out.print("Kombinasyon :"+total);


     }
}