import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password,newPassword,choice;
        Scanner input=new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz: ");
        userName= input.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password= input.nextLine();

        if(userName.equals("furkan") && password.equals("123456")){
            System.out.println("Giriş Yapıldı.");
        }else{
            System.out.println("Hatalı kullanıcı adı veya şifre girildi.");
            System.out.print("Şifreyi sıfırlamak ister misiniz?(e/h): ");
            choice=input.nextLine();
            if(choice.equals("e")){
                System.out.print("Yeni şifrenizi girin: ");
                newPassword=input.nextLine();
                if(newPassword.equals("123456")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }else{
                    System.out.println("Şifre oluşturuldu");
                }
            }else if(choice.equals("h")){
                System.out.println("Giriş yapılamadı");
            }
        }
    }
}
