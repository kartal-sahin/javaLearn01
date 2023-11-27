package J21_Scope;

import J10_MethodCreation.C01_MethodCreation;
import J19_Constructor.C03_Student;

public class C04_Scope1 {



    public static void main(String[] args) {
    C01_InstanceVariable obj1=new C01_InstanceVariable();
    obj1.boy=178;
        System.out.println("obj1.boy = " + obj1.boy);
        C03_Student obj2=new C03_Student("ahmet","ali", 2, 12, 112, true);
        System.out.println("obj2 = " + obj2);
        C01_InstanceVariable.staticMethod();
        C01_MethodCreation.topla();



    }



}
