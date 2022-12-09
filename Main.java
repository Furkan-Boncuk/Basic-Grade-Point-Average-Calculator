import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int math,physics,chemistry,english,history,music;
        Scanner input = new Scanner(System.in);

        System.out.println("***Grade Point Average Calculator***");
        System.out.print("Your Math Grade : ");
        math = input.nextInt();
        System.out.print("Your Physics Grade : ");
        physics = input.nextInt();
        System.out.print("Your Chemistry Grade : ");
        chemistry = input.nextInt();
        System.out.print("Your English Grade : ");
        english = input.nextInt();
        System.out.print("Your History Grade : ");
        history = input.nextInt();
        System.out.print("Your Music Grade : ");
        music = input.nextInt();

        int sum = math+physics+chemistry+english+history+music;
        double average=sum/6.0;

        System.out.println("Your Grade Point Average : " + average);

        // Comparison without if else blocks
        String str = (average>=60)? "You Passed" : "You Failed";
        System.out.print("Your Situation : " + str);
    }
}
