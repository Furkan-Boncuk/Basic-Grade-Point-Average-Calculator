import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,c,enBuyuk;
        System.out.print("1.sayıyı giriniz: ");
        a=input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        b=input.nextInt();
        System.out.print("3.sayıyı giriniz: ");
        c=input.nextInt();

        enBuyuk=c;
        if(a>enBuyuk) enBuyuk=a;
        if(b>enBuyuk) enBuyuk=b;

        if(enBuyuk==a){
            if(b>c){
                System.out.println(a+">"+b+">"+c);
            }else{
                System.out.println(a+">"+c+">"+b);
            }
        }else if(enBuyuk==b){
            if(a>c){
                System.out.println(b+">"+a+">"+c);
            }else{
                System.out.println(b+">"+c+">"+a);
            }
        }else{
            if(a>b){
                System.out.println(c+">"+a+">"+b);
            }else{
                System.out.println(c+">"+b+">"+a);
            }
        }
    }
}
