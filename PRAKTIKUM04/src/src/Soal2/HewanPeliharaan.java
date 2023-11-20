package Soal2;
public class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    public void display() {
        System.out.println("Detail Hewan Peliharaan : \n Nama Hewan Peliharaanku adalah : "+nama+"\ndengan ras : "+ras);
    }
}
