package J10_MethodCreation;

public class C03_methotDepo {//main method olmayan depo->komsu koy
    public  static void gecmeNotu(int not){
        if(not>=85){
            System.out.println("takdir belgesi kazandiniz");
        } else if (not>=70) {
            System.out.println("tesekkur belgesi kazandinniz");

        } else if (not>=50) {
            System.out.println("gecmis olsun");

        }else System.out.println("sinifta kaldin");


    }
}
