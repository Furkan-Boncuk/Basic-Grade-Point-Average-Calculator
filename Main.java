import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double height,weight,bmi;

        System.out.print("Please Enter Your Height (in meters) : ");
        height = input.nextDouble();
        System.out.print("Enter Your Weight : ");
        weight = input.nextDouble();

        bmi = weight/(height*height);

        System.out.println("Your Body Mass Index : "+bmi);
    }
}
