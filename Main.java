import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price, priceWithKdv, kdv, amountKdv;

        System.out.print("Enter price : ");
        price = input.nextDouble();

        Double d = (price > 0 && price <= 1000) ? (kdv = 0.18) : (kdv = 0.08);

        priceWithKdv = price + (price * kdv);

        amountKdv = price * kdv;

        System.out.println("//////////////////////////////////");
        System.out.println("Price Entered In The Program: " + price);
        System.out.println("Rate Of Kdv: " + kdv);
        System.out.println("Amount Kdv: " + amountKdv);
        System.out.println("Price With Kdv: " + priceWithKdv);
    }
}