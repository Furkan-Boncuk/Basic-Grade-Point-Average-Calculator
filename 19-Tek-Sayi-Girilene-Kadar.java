import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,sum=0;

        do{
            System.out.print("Bir Sayı Giriniz: ");
            number= input.nextInt();

            if((number%2==0)&&(number%4==0)){
                sum+=number;
            }
        }while(number%2==0); //çift sayı girildikçe devam et
        System.out.println("toplam: "+sum);
    }
}
