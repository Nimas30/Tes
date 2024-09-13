package persewaan;
//Driver Class

import java.util.Scanner;

public class ProductTester {
    public static void main(String[] args) {
        // object
        Scanner in = new Scanner(System.in);
        System.out.println("Mau membuat berapa objek ?");
        try {
            int jumlah = in.nextInt();
            System.out.println(" Jumlah : " + jumlah);

        } catch (Exception e) {
            System.out.println(" Tipe data salah ");

        }
        System.out.println(" Pilih CD/DVD ? ");
        String pilihan = in.next();

        if (pilihan.equals("CD")) {
            CD c = new CD();
            c.print();
        } else if (pilihan.equals("DVD")) {
            DVD d = new DVD();
            d.print();

        } else {
            System.out.println(" Error ");
        }
        in.close();

    }

}
