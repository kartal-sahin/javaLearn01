package J23_Encapsulation.encapsulation03;

public class arac {
     /*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
  */


    private String model;
    private String renk;
    private int motorHacmi;
    private int yil;

    public arac(String model, String renk, int motorHacmi, int yil) {
        this.model = model;
        this.renk = renk;
        setMotor(motorHacmi);
        //this.motorHacmi = motorHacmi;
        setYil(yil);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {

        return motorHacmi;
    }

    public void setMotor(int motor) {
        if (motorHacmi<1000){
            this.motorHacmi=1000;

        }else this.motorHacmi=motorHacmi;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if(yil<1990){
            System.out.println("agam sen git faytona bin");

        }else this.yil = yil;

    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", yil=" + yil
                ;
    }

    public arac() {
    }
}
