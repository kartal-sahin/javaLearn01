package J08_Loops;

public class C01_ForLoop {
    public static void main(String[] args) {
        //Loop duzenli tekrarlayan sabit actionlar icin tanimlanan code bloklaridir
        //41 kere masallah create eden code yaziniz
        //for (int i =41; i > 0; i-=5) {
          //  System.out.println(i+".  masallah");
        //}
//2 basamakli tek sayilari aralarinda bosluk ile create eden code yaziniz
        for (int i = 11; i <100 ; i+=2) {
            System.out.print( i + " ");

        }
        System.out.println();
        for(int i =0 ; i < 100 ; i++){
            if(i>9 && i%2==1){
                System.out.print(i + " ");
            }
        }
        /*
    Code standarts
  1) Tekrar (Repetition) olmamalidir
  2) Dynamic olmalidir
  3) Tamir (Fix) ve update kolay yapilabilmelidir
   */




    }
}
