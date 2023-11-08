package J14_Varargs;

public class Task001 {
    public static void main(String[] args) {
        /*
Task -> verilen Stringleri birlestiren concat isimli METHOD create ediniz.

input : "h", "a", "l", "u", "k";
output : haluk

input : "a", "l", "i";
output : ali

 */
        varConcats("h", "a", "l", "u", "k");


    }

    private static void varConcats(String...i) {
        String isim="";
        for(String avuc:i) {
            isim=isim.concat(avuc);
        }
        System.out.println("isim = " + isim);
    }
}
