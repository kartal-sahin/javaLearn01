package J15_DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class C01_ {
    public static void main(String[] args) {
        LocalDate bugun=LocalDate.now();
        System.out.println(bugun.getChronology());
        LocalTime Suan=LocalTime.now();
        System.out.println(Suan.getHour()+":"+Suan.getMinute()+":"+Suan.getSecond());




    }

}
