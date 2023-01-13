import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int month,day;
        String burc;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı girin: ");
        month=input.nextInt();
        System.out.print("Doğduğunuz günü girin: ");
        day=input.nextInt();

        if(1<=month && month<=12){
            if(month==1){
                if(day>=1 && day<=31){
                    if(22 <= day && day <= 31) {
                        burc = "kova";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "oğlak";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//ocak ayı
            if(month==2){
                if(day>=1 && day<=28){
                    if(20 <= day && day <= 28) {
                        burc = "balık";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "kova";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//şubat ayı
            if(month==3){
                if(day>=1 && day<=31){
                    if(21 <= day && day <= 31) {
                        burc = "koç";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "balık";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//mart ayı
            if(month==4){
                if(day>=1 && day<=30){
                    if(21 <= day && day <= 30) {
                        burc = "boğa";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "koç";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//nisan ayı
            if(month==5){
                if(day>=1 && day<=31){
                    if(21 <= day && day <= 31) {
                        burc = "ikizler";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "boğa";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//mayıs ayı
            if(month==6){
                if(day>=1 && day<=30){
                    if(23 <= day && day <= 30) {
                        burc = "yengeç";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "ikizler";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//haziran ayı
            if(month==7){
                if(day>=1 && day<=31){
                    if(23 <= day && day <= 31) {
                        burc = "aslan";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "yengeç";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//temmuz ayı
            if(month==8){
                if(day>=1 && day<=31){
                    if(23 <= day && day <= 31) {
                        burc = "başak";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "aslan";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//ağustos ayı
            if(month==9){
                if(day>=1 && day<=30){
                    if(23 <= day && day <= 30) {
                        burc = "terazi";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "başak";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//eylül ayı
            if(month==10){
                if(day>=1 && day<=31){
                    if(23 <= day && day <= 31) {
                        burc = "akrep";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "terazi";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//ekim ayı
            if(month==11){
                if(day>=1 && day<=30){
                    if(22 <= day && day <= 30) {
                        burc = "yay";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "akrep";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//kasım ayı
            if(month==10){
                if(day>=1 && day<=31){
                    if(22 <= day && day <= 31) {
                        burc = "oğlak";
                        System.out.println("Burcunuz: " + burc);
                    }else{
                        burc = "yay";
                        System.out.println("Burcunuz: "+burc);
                    }
                }else{
                    System.out.println("Hatalı gün değeri!");
                }
            }//aralık ayı
        }else{
            System.out.println("Hatalı ay değeri!");
        }
    }
}
