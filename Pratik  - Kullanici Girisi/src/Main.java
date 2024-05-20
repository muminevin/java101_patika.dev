import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Giriş yapacak kullanicidan alacağımız değişkenleri tanımladım ve Scanner sınıfını kullanarak kullanıcıdan aldım
        String userName, password, newPassword;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınızı Giriniz");
        userName = input.nextLine();
        System.out.println("Şifrenizi Giriniz");
        password = input.nextLine();

        //girilen bilgiler do[rumu değilmi konturolu ve eğer şifre yanlışsa değiştirmesi için gerekli kod blokları

        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Başarıyla giriş yaptınız");
        } else {
            System.out.println("Girdiğiniz bilgiler yanlış!!");
            System.out.println("Şifrenizi değiştirmek ister misiniz? (Evet/Hayır)");
            String response = input.nextLine();

            if (response.equalsIgnoreCase("Evet")) {
                System.out.println("Yeni şifrenizi giriniz:");
                newPassword = input.nextLine();

                // Yeni şifrenin eski şifreyle aynı olmaması ve boş olmaması kontrolü
                if (!newPassword.equals(password) && !newPassword.isEmpty()) {
                    System.out.println("Şifre başarıyla değiştirildi.");
                } else {
                    System.out.println("Yeni şifre eski şifreyle aynı veya geçersiz! Şifre değiştirilemedi.");
                }
            } else {
                System.out.println("Şifre değiştirme işlemi iptal edildi.");
            }
        }

        input.close();
    }
}
