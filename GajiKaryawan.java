import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        
        double jumlahJamKerja, tarifperjam, potonganPajak, totalGajiKaryawan;

       Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah jam kerja: ");
        jumlahJamKerja = input.nextDouble();
        System.out.println("Masukkan tarif per jam: ");
        tarifperjam = input.nextDouble();
        System.out.println("Masukkan potongan pajak: ");
        potonganPajak = input.nextDouble();
       
        totalGajiKaryawan=jumlahJamKerja*tarifperjam;
      potonganPajak=(potonganPajak/100)*totalGajiKaryawan;
      totalGajiKaryawan=totalGajiKaryawan-potonganPajak;
      System.out.println("Total Gaji Karyawan : "+totalGajiKaryawan);
      
    }
}
