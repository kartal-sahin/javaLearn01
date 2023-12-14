package J24_Inheritance.inheritance02;

public class Hayvancik {
    int a;
    int m=3;

    public Hayvancik() {
        System.out.println("Hayvancik PARAMETRESIZ cons. cagrildi");
    }


    public Hayvancik(int a) {
        System.out.println("hayvancik pArametreli creat edildi");

    }
    public void mA(){
        System.out.println("mA -->HAYVANcik class method call edildi");
    }
    public void mM(){
        System.out.println("mM --> HAYVANcik class method call edildi");
    }
}
