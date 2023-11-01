package J05_ifStatementTernaryOperators.tasks;

public class _05_if_statement {
    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        double number1 = 90.25;
        double number2 = 90.25;
        if (number1 > number2) {
            System.out.println("Hello World");
        }else if (number1 < number2) {
            System.out.println("Not Hello World");
        }else{
            System.out.println("I love java");
        }
    }
}
