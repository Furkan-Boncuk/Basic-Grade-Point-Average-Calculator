import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int yas,yolculukTipi;
        double mesafe,ucret;

        System.out.println("Uçuş Mesafesini Giriniz: ");
        mesafe=input.nextInt();
        System.out.println("Yaşınızı Giriniz: ");
        yas=input.nextInt();
        System.out.println("Yolculuk Tipini Seçiniz(1 => Tek Yön , 2 => Gidiş Dönüş): ");
        yolculukTipi= input.nextInt();

        if(yas>=0 && mesafe>0 && (yolculukTipi==1 || yolculukTipi==2)){
            ucret=mesafe*0.10;
            if(yas<12){
                ucret=ucret-ucret*0.5;
            }else if(yas>=12 && yas<=24){
                ucret=ucret-ucret*0.1;
            }else if(yas>65){
                ucret=ucret-ucret*0.3;
            }
            if(yolculukTipi==2){
                ucret=ucret-ucret*0.2;
                ucret=ucret*2;
                System.out.println("Bilet Ücretiniz: "+ucret);
            }else{
                System.out.println("Bilet Ücretiniz: "+ucret);
            }
        }else{
            System.out.println("Hatalı Veri Girdiniz!");
        }
    }
}
