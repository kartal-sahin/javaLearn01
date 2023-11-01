package J08_Loops.Tasks;

public class TAsk04 {
    public static void main(String[] args) {
        int sayac=999;
        int sayac1=0;
        while(sayac>99){
            if(sayac%12==0){

                System.out.println(sayac);
                sayac1++;
            }

            sayac--;
        }
        System.out.println(sayac1);


    }
}
