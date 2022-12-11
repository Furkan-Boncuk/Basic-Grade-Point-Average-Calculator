import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pear=2.14,apple=3.67,banana=0.95,tomatoes=1.11,eggplant=5.00,totalAmount;
        int p,a,b,t,e;

        System.out.println("***Welcome To Grocery Store***");
        System.out.print("How many kg of Pears did you buy : ");
        p = input.nextInt();
        System.out.print("How many kg of Apples did you buy : ");
        a = input.nextInt();
        System.out.print("How many kg of Bananas did you buy : ");
        b = input.nextInt();
        System.out.print("How many kg of Tomatoes did you buy : ");
        t = input.nextInt();
        System.out.print("How many kg of Eggplant did you buy : ");
        e = input.nextInt();

        totalAmount = (pear*p)+(apple*a)+(banana*b)+(tomatoes*t)+(eggplant*e);

        System.out.println("///////////////////////////");
        System.out.println("Total Amount : "+totalAmount+" $");
    }
}
