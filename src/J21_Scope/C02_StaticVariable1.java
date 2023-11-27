package J21_Scope;

public class C02_StaticVariable1 {
    /*  instance variable'lar obje'ye bagimlidir ve her obje farkli degerler alabilir
    ogrenci notlari veya ogretmen branslari gibi
    bir objeye ait bir variable'in son degerini bulmak icin sadece o objeyi dikkate alınır

   Static variabler ise class variable olarak tanimlanir
   ve değeri tum class uyeleri icin sabittir. Okul ismi, okul mudurunun adi gibi
   eger static variable'in degeri degistirilirse herkes icin degisir.-> güneş misali

 */
    static  String firmaIsmi="Clarusway";
    static int firmaId;
    static boolean firmaIt;


    public static void main(String[] args) {
        System.out.println("firmaIt = " + firmaIt);
        firmaIt=true;
        System.out.println("firmaIt = " + firmaIt);
        System.out.println("C02_StaticVariable.firmaIsmi = " + C02_StaticVariable1.firmaIsmi);
        staticMethod();

    }
    public static void staticMethod() {//static method->uzaylı
        firmaId=1001;
        System.out.println("firmaId = " + firmaId);
        System.out.println("Agama static methoddan selamkeee :)");
    }

    public void non_staticMethod() {//non static method->sefil dunyalı
        System.out.println("firmaIsmi = " + firmaIsmi);
        System.out.println("Agama static non_staticMethod selamkeee :)");
    }
}
