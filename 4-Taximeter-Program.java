import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,perKm=2.20,openTaximeter=10,totalAmount;

        System.out.println("   ***Taximeter Program***");
        System.out.print("How Many Kilometers Traveled? : ");
        km = input.nextDouble();

        totalAmount = openTaximeter + km*perKm;

        totalAmount = (totalAmount<20)? 20 : totalAmount;

        System.out.println("//////////////////////////");
        System.out.println(km+" km traveled");
        System.out.println("Total Amount : "+totalAmount);
    }
}
