package J10_MethodCreation;

public class C01_MethodCreation {//class level
    public static void main(String[] args) {//main level
         /*
    code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
    main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
    1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
    parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

    str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                          bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                          bana rapor olarak ne getirdigini bilmem lazim (true/false)

    2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

    3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
       de oldugu gibi
       disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
       deklare edilmeli

       method call edildiğinde  Parametre olarak
       declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
*/

selam();
topla();


    }//main sonu

    private static void selam() {
        System.out.println("dayiya selam");
    }

    //methodlar class ici main disina tanimlanir.
    public static void topla(){
        int a=5;
        int b=8;
        System.out.println((a + b));

    }
}//class sonu
