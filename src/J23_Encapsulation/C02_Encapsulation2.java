package J23_Encapsulation;

public class C02_Encapsulation2 {//pojo class
     /*
Java'da POJO, "Plain Old Java Object" kısaltmasıyla bilinen, temel bir Java sınıfıdır.
Bu sınıflar, verileri ve onların işlemlerini tutmak için kullanılır ve genellikle bir
veritabanı veya bir dosya gibi dış kaynaklardan veri almak veya onlara veri yazmak için
kullanılır. POJO'lar, sadece getter ve setter metodları ile erişilen özelliklere sahip
basit bir data objesi olabilirler. POJO'lar, genellikle diğer objeler veya bileşenlerle
 işbirliği yapmak için kullanılırlar ve bu nedenle data aktarım objeleri (DTO) olarak da adlandırılabilirler.
 */
    String name="Sebnem";
    private int id=1001;
    private String mail="wer_nh@gmail.com";
    String surname="yakisikli";

    public C02_Encapsulation2(String name, int id, String mail, String surname) {
        this.name = name;
        this.id = id;
        this.mail = mail;
        this.surname = surname;
    }

    public C02_Encapsulation2() {
    }
//    public int idVer(){
//        return id;
//    }
//    public String mailVer(){
//        return mail;
//    }

    public int getId() {
        return id;
    }

    public String getMail() {
        return mail;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id +
                ", mail='" + mail + '\'' +
                ", surname='" + surname + '\''
                ;
    }
}
