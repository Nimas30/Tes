//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
       //object
       //Class object = new Constructor
       Siswa Azzahra = new Siswa(); 
       Siswa Destina = new Siswa();
       Siswa Latisa = new Siswa();
       Siswa Nimas = new Siswa();
       Siswa Talitha = new Siswa();
       
       Azzahra.nama = "Zea cantik";
       Destina.nama = "Desti cantik";
       Latisa.nama = "Sasa cantik";
       Nimas.nama = "nimas cantik";
       Talitha.nama = "Litha cantik";

       Azzahra.absen = 6;
       Destina.absen = 7;
       Latisa.absen = 17;
       Nimas.absen = 30;
       Talitha.absen = 33;

       Azzahra.nilai = 98;
       Destina.nilai = 97;
       Latisa.nilai = 96;
       Nimas.nilai = 95;
       Talitha.nilai = 94;

       System.out.println("Nama : " + Azzahra.nama);
       System.out.println("Absen : " + Azzahra.absen);
       System.out.println("Nilai : " + Azzahra.nilai);

       System.out.println("Nama : " + Destina.nama);
       System.out.println("Absen : " + Destina.absen);
       System.out.println("Nilai : " + Destina.nilai);
       
       System.out.println("Nama : " + Latisa.nama);
       System.out.println("Absen : " + Latisa.absen);
       System.out.println("Nilai : " + Latisa.nilai);

       System.out.println("Nama : " + Nimas.nama);
       System.out.println("Absen : " + Nimas.absen);
       System.out.println("Nilai : " + Nimas.nilai);

       System.out.println("Nama : " + Talitha.nama);
       System.out.println("Absen : " +  Talitha.absen);
       System.out.println("Nilai : " +  Talitha.nilai);

    }
    
}
