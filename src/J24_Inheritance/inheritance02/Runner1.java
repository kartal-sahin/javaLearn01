package J24_Inheritance.inheritance02;

public class Runner1 {
    public static void main(String[] args) {
       Kedicik obj1=new Kedicik();
//       Kedicik obj2=new Kedicik("ali");
//        Mammal obj3=new Kedicik();
//        System.out.println(obj1.toString());
        System.out.println("obj1.a = " + obj1.a);
        System.out.println("obj1.c = " + obj1.c);
        System.out.println("obj1.d = " + obj1.d);
        System.out.println("obj1.m = " + obj1.m);
        System.out.println("      ******        ");
        Mammal obj2=new Kedicik("zuzo");
        System.out.println("obj2.a = " + obj2.a);
        System.out.println("obj2.c = " + obj2.c);
        System.out.println("obj2.m = " + obj2.m);
        System.out.println("      ******        ");
        Hayvancik obj3=new Kedicik("pammik");
        System.out.println("obj3.m = " + obj3.m);
        System.out.println("obj3.a = " + obj3.a);
        System.out.println("      ******        ");
        /*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
 Variable araştırmaya data type Class'dan başlanıp parentlere gidilir
 */
     System.out.println("      ******        ");
     obj1.mA();
     obj1.mM();
     obj1.mC();
     System.out.println("      ******        ");
     obj2.mA();
     obj2.mM();
     obj2.mC();
     System.out.println("      ******        ");
     obj3.mA();
     obj3.mM();




    }
}
