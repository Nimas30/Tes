//Driver Class
import java.util.Scanner;

public class KaryawanTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inputkan Nama Karyawan: ");
        String nama = input.nextLine();
        System.out.println("Inputkan ID Karyawan: " );
        int id = input.nextInt();
        System.out.println("Inputkan Unit Karyawan: ");
      String unit = input.nextLine();
      System.out.println("Inputkan Alamat Karyawan: ");
      String alamat = input.nextLine();


        //object
       //Class object = new Constructor
       Karyawan Tia = new Karyawan ( 123, "Tia", "TU", "Malang");
       Karyawan Alex = new Karyawan ( 87, "Alex", "Kurikulum", "Surabaya");
       Karyawan Rudi = new Karyawan ( 9, "Rudi", "Kesiswaan", "Jember");
       Karyawan Suna = new Karyawan ( 7, "Suna", "BK", "Mojokerto");
       Karyawan Yasmin = new Karyawan ( 9, "Yasmin", "Sapras", "Sidoarjo");

       Tia.print();
       Alex.print();
       Rudi.print();
       Suna.print();
       Yasmin.print();

       input.close();
      

    }
}
