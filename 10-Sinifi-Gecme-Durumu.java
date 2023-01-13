import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double matematik,fizik,kimya,programlama,muhendisligeGiris,turkDili,tarih;
        double average;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik=input.nextInt();
        if(matematik>=0 && matematik<=100){
            System.out.print("Fizik Notunuzu Giriniz: ");
            fizik= input.nextInt();
            if(fizik>=0 && fizik<=100){
                System.out.print("Kimya Notunuzu Giriniz: ");
                kimya= input.nextInt();
                if(kimya>=0 && kimya<=100){
                    System.out.print("Programlama Notunuzu Giriniz: ");
                    programlama= input.nextInt();
                    if(programlama>=0 && programlama<=100){
                        System.out.print("Mühendisliğe Giriş Notunuzu Giriniz: ");
                        muhendisligeGiris= input.nextInt();
                        if(muhendisligeGiris>=0 && muhendisligeGiris<=100){
                            System.out.print("Türk Dili Notunuzu Giriniz: ");
                            turkDili= input.nextInt();
                            if(turkDili>=0 && turkDili<=100){
                                System.out.print("Tarih Notunuzu Giriniz: ");
                                tarih= input.nextInt();
                                if(tarih>=0){
                                    average=(matematik+fizik+kimya+programlama+muhendisligeGiris+turkDili+tarih)/7;
                                    if(average<55){
                                        System.out.println("Sınıfta Kaldınız: "+average);
                                    }else{
                                        System.out.println("Sınıfı Geçtiniz: "+average);
                                    }
                                }else{
                                    System.out.println("Geçersiz Not Girildi!");
                                }
                            }else{
                                System.out.println("Geçersiz Not Girildi!");
                            }
                        }else{
                            System.out.println("Geçersiz Not Girildi!");
                        }
                    }else{
                        System.out.println("Geçersiz Not Girildi!");
                    }
                }else{
                    System.out.println("Geçersiz Not Girildi!");
                }
            }else{
                System.out.println("Geçersiz Not Girildi!");
            }
        }else{
            System.out.println("Geçersiz Not Girildi!");
        }
    }
}
