package J25_Exceotions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_datetime_ex {
    public static void main(String[] args) {




        try{
            LocalDate ld=LocalDate.of(2023, 12, 12);
            System.out.println(ld);
        }catch (DateTimeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("naber canim");

    }
}
