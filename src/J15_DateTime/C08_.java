package J15_DateTime;

import java.time.LocalDate;
import java.time.Period;

public class C08_ {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        LocalDate slm=LocalDate.of(1985,7,11);
        Period p1=Period.between(slm,bugun);
        System.out.println("p1 = " + p1);
        System.out.println("p1.toTotalMonths() = " + p1.toTotalMonths());
        System.out.println("p1.getDays() = " + p1.getDays());

    }
}
