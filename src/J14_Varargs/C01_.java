package J14_Varargs;

public class C01_ {
    public static void main(String[] args) {
        /*
        VARARGS :
        var----variety: cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

           1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
          2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...

  */
        int num1=19;
        int num2=9;
        int num3=29;
        int num4=92;
        toplama(num2,num1, num3,num4,12,15);

        enfazlaKarakter("ramazan","mehmet","selim","aysegu","ali");


    }

    private static void enfazlaKarakter(String...str) {
        String enUzn="";
        for(String avuc:str){
            if(avuc.length()>enUzn.length()){
                enUzn=avuc;
            }


        }System.out.println(enUzn);
    }

    private static void toplama(int...i) {
        int toplam=0;
        for(int avuc:i){
            toplam+=avuc;

        }
        System.out.println(toplam);
    }


}
