package J23_Encapsulation.encapsulation02;

public class kisiRunner {
    public static void main(String[] args) {
        kisi obj1=new kisi("ahmet","selim",12, "qwre123");
        System.out.println(obj1.getAd());
        System.out.println(obj1.getSoyad());
        System.out.println(obj1.getYas());
        System.out.println(obj1.getPassword());
        obj1.setAd("mehmet");
        System.out.println(obj1.getAd());

    }
}

