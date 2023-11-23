package J19_Constructor;

public class C03_Student {
    /*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */
    String ad ;
    String soyad ;
    int sınıf ;
    double ortalama ;
    int okulNo ;
    boolean takdirBelgesi;

    public C03_Student(String ad, String soyad, int sınıf, double ortalama, int okulNo, boolean takdirBelgesi) {
        this.ad = ad.toUpperCase();
        this.soyad = soyad.toUpperCase();
        this.sınıf = sınıf;
        this.ortalama = ortalama;
        this.okulNo = okulNo;
        this.takdirBelgesi = takdirBelgesi;
    }

    @Override
    public String toString() {
        return "C03_Student{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sınıf=" + sınıf +
                ", ortalama=" + ortalama +
                ", okulNo=" + okulNo +
                ", takdirBelgesi=" + takdirBelgesi +
                '}';
    }

    public static void main(String[] args) {
        C03_Student mezuniyet= new C03_Student("ahmet", "selim", 8, 60, 121, true);
        System.out.println(mezuniyet);
        mezuniyet1(mezuniyet);

    }

    private static void mezuniyet1(C03_Student mezuniyet) {

        if(mezuniyet.ortalama>=50){
            System.out.println("mezun oldunuuz...");
        }else System.out.println("kaldiniz");
        System.out.println(mezuniyet.takdirBelgesi);


    }
}
