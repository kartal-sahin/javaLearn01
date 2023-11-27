package J21_Scope;

public class C01_Intancavariable1 {
    /*                                  INSTANCE VARIABLE

        1) Main method'un ve urettiginiz diger methodlarin disinda  disinda(ustunde veya altinda), class'in icinde
            olusturulan variable'lara non-Static Class level "instance variable" denir.
        2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
        3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
            Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
            Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
                "yas" variable'i initialize edildi, digerleri initialize edilmedi.
        4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                    byte, short, int, long icin default value 0'dir.
                    float, double --> default value 0.0'dir.
                    char --> default value ' ''dir.
                    boolean --> default value false'dur.
                    String --> default value "null" dir.

    */
    static  String kurs="Clarusway";
    static String prLanguage;
    int yas=49;
    boolean developer;
    double boy;
    char unvan;

    public static void main(String[] args) {
        int kg = 100;
        int id;
        //System.out.println(id);//deger atanmadigi icin CTE verdi.
        id = 1001;
        System.out.println("id = " + id);
        C01_Intancavariable1 obj = new C01_Intancavariable1();
        System.out.println("obj.unvan = " + obj.unvan);
        prLanguage = "Java";
        System.out.println("prLanguage = " + prLanguage);
        staticMethod();
        C01_Intancavariable1 obj1 = new C01_Intancavariable1();
        System.out.println("obj1.boy = " + obj1.boy);

    }
        public static void staticMethod () {
            System.out.println("static metohottan selamlar");
        }
        public void non_staticMethod () {
            System.out.println("non staticten selamlar");
        }

}
