//Object Class
public class Siswa {
    int absen;
    String nama;
    double nilai;

    public int getAbsen() {
        return this.absen;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return this.nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }

    // Constructor
    // nama harus sama dgn Class
    public Siswa() {
        absen = 0;
        nama = "kosong";
        nilai = 0.0;
    }

    // Constructor Parameter
    public Siswa(int absen, String nama, double nilai) {
        // variabel = parameter
        this.absen = absen;
        this.nama = nama;
        this.nilai = nilai;
    }

    // method print
    public void print() {
        System.out.println("Absen: " + absen);
        System.out.println("Nama: " + nama);
        System.out.println("Nilai: " + nilai);
    }

}
