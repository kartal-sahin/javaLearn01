package J24_Inheritance;

import java.util.Scanner;

public class newhomework {
    /*
int v  - int f  isminde 2 adet parametresi olan 'ortalama' isminde bir method create ediniz.
  int v = vize
  int f = final

  Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
  Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını return edin.
  Diğer durumlarda ise,
  vizenin yüzde 40 ını, finalin yüzde 60 toplayarak ortalama hesplayan pr create ediniz.
  vizeye 120, finale 80 girin.

  Programın çalışmasını sağlayın. (handle edin)
   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int vize;
        int finl;
        while(true){
            try{
                System.out.println("vize notunu giriniz");
                vize= scan.nextInt();
                if(vize<0||vize>100){
                    throw new ArithmeticException("notlar 0-100 arasinda olmali");
                }else break;
            }catch (ArithmeticException e){
                System.out.println("hatali giris yaptiniz "+e.getMessage());
            }
        }
        while(true){
            try{
                System.out.println("final notunu giriniz");
                finl= scan.nextInt();
                if(finl<0||finl>100){
                    throw new ArithmeticException("notlar 0-100 arasinda olmali");
                }else break;
            }catch (ArithmeticException e){
                System.out.println("hatali giris yaptiniz "+e.getMessage());
            }
        }
        System.out.println("ortlamaniz =   " + ortlama(vize, finl));
    }
    public static double ortlama(int v,int f){
        return(v*0.4+f*0.6);
    }
}
