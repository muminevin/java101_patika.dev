import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number,firstTem=0,secondTerm=1,nextTerm;
        Scanner input=new Scanner(System.in);
        System.out.println("görmek istediğiniz fibonacci sersindeki sayısını giriniz: ");
        number=input.nextInt();
        System.out.println("Fibonacci serisi:\n");

        for(int i=0;i<=number;i++){
            System.out.println(firstTem);

            //updating the first and second  term
            nextTerm=firstTem+secondTerm;
            firstTem=secondTerm;
            secondTerm=nextTerm;


        }

    }
}