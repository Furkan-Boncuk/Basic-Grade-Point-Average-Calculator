import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int tarih;
        String burc;
        System.out.print("Doğum yılınızı giriniz: ");
        tarih=input.nextInt();

        if(tarih%12==0){
            burc="Maymun";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==1){
            burc="Horoz";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==2){
            burc="Köpek";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==3){
            burc="Domuz";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==4){
            burc="Fare";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==5){
            burc="Öküz";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==6){
            burc="Kaplan";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==7){
            burc="Tavşan";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==8){
            burc="Ejderha";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==9){
            burc="Yılan";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==10){
            burc="At";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
        if(tarih%12==11){
            burc="Koyun";
            System.out.println("Çin Zodyağı Burcunuz: "+burc);
        }
    }
}
