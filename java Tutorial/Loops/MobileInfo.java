import java.util.Scanner;

class Mobile {

    String MobComponyname;
    String Modelname;
    String Ram;
    String Rom;
    int LounchYear;

    void Setdata() {

        Scanner m1 = new Scanner(System.in);
        System.out.println("Enter the MobComponyname ");
        MobComponyname = m1.next();
        System.out.println("Enter the Modelname ");
        Modelname = m1.next();
        System.out.println("Enter the ram");
        Ram = m1.next();
        System.out.println("Enter the rom");
        Rom = m1.next();
        System.out.println("Enter the LounchYear ");
        LounchYear = m1.nextInt();
    }

    void Getdata() {
        System.out.println("MobComponyname: " + MobComponyname);
        System.out.println("Modelname: " + Modelname);
        System.out.println("ram: " + Ram);
        System.out.println("rom: " + Rom);
        System.out.println("LounchYear: " + LounchYear);
    }
}

public class MobileInfo {
      Mobile m2 = new Mobile();
    public static void main(String[] args) {
      
        m2.Setdata();
        m2.Getdata();
    }
}
