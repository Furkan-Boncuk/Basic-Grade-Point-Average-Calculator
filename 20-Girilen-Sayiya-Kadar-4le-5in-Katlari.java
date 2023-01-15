import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Sınır Sayısını Giriniz: ");
        number=input.nextInt();
        System.out.println("Girilen Sayıya Kadarki 4ün Katı Sayılar: ");
        if(number<0){
            for(int i=-1;i>number;i*=4){
                System.out.println(i);
            }
        }else if(number>0){
            for(int i=1;i<number;i*=4){
                System.out.println(i);
            }
        }else if(number==0){
            System.out.println("Değer Bulunamadı.");
        }

        System.out.println("Girilen Sayıya Kadarki 5in Katı Sayılar: ");
        if(number<0){
            for(int i=-1;i>number;i*=5){
                System.out.println(i);
            }
        }else if(number>0){
            for(int i=1;i<number;i*=5){
                System.out.println(i);
            }
        }else if(number==0){
            System.out.println("Değer Bulunamadı.");
        }
    }
}
