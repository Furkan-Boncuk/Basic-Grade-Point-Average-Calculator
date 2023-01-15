import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,r,faktN=1,faktR=1,faktNR=1,c;
        System.out.print("C(n,r) olmak üzere n sayısını giriniz: ");
        n=input.nextInt();
        System.out.print("C(n,r) olmak üzere r sayısını giriniz: ");
        r=input.nextInt();
        //C(n,r) = n! / (r! * (n-r)!)
        for(int i=1;i<=n;i++){
            faktN*=i;
        } //n!
        for(int i=1;i<=r;i++){
            faktR*=i;
        } //r!
        for(int i=1;i<=(n-r);i++){
            faktNR*=i;
        }
        c=faktN/(faktR*faktNR);
        System.out.println("Kombinasyon İşleminin Sonucu: "+c);
    }
}
