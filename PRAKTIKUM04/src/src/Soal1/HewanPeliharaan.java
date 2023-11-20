package Soal1;
import java.util.Scanner;
public class HewanPeliharaan {
    private String nama;
    private String ras;
    public HewanPeliharaan() {}
    public HewanPeliharaan(String r, String n) {
        this.nama = n;
        this.ras = r;
    }
    public String getNama() {
        return nama;
    }
    public String getRas() {
        return ras;
    }
    public void display() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = input.nextLine();
        System.out.print("Ras: ");
        String jenisRas = input.nextLine();
        HewanPeliharaan hewan1 = new HewanPeliharaan(jenisRas, namaHewan);
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + hewan1.getNama() +
                "\nDengan ras : " + hewan1.getRas());
    }
}
