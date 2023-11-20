package Soal2;
import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Pilih jenis hewan yang ingin diinputkan");
        System.out.println("1 = Kucing");
        System.out.println("2 = Anjing");
        System.out.print("Masukkan pilihan : ");
        Scanner input = new Scanner(System.in);
        String pilihan = input.nextLine();
        System.out.print("Nama Hewan Peliharaan: ");
        String namaHewan = input.nextLine();
        System.out.print("Ras: ");
        String jenisRas = input.nextLine();
        System.out.print("Warna Bulu : ");
        String warnaBulu=input.nextLine();
        if (Objects.equals(pilihan, "2")){
            System.out.print("Kemampuan : ");
            String[] kemampuan= input.nextLine().split(", ");
            Anjing anjing1 = new Anjing(jenisRas, namaHewan, warnaBulu, kemampuan);
            anjing1.displayDetailAnjing();
        }else if (Objects.equals(pilihan, "1")){
            Kucing kucing1 = new Kucing(jenisRas, namaHewan, warnaBulu);
            kucing1.displayDetailKucing();
        }
    }
}
