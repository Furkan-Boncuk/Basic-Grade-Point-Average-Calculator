import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,number,counter=0;
        double sum=0,average;

        System.out.print("Bir Sayı Giriniz: ");
        number=input.nextInt();

        for(i=0;i<=number;i++){
            if((i%3==0)&&(i%4==0)){
                sum+=i;
                counter++;
            }
        }
        average=sum/counter;
        System.out.println("Ortalama : "+average);
    }
}
