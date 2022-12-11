import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,openTaximeter=10,totalAmount;

        System.out.println("   ***Taximeter Program***");
        System.out.print("How Many Kilometers Traveled? : ");
        km = input.nextDouble();

        totalAmount = openTaximeter + km*2.20;

        totalAmount = (totalAmount<20)? 20 : totalAmount;

        System.out.println("//////////////////////////");
        System.out.println(km+" km traveled");
        System.out.println("Total Amount : "+totalAmount);
    }
}
