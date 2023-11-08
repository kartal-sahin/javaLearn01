package J11_Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String str="Hello World";
        //System.out.println(str.replace("o", "K"));
        String strArr[]=str.split("");
        for (int i = 0; i <strArr.length ; i++) {
            System.out.print(strArr[i].replace("o", "K"));

        }

    }
}