import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r,π=3.14,𝛼,area;

        System.out.print("Enter The Radius Of The Circle Segment : ");
        r = input.nextDouble();
        System.out.print("Enter The Angle Of The Circle Segment : "); // 𝛼
        𝛼 = input.nextDouble();

        area = (π * (r*r) * 𝛼) / 360;

        System.out.println("Area Of The Circle Segment : "+area);
    }
}
