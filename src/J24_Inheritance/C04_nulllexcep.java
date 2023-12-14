package J24_Inheritance;

public class C04_nulllexcep {
    public static void main(String[] args) {
        String str1="";
        System.out.println("str1.length() = " + str1.length());
        String str2=null;
        //System.out.println("str2.length() = " + str2.length());
        try{
            System.out.println("str2.length() = " + str2.length());

        }catch (NullPointerException e) {
            System.out.println("ex. firlatti  firlattii");
        }
        System.out.println("ne haber calistim ya...");
    }
}
