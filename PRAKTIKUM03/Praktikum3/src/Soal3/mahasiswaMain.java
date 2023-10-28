package Soal3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
public class mahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        Collection<Mahasiswa> listMHS = new ArrayList<Mahasiswa>();
        Mahasiswa mahasiswa = null;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Tambah Mahasiswa ");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM ");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = input.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Telah Memilih Tambah Mahasiswa");
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    input.nextLine();
                    String Nama=input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik) : ");
                    String NIMMhs=input.next();
                    boolean NIMudahAda = false;
                    for (Mahasiswa mhs : listMHS) {
                        if (mhs.getNIM().equals(NIMMhs)) {
                            NIMudahAda = true;
                            break;
                        }
                    }
                    if (NIMudahAda) {
                        System.out.println("Mahasiswa dengan NIM " + NIMMhs + " sudah ada.");
                    } else {
                        mahasiswa = new Mahasiswa(Nama, NIMMhs);
                        listMHS.add(mahasiswa);
                        System.out.println("Mahasiswa " + Nama + " telah ditambahkan.");
                    }
                    break;
                case 2:
                    System.out.println("Telah memilih hapus mahasiswa");
                    System.out.print("Masukkan NIM : ");
                    String NIMtoHapus=input.next();
                    for (Mahasiswa mhs : listMHS) {
                        if (mhs.getNIM().equals(NIMtoHapus)) {
                            listMHS.remove(mhs);
                            System.out.println("Mahasiswa dengan NIM " + NIMtoHapus + " yaitu "+ mhs.getNama()+" telah dihapus.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("Telah memilih Mencari mahasiswa");
                    System.out.print("Masukkan NIM : ");
                    String NIMcari=input.next();
                    for (Mahasiswa mhs : listMHS) {
                        if (mhs.getNIM().equals(NIMcari)) {
                            System.out.println("Mahasiswa dengan NIM " + NIMcari + " yaitu "+ mhs.getNama()+" telah ditemukan.");
                            break;
                        }else if (!mhs.getNIM().equals(NIMcari)){
                            System.out.println("Mahasiswa dengan NIM : "+NIMcari+" yang dicari tidak dapat ditemukan");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Anda telah memilih Tampilkan Seluruh Mahasiswa");
                    for (Mahasiswa mhs : listMHS) {
                        System.out.print("NIM: " +mhs.getNIM() +",");
                        System.out.print("Nama: " +mhs.getNama() );
                        System.out.println();
                        System.out.println("----------------------");
                    }
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }
}

