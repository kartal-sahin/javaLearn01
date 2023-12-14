package J24_Inheritance.inheritance02;

public class Kedicik extends Mammal {
int c=2;
int d=7;
public Kedicik(){
    super();
    System.out.println("Kedicik pARAMETRESIZ  cons. call edildi..");
}
public Kedicik(String str){
    this();
    System.out.println("super.c = " + super.c);
    System.out.println("Kedicikten  1 parametli cons....");

    }
    public void mC(){
        System.out.println("mC--> kedicik class method call edildi");
    }

    public String toString() {
        return
                "c=" + c +
                ", d=" + d
              ;
    }
}

