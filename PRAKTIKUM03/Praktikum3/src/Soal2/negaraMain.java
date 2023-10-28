package Soal2;
import java.util.*;
public class negaraMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahRun = input.nextInt();
        Collection<negara> daftarNegara = new ArrayList<>();
        HashMap<Integer, String> bulanDalamMap = new HashMap<>();
        bulanDalamMap.put(1, "Januari");
        bulanDalamMap.put(2, "Februari");
        bulanDalamMap.put(3, "Maret");
        bulanDalamMap.put(4, "April");
        bulanDalamMap.put(5, "Mei");
        bulanDalamMap.put(6, "Juni");
        bulanDalamMap.put(7, "Juli");
        bulanDalamMap.put(8, "Agustus");
        bulanDalamMap.put(9, "September");
        bulanDalamMap.put(10, "Oktober");
        bulanDalamMap.put(11, "November");
        bulanDalamMap.put(12, "Desember");
        String jenispemimpin=null;
        for (int i = 0; i < jumlahRun; i++) {

            Scanner scan = new Scanner(System.in);
            String nama = scan.nextLine();
            jenispemimpin = scan.nextLine();
            String namapemimpin = scan.nextLine();
            if (Objects.equals(jenispemimpin, "Monarki")){
                negara Negara = new negara(nama, jenispemimpin, namapemimpin, 0, null,0);
                daftarNegara.add(Negara);
            }else {
                int tanggal = scan.nextInt();
                scan.nextLine();
                int nomorBulan = scan.nextInt();
                String namaBulan = bulanDalamMap.get(nomorBulan);
                int tahun = scan.nextInt();
                scan.nextLine();
                negara Negara = new negara(nama, jenispemimpin, namapemimpin, tanggal, namaBulan, tahun);
                daftarNegara.add(Negara);
            }
        }
        for (negara Negara : daftarNegara) {
            if (!Objects.equals(Negara.getJenis_kepemimpinan(), "Monarki")){
            System.out.println("Negara " + Negara.getNama() + " mempunyai "+Negara.getJenis_kepemimpinan()+" bernama " + Negara.getNamaPemimpin() +
                    " Deklarasi Kemerdekaan pada Tanggal " + Negara.getTanggalKemerdekaan() + " " +
                    Negara.getBulanKemerdekaan() + " " + Negara.getTahunKemerdekaan());
            }else if (Objects.equals(Negara.getJenis_kepemimpinan(), "Monarki")){
                System.out.println("Negara " + Negara.getNama() + " mempunyai Raja bernama " + Negara.getNamaPemimpin());
            }
        }
    }
}

