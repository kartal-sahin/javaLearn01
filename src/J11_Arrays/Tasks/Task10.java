package J11_Arrays.Tasks;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

      int numArr[]={1,2,-3,4,-5,-6};
        for (int i = 0; i < numArr.length ; i++) {
            if(numArr[i]>0 || numArr[i]<0){
                numArr[i]=numArr[i]*=-1;
            }
        }
        System.out.println(Arrays.toString(numArr));
    }
}
