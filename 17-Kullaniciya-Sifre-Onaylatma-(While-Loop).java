import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String password,password2;
        boolean sifreDogruMu=false;

        Scanner input = new Scanner(System.in);
        System.out.print("Şifrenizi Giriniz: ");
        password=input.nextLine();

        while(!sifreDogruMu){
            System.out.print("Şifreyi Onaylamak İçin Tekrar Giriniz: ");
            password2=input.nextLine();
            if(password2.equals(password)){
                System.out.println("Şifreniz Onaylandı.");
                sifreDogruMu=true;
            }else{
                System.out.println("Şifreyi Yanlış Girdiniz!");
            }
        }
    }
}
