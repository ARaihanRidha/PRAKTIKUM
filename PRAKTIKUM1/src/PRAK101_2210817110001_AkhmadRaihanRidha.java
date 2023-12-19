import java.util.Scanner;
public class PRAK101_2210817110001_AkhmadRaihanRidha {
    public static void main(String[] args) {
        System.out.print("Masukkan Nama Lengkap : ");
        Scanner scanner= new Scanner(System.in);
        String namaLengkap=scanner.nextLine();
        System.out.print("Masukkan Tempat Lahir : ");
        String tempatLahir=scanner.nextLine();
        int[] tanggalLahirtinggiBadan= new int[5];
        System.out.print("Masukkan Tanggal Lahir : ");
        tanggalLahirtinggiBadan[0]=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Bulan lahir : ");
        String bulanLahir=scanner.nextLine();
        System.out.print("Masukkan Tahun Lahir : ");
        tanggalLahirtinggiBadan[1]=scanner.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        tanggalLahirtinggiBadan[2]=scanner.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        float beratBadan=scanner.nextFloat();
        System.out.println("Nama Lengkap " +namaLengkap+", Lahir di "+tempatLahir+" pada Tanggal "
                +tanggalLahirtinggiBadan[0]+" "+bulanLahir+" "+tanggalLahirtinggiBadan[1]+" Tinggi Badan "
                +tanggalLahirtinggiBadan[2]+"cm dan Berat Badan "+beratBadan+" kilogram");
    }
}
