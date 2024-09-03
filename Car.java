//Object Class
public class Car {
    private String jenismobil;
    private int tahunpembuatan;

    public String getJenismobil() {
        return this.jenismobil;
    }

    public void setJenismobil(String jenismobil) {
        this.jenismobil = jenismobil;
    }

    public int getTahunpembuatan() {
        return this.tahunpembuatan;
    }

    public void setTahunpembuatan(int tahunpembuatan) {
        this.tahunpembuatan = tahunpembuatan;
    }

    //Constructor Parameter
    public Car (String jenismobil, int tahunpembuatan ) {
        //variabel = parameter
        this.jenismobil = jenismobil;
        this.tahunpembuatan = tahunpembuatan;

    }

    //method print
    public void print() {
        System.out.println("Jenis Mobil : "+ jenismobil);
        System.out.println("Tahun Pembuatan : "+ tahunpembuatan);
    }
}
