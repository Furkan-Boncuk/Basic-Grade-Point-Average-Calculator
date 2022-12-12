import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1,n2,select;

        System.out.print("Enter the 1st number : ");
        n1 = input.nextInt();
        System.out.print("Enter the 2nd number : ");
        n2 = input.nextInt();

        System.out.println("1-Summation\n2-Substraction\n3-Multiplication\n4-Division");
        System.out.print("Your choice : ");
        select = input.nextInt();
        switch(select){
            case 1:
                System.out.println("result : "+(n1+n2));
                break;
            case 2:
                System.out.println("result : "+(n1-n2));
                break;
            case 3:
                System.out.println("result : "+(n1*n2));
                break;
            case 4:
                if(n2==0){
                    System.out.println("! Math Error");
                }else{
                    System.out.println("result : "+(n1/n2));
                }
                break;
            default :
                System.out.println("! Invalid Choice");
                break;
        }
    }
}
