package J23_Encapsulation.encapsulation03;

public class aracRunner {
    public static void main(String[] args) {

        arac a1=new arac();
        System.out.println(a1);
        a1.setModel("volvo s40");
        a1.setRenk("mavi");
        a1.setYil(2019);
        a1.setMotor(2000);
        System.out.println(a1);

        arac a2=new arac("mercedes","beyaz melek",234,999);
        System.out.println(a2.getModel());
        System.out.println(a2.getYil());
        System.out.println(a2.getMotor());
        System.out.println(a2.getRenk());
    }
}
