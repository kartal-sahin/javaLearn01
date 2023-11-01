package J10_MethodCreation;

import static J10_MethodCreation.C03_methotDepo.gecmeNotu;

public class C03_MethodCreation {
    public static void main(String[] args) {
        selamVer();
    }

    private static void selamVer() {
        System.out.println("benim koyum");
        C03_methotDepo.gecmeNotu(40);
        gecmeNotu(90);
    }
}
