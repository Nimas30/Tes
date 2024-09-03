//Driver Class
import java.util.Scanner;

public class CarTester {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println(" Inputkan Nama Mobil : ");
        // String jenismobil = input.nextLine();
        // System.out.println(" Inputkan Tahun Pembuatan : ");
        // int tahunpembuatan = input.nextInt();

        //Object
        //Class object = new Constructor
        Car Camaro = new Car("Camaro", 2000);
        Car Civic = new Car("Civic", 1980);
        Car Rush = new Car("Rush", 2010);

        Car mobilTua = null;

       if (Camaro.getTahunpembuatan() <= Civic.getTahunpembuatan() && Camaro.getTahunpembuatan() <= Rush.getTahunpembuatan()) {
        mobilTua = Camaro;


       } else if (Civic.getTahunpembuatan() <= Camaro.getTahunpembuatan() && Civic.getTahunpembuatan() <= Rush.getTahunpembuatan()) {
        mobilTua = Civic;
       } else if (Rush.getTahunpembuatan() <= Civic.getTahunpembuatan() && Rush.getTahunpembuatan() <= Camaro.getTahunpembuatan()) {
        mobilTua = Rush;
       }
        mobilTua.print();
        // Camaro.print();
        // Civic.print();
        // Rush.print();

    //    input.close();

    }
    
}
