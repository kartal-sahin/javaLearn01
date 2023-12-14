package J25_Exceotions;

public class C03_classCasting {
    public static void main(String[] args) {
        Object obj="herkese Selam Olsun";
        System.out.println("obj = " + obj);
        String str= (String) obj;//obj data type string data type string olarak atandi
        System.out.println("str = " + str);
        Object sayi=89;
//        String sayiStr= (String) sayi;//
//        System.out.println("sayiStr = " + sayiStr);
        try{
            String sayiStr= (String) sayi;


        }catch (ClassCastException e){
            System.out.println("yapma pasam olmaz");
        }
        try{
            String str1= (String) sayi;


        }catch (ClassCastException e){
            System.out.println("pasam olmaz");
        }

        System.out.println("sorun yok pasam....");


    }
}
