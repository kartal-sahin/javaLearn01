package J25_Exceotions;

public class C06_numberFormatException {
    public static void main(String[] args) {
        String icardi="1905";
        System.out.println("icardi = " + icardi);
        System.out.println("icardi+28 = " + icardi + 28);
        int vanda=Integer.parseInt(icardi);
        System.out.println("vanda = " + vanda);
        System.out.println("(vanda+28) = " + (vanda + 28));
        String id="12423k54857";

        try {
            int invalideId=Integer.parseInt(id);
            System.out.println("try calisti ");
        }catch (NumberFormatException e) {
            System.out.println("hata ayiklandi go on");
            id="12423454857";
           int invalideId=Integer.parseInt(id);
            System.out.println(invalideId);
        }
        System.out.println("hatasiz kul olmaz");
        System.out.println(id);

    }
}
