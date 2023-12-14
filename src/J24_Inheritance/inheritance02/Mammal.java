package J24_Inheritance.inheritance02;

public class Mammal extends Hayvancik {
    int m=1;
    int c=4;
    public Mammal(char y){
        super(34);

    }
    public Mammal(){
        this('H');
        System.out.println("Mammal dan parametreisiz cons...");
    }
    @Override
    public void mM(){
        System.out.println("mM--> MAMMAL da call edildi...");
    }
    public void mC(){
        System.out.println("mC-->MAMMAL da call edildi...");
    }


}
