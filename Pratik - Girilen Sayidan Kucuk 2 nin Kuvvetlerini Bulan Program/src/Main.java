import java.util.Scanner;

/*Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.*/
public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input=new Scanner(System.in);
        System.out.print("Sınır Sayınızı Giriniz : ");
        n= input.nextInt();

        for(int i=1;i<=n;i++){
            if(i%4==0){
                System.out.print(i+"\n");
            } else if (i%5==0) {
                System.out.print(i+"\n");
            }
        }


    }
}