import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int edge1,edge2;
        double edge3,u,perimeter,area;

        System.out.print("Enter the 1st edge length of the triangle : ");
        edge1 = input.nextInt();
        System.out.print("Enter the 2nd edge length of the triangle : ");
        edge2 = input.nextInt();

        edge3 = Math.sqrt((edge1*edge1)+(edge2*edge2)); //hypotenuse

        u = (edge1+edge2+edge3)/2;
        perimeter = 2*u;
        area = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));

        System.out.println("////////////////////////////");
        System.out.println("Hypotenuse Of Triangle : "+edge3);
        System.out.println("Perimeter Of Triangle : "+perimeter);
        System.out.println("Area Of Triangle : "+area);
    }
}