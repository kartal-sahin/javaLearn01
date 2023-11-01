package J07_StringManipulation.tasks;

public class Task08 {
    public static void main(String[] args) {
        /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(harfDepo);

        char birinci=harfDepo.charAt(harfDepo.indexOf('R'));
        char ikinci=harfDepo.charAt(harfDepo.indexOf('A'));
        char ucuncu=harfDepo.charAt(harfDepo.indexOf('M'));
        char dorduncu=harfDepo.charAt(harfDepo.indexOf('Z'));
        char besinci=harfDepo.charAt(harfDepo.indexOf('A'));
        System.out.println(""+birinci + ikinci + ucuncu + dorduncu + besinci);

        System.out.println(""+harfDepo.charAt(harfDepo.indexOf('R')) + harfDepo.charAt(harfDepo.indexOf('A')));
    }
}
