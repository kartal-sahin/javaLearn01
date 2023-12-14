package J25_Exceotions;

import java.io.FileInputStream;
import java.io.IOException;

public class C02_FileInputsteremexcep02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/J25_Exceotions/dara dusme");

        int k;
        while ((k = fis.read())!=-1) {
            System.out.print((char) k);

        }
    }



}
