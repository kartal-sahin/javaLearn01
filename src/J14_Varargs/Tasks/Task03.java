package J14_Varargs.Tasks;

public class Task03 {
    public static void main(String[] args) {
         /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        String str2 = "perfect javacı Abdulhamit";//
        String str3 = "beleştepe muhtarı CEREN";//
        System.out.println("sayiCArpenuznHArf(sayi1,str1,str2,str3) = " + sayiCArpenuznHArf(sayi1, str1, str2, str3));

    }

    private static int sayiCArpenuznHArf(int sayi1, String...str) {
        String enUzun="";
        for(String avuc : str){
            if(avuc.length()>enUzun.length()){
                enUzun=avuc;
            }

        }
        System.out.println("enUzun = " + enUzun);
        enUzun=enUzun.replace(" ","");
        System.out.println("enUzun = " + enUzun);
        return sayi1*(enUzun.length());
    }
}
